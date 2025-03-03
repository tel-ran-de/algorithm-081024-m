package org.telran.lecture_05_merge.practice.tasks;
import java.util.Arrays;
import java.util.Scanner;

import static org.telran.lecture_05_merge.practice.MergeSort.mergeSort;


// "Сумма наибольших"
// Дан массив произвольных целых чисел
// Найти: сумму 5-ти самых больших элементов.
// Примечание: Используйте алгоритм сортировки, если нужно.


public class Task01 {

        public static void main(String[] args) {
            int[] numbers = {2, 4, -8, -5, 0, 9, 12, 0, -4, 10};

            int[] sortedNumbers = mergeSort(numbers);

            System.out.print("Отсортированный массив: ");
            for (int num : sortedNumbers) {
                System.out.print(num + " ");
            }
            System.out.println();

            int sum = 0;
            for (int i = sortedNumbers.length - 5; i < sortedNumbers.length; i++) {
                sum += sortedNumbers[i];
            }
            System.out.println("Сумма 5 самых больших элементов: " + sum);
        }

//        private static int[] mergeSort(int[] arr) {
//            if (arr.length <= 1) {
//                return arr;
//            }
//
//            int middle = arr.length / 2;
//            int[] left = new int[middle];
//            int[] right = new int[arr.length - middle];
//
//
//            for (int i = 0; i < middle; i++) {
//                left[i] = arr[i];
//            }
//            for (int i = middle; i < arr.length; i++) {
//                right[i - middle] = arr[i];
//            }
//
//            return merge(mergeSort(left), mergeSort(right));
//        }

        // Метод для слияния двух отсортированных массивов
//        private static int[] merge(int[] left, int[] right) {
//            int[] result = new int[left.length + right.length];
//            int i = 0, j = 0, k = 0;
//
//            // Слияние двух отсортированных массивов
//            while (i < left.length && j < right.length) {
//                if (left[i] <= right[j]) {
//                    result[k++] = left[i++];
//                } else {
//                    result[k++] = right[j++];
//                }
//            }
//
//            // Добавляем оставшиеся элементы из массива left, если они есть
//            while (i < left.length) {
//                result[k++] = left[i++];
//            }
//
//            // Добавляем оставшиеся элементы из массива right, если они есть
//            while (j < right.length) {
//                result[k++] = right[j++];
//            }
//
//            return result;
//        }
    }

