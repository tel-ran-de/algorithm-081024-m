package org.telran.lecture_02_big_o.practice;

// Задача: Найти наибольший элемент в массиве целых чисел.

// Алгоритм:
// Создать переменную для хранения текущего наибольшего элемента и инициализировать ее первым элементом массива.
//     Пройти по массиву с начала до конца, сравнивая каждый элемент с текущим наибольшим.
//     Если текущий элемент больше наибольшего, обновить значение наибольшего.
//     Вернуть наибольший элемент.

public class MaxElement {
    public static void main(String[] args) {
        System.out.println("Max element: " + maxElement(new int[]{3, 7, 2, 9, 5, 10, 6}));
        System.out.println("Max element: " + maxElement(new int[]{-3, -7, 2, -9, -5, -10, 6}));
        System.out.println("Max element: " + maxElement(new int[]{13, 7, 2, 9, 5, 100, 6}));
        System.out.println("Max element: " + maxElement(new int[]{1}));
    }

    public static int maxElement(int[] numbers) {
        if (numbers == null || numbers.length == 0){
            throw  new IllegalArgumentException("Massiv can't be empty!");
        }
        int max = numbers[0];
        for (int num : numbers){
            if (num > max){
                max = num;
            }
        }
        return max;
    }
}

// Оценить сложность алгоритма
//O(n/2) -> O(1/2 * n) -> O(n)