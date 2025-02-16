package org.telran.lecture_02_big_o.practice;

// Задача: Найти элемент в массиве целых чисел.

// Алгоритм:
//     Пройти по массиву с начала до конца, сравнивая каждый элемент с искомым.
//     Если элемент найден, вернуть его индекс.
//     Если элемент не найден, вернуть -1.

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 9, 5, 10, 6};
        int target = 9;
        System.out.println(linearSearch(numbers, target));
    }

    public static int linearSearch(int[] numbers, int target_number) {
         for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}


// Оценить сложность алгоритма
