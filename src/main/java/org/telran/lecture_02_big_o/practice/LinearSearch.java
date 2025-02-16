package org.telran.lecture_02_big_o.practice;

// Задача: Найти элемент в массиве целых чисел.

// Алгоритм:
//     Пройти по массиву с начала до конца, сравнивая каждый элемент с искомым.
//     Если элемент найден, вернуть его индекс.
//     Если элемент не найден, вернуть -1.

public class LinearSearch {
    public static void main(String[] args) {

        int[] numbers = {3,5,1,7,2,6,4};
        System.out.println(linearSearch(numbers,2));
        System.out.println(linearSearch(numbers,8));
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


// Оценить сложность алгоритма
// best: O(1)
// worst: O(n)
// aver: O(n/2)
