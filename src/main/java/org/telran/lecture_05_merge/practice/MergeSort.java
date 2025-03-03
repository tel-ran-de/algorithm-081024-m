package org.telran.lecture_05_merge.practice;

import java.util.Arrays;

public class MergeSort {

    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int middle = arr.length / 2;
        int[] left = new int[middle];
        int[] right = new int[arr.length - middle];

        System.arraycopy(arr, 0, left, 0, middle);
//        for (int i = 0; i < left.length; i++){
//          left[i] = arr[i];
//        }
        System.arraycopy(arr, middle, right, 0, arr.length - middle);
//        for (int i = middle; i < arr.length; i++) {
//            right[i - middle] = arr[i];
//        }

        return merge(mergeSort(left), mergeSort(right));
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        // Добавляем оставшиеся элементы из массива left, если они есть
        while (i < left.length) {
            result[k++] = left[i++];
        }

        // Добавляем оставшиеся элементы из массива right, если они есть
        while (j < right.length) {
            result[k++] = right[j++];
        }
        return result;
    }

    public static void main(String[] args) {
        //int[] arr = {38, 27, 43, 3, 9, 82, 10};
        int[] arr = {-38, -27, 43, 3, -9, 82, 10};
        //int [] arr = {5};
        //int [] arr = {};

        int[] sortedArr = mergeSort(arr);
        System.out.print("Отсортированный массив: ");
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
        //System.out.println("Отсортированный массив: " + Arrays.toString(sortedArr));
        // O(n log n);
    }
}
//public class MergeSortedArrays {
//
//    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
//
//        int[] mergedArray = new int[arr1.length + arr2.length];
//
//        int i = 0;
//        int j = 0;
//        int k = 0;
//
//        while (i < arr1.length && j < arr2.length) {
//            if (arr1[i] < arr2[j]) {
//                mergedArray[k] = arr1[i];
//                i++;
//                k++;
//            } else {
//                mergedArray[k] = arr2[j];
//                j++;
//                k++;
//            }
//        }
//
//        // Если в arr1 остались элементы
//        while (i < arr1.length) {
//            mergedArray[k] = arr1[i];
//            i++;
//            k++;
//        }
//
//        // Если в arr2 остались элементы
//        while (j < arr2.length) {
//            mergedArray[k] = arr2[j];
//            j++;
//            k++;
//        }
//
//        return mergedArray;
//    }
