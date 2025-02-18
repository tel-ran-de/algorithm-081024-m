package org.telran.lecture_02_big_o.practice;

// Задача: Найти элемент в массиве целых чисел.

// Алгоритм:
//     Пройти по массиву с начала до конца, сравнивая каждый элемент с искомым.
//     Если элемент найден, вернуть его индекс.
//     Если элемент не найден, вернуть -1.

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println(linearSearch(new int[]{3, 7, 2, 9, 5, 10, 6}, 9));
        System.out.println(linearSearch(new int[]{-3, -7, 2, -9, -5, -10, 6}, -9));
        System.out.println(linearSearch(new int[]{13, 7, 2, 9, 5, 100, 6}, 3));
        System.out.println(linearSearch(new int[]{1}, 0));
    }

    public static int linearSearch(int[] numbers, int target_number) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target_number) {
                return i;
            }
        }
        return -1;
    }
}


// Оценить сложность алгоритма O(n)