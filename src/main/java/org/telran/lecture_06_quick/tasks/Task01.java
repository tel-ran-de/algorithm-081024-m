package org.telran.lecture_06_quick.tasks;

import java.util.Arrays;

// "Простая сортировка"
// Дан массив произвольных целых чисел
// Используя любой алгоритм сортировки из lecture_6, отсортируйте элементы в порядке возрастания.


public class Task01 {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 8, -5, 0, 7, 12, 0, -4, 10};
//        quickSortRecursive(numbers, 0, numbers.length - 1);
        quickSortRecursive(numbers);
        System.out.println(Arrays.toString(numbers));

    }

    public static void quickSortRecursive(int[] array) {
        quickSortRecursive(array, 0, array.length - 1);
    }

    public static void quickSortRecursive(int[] array, int start, int end) {
        if (start >= end) { // условие выходы из рекурсии
            return;
        }
        int indexPivot = partition(array, start, end);
        quickSortRecursive(array, start, indexPivot - 1);
        quickSortRecursive(array, indexPivot + 1, end);
    }

    private static int partition(int[] array, int partitionStart, int partitionEnd) {
        int pivot = array[partitionEnd]; //choose pivot element
        int index = partitionStart;

        for (int i = partitionStart; i < partitionEnd; i++) {
            if (array[i] <= pivot) {
                swap(array, i, index);
                index++;
            }
        }
        swap(array, partitionEnd, index);

        return index;
    }

    private static void swap(int[] array, int source, int destination) {
        int temp = array[source];
        array[source] = array[destination];
        array[destination] = temp;
    }
}
