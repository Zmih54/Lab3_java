# Інструкція з використання програми

### Опис програми BlockManager

Програма **BlockManager** створена для роботи з будівельними блоками у вигляді об'єктів класу **BuildingBlock**. Вона демонструє створення, сортування та пошук блоків за різними характеристиками.

### Основні можливості програми:
1. **Створення блоків**
   - Генерує масив блоків з різними характеристиками, такими як міцність, твердість, прозорість і матеріал.

2. **Сортування блоків**
   - За міцністю (зростання).
   - За твердістю (спадання).

3. **Пошук блоку**
   - Перевіряє наявність конкретного блоку в масиві за його характеристиками.

4. **Виведення результатів**
   - Показує блоки до і після сортування, а також результат пошуку.


### Опис класів і методів

**1. Клас `BuildingBlock`:**  
Представляє будівельний блок з наступними характеристиками:
- **name** - назва блоку.
- **durability** - міцність.
- **hardness** - твердість.
- **isTransparent** - чи є блок прозорим.
- **material** - матеріал блоку.

**Основні методи:**
- **Конструктор:** Ініціалізує всі параметри блоку.
- **Геттери:** Повертають значення характеристик.
- **toString():** Форматує дані блоку для виводу.
- **equals():** Порівнює блоки за всіма характеристиками.
- **compareTo():** Порівнює блоки за міцністю для сортування.

**2. Клас `BlockManager`:**

- **main(String[] args):**
  - Створює масив блоків.
  - Виводить початковий масив.
  - Сортує блоки за міцністю та твердістю.
  - Шукає блок з конкретними характеристиками.

- **printBlocks(BuildingBlock[] blocks):**
  - Допоміжний метод для виведення масиву блоків.


### Приклад роботи
**Початковий масив:**
```
Block{name='Stone', durability=100, hardness=1.5, transparent=false, material='Rock'}
Block{name='Glass', durability=30, hardness=0.3, transparent=true, material='Sand'}
Block{name='Wood', durability=60, hardness=0.8, transparent=false, material='Tree'}
Block{name='Diamond Block', durability=150, hardness=3.0, transparent=false, material='Diamond'}
Block{name='Ice', durability=40, hardness=0.5, transparent=true, material='Water'}
```

**Сортування за міцністю:**
```
Block{name='Glass', durability=30, hardness=0.3, transparent=true, material='Sand'}
Block{name='Ice', durability=40, hardness=0.5, transparent=true, material='Water'}
Block{name='Wood', durability=60, hardness=0.8, transparent=false, material='Tree'}
Block{name='Stone', durability=100, hardness=1.5, transparent=false, material='Rock'}
Block{name='Diamond Block', durability=150, hardness=3.0, transparent=false, material='Diamond'}
```

**Сортування за твердістю:**
```
Block{name='Diamond Block', durability=150, hardness=3.0, transparent=false, material='Diamond'}
Block{name='Stone', durability=100, hardness=1.5, transparent=false, material='Rock'}
Block{name='Wood', durability=60, hardness=0.8, transparent=false, material='Tree'}
Block{name='Ice', durability=40, hardness=0.5, transparent=true, material='Water'}
Block{name='Glass', durability=30, hardness=0.3, transparent=true, material='Sand'}
```

**Пошук блоку "Glass":**
```
Знайдено шуканий блок:
Block{name='Glass', durability=30, hardness=0.3, transparent=true, material='Sand'}
```

**Запуск програми:**
   - Використайте термінал VS Code:
     ```bash
     javac BlockManager.java
     java BlockManager
     ```

## Результат виконання
Програма виведе:
- Початковий масив блоків
- Масив, відсортований за міцністю (зростання)
- Масив, відсортований за твердістю (спадання)
- Результат пошуку заданого блоку

**Автор Демич Сергій**
