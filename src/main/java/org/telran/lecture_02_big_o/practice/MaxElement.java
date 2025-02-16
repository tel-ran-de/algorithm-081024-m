package org.telran.lecture_02_big_o.practice;

// Задача: Найти наибольший элемент в массиве целых чисел.

// Алгоритм:
// Создать переменную для хранения текущего наибольшего элемента и инициализировать ее первым элементом массива.
//     Пройти по массиву с начала до конца, сравнивая каждый элемент с текущим наибольшим.
//     Если текущий элемент больше наибольшего, обновить значение наибольшего.
//     Вернуть наибольший элемент.

public class MaxElement {
    public static void main(String[] args) {
        int[] array = {2, 6, 2, 1, 9, 22, -3, 4, 7};

        System.out.println(maxElement(array));
    }

    public static int maxElement(int[] numbers) {
        // You code ...
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] >= max){
                max = numbers[i];
            }
        }
        return max;
    }
}

// Оценить сложность алгоритма
// Сложность константная линейная O(n) - единоразовый перебор всех элементов