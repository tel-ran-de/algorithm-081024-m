package org.telran.lecture_02_big_o.practice;

// Задача: Найти наибольший элемент в массиве целых чисел.

// Алгоритм:
// Создать переменную для хранения текущего наибольшего элемента и инициализировать ее первым элементом массива.
//     Пройти по массиву с начала до конца, сравнивая каждый элемент с текущим наибольшим.
//     Если текущий элемент больше наибольшего, обновить значение наибольшего.
//     Вернуть наибольший элемент.

public class MaxElement {
    public static void main(String[] args) {
        int[] numbers = {3,5,1,7,2,6,4};
        System.out.println(maxElement(numbers));
    }

    public static int maxElement(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}

// Оценить сложность алгоритма : O(n)
