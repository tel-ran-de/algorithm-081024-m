package org.telran.lecture_08_st_and_qu.hw;

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
        System.out.println("countVisibleBuildings(new int[]{8, 2, 3, 11, 11, 10}) = " + countVisibleBuildings(new int[]{8, 2, 3, 11, 11, 10}));
        System.out.println("countVisibleBuildings(new int[]{2, 2, 3, 9, 11, 10}) = " + countVisibleBuildings(new int[]{2, 2, 3, 9, 11, 10}));
        System.out.println("countVisibleBuildings(new int[]{12, 20, 39, 45, 89}) = " + countVisibleBuildings(new int[]{12, 20, 39, 45, 89}));
        System.out.println("countVisibleBuildings(new int[]{}) = " + countVisibleBuildings(new int[]{}));
    }

    public static int countVisibleBuildings(int[] buildingsHeights) {
        if (buildingsHeights.length == 0) {
            return 0;
        }
        int count = 1;
        int currentMaxHeight = buildingsHeights[0];
        for (int i = 1; i < buildingsHeights.length; i++) {
            if (buildingsHeights[i] > currentMaxHeight) {
                currentMaxHeight = buildingsHeights[i];
                count++;
            }
        }
        return count;
    }
}
