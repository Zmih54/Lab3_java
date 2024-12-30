import java.util.Arrays;

/**
 * Клас, що представляє будівельний блок у грі.
 */
class BuildingBlock implements Comparable<BuildingBlock> {
    private String name;        // Назва блоку
    private int durability;     // Міцність блоку
    private double hardness;    // Твердість блоку
    private boolean isTransparent; // Чи є блок прозорим
    private String material;    // Матеріал блоку

    /**
     * Конструктор для створення блоку.
     *
     * @param name назва блоку
     * @param durability міцність блоку
     * @param hardness твердість блоку
     * @param isTransparent чи є блок прозорим
     * @param material матеріал блоку
     */
    public BuildingBlock(String name, int durability, double hardness, 
                        boolean isTransparent, String material) {
        this.name = name;
        this.durability = durability;
        this.hardness = hardness;
        this.isTransparent = isTransparent;
        this.material = material;
    }

    // Геттери
    public String getName() {
        return name;
    }

    public int getDurability() {
        return durability;
    }

    public double getHardness() {
        return hardness;
    }

    public boolean isTransparent() {
        return isTransparent;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return String.format("Block{name='%s', durability=%d, hardness=%.1f, " +
                           "transparent=%b, material='%s'}", 
                           name, durability, hardness, isTransparent, material);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        BuildingBlock that = (BuildingBlock) obj;
        return durability == that.durability &&
               Double.compare(that.hardness, hardness) == 0 &&
               isTransparent == that.isTransparent &&
               name.equals(that.name) &&
               material.equals(that.material);
    }

    @Override
    public int compareTo(BuildingBlock other) {
        return Integer.compare(this.durability, other.durability);
    }
}

/**
 * Головний клас програми для роботи з будівельними блоками.
 */
public class BlockManager {
    /**
     * Виконавчий метод програми.
     *
     * @param args аргументи командного рядка (не використовуються)
     */
    public static void main(String[] args) {
        // Створення масиву блоків
        BuildingBlock[] blocks = {
            new BuildingBlock("Stone", 100, 1.5, false, "Rock"),
            new BuildingBlock("Glass", 30, 0.3, true, "Sand"),
            new BuildingBlock("Wood", 60, 0.8, false, "Tree"),
            new BuildingBlock("Diamond Block", 150, 3.0, false, "Diamond"),
            new BuildingBlock("Ice", 40, 0.5, true, "Water")
        };

        // Виведення початкового масиву
        System.out.println("Початковий масив:");
        printBlocks(blocks);

        // Сортування за міцністю (зростання)
        Arrays.sort(blocks);
        System.out.println("\nВідсортовано за міцністю (зростання):");
        printBlocks(blocks);

        // Сортування за твердістю (спадання)
        Arrays.sort(blocks, (b1, b2) -> Double.compare(b2.getHardness(), b1.getHardness()));
        System.out.println("\nВідсортовано за твердістю (спадання):");
        printBlocks(blocks);

        // Пошук конкретного блоку
        BuildingBlock searchBlock = new BuildingBlock("Glass", 30, 0.3, true, "Sand");
        boolean found = false;
        
        for (BuildingBlock block : blocks) {
            if (block.equals(searchBlock)) {
                System.out.println("\nЗнайдено шуканий блок:");
                System.out.println(block);
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("\nШуканий блок не знайдено.");
        }
    }

    /**
     * Допоміжний метод для виведення масиву блоків.
     *
     * @param blocks масив блоків для виведення
     */
    private static void printBlocks(BuildingBlock[] blocks) {
        for (BuildingBlock block : blocks) {
            System.out.println(block);
        }
    }
}