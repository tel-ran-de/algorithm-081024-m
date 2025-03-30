package org.telran.lecture_8_st_and_qu.hw;

// Дан массив целых чисел размера n.
// Элементы массива – это высоты некоторых сооружений.
// Необходимо определить сколько таких сооружений, можно увидеть из начальной точки 0.

// Пример 1:
// Input: [8, 2, 3, 11, 11, 10]
// Output: 2
// Пояснение: Нам видно первое здание высотой 8, за ним следуют 11 (2 и 3 не видно, так как они меньше 8),
//    последние два элемента (11 и 10) также не видны так как 11 находится на том же уровне, что и 4 элемент (тоже 11),
//    а 10 – еще ниже.

// Пример 2:
// Input: [12, 20, 39, 45, 89]
// Output: 5
// Пояснение: будут видны все элементы, так как они расположены по возрастанию

public class Heights {
  public static void main(String[] args) {
        // Пример 1
        int[] heights1 = {8, 2, 3, 11, 11, 10};
        System.out.println("Видимых зданий: " + countVisibleBuildings(heights1)); // Output: 2

        // Пример 2
        int[] heights2 = {12, 20, 39, 45, 89};
        System.out.println("Видимых зданий: " + countVisibleBuildings(heights2)); // Output: 5
    }

    // Метод для подсчета видимых зданий
    public static int countVisibleBuildings(int[] heights) {
        int visibleCount = 0;   // Счетчик видимых зданий
        int maxHeight = -1;     // Максимальная высота, которую мы видели до текущего здания

        for (int height : heights) {
            // Если текущее здание выше максимальной высоты, оно видно
            if (height > maxHeight) {
                visibleCount++;  // Увеличиваем счетчик видимых зданий
                maxHeight = height; // Обновляем максимальную высоту
            }
        }

        return visibleCount;
    }
}
