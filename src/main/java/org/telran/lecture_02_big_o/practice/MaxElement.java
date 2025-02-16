package org.telran.lecture_02_big_o.practice;

// Задача: Найти наибольший элемент в массиве целых чисел.

// Алгоритм:
// Создать переменную для хранения текущего наибольшего элемента и инициализировать ее первым элементом массива.
//     Пройти по массиву с начала до конца, сравнивая каждый элемент с текущим наибольшим.
//     Если текущий элемент больше наибольшего, обновить значение наибольшего.
//     Вернуть наибольший элемент.

public class MaxElement {
    public static void main(String[] args) {
    int[] numbers = {3, 7, 2, 9, 5, 10, 6};
        System.out.println("Наибольший элемент: " + maxElement(numbers));
    }

    public static int maxElement(int[] numbers) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым!");
        }
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}

// Оценить сложность алгоритма
//Сложность алгоритма: O(n), так как проходим по массиву один раз.
