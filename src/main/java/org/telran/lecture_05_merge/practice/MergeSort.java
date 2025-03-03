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
        System.arraycopy(arr, middle, right, 0, arr.length - middle);

        return merge(mergeSort(left), mergeSort(right));
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < result.length; i++) {
            if (index1 < left.length && (index2 == right.length || left[index1] < right[index2])) {
                result[i] = left[index1++];
            } else {
                result[i] = right[index2++];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        int[] sortedArr = mergeSort(arr);
        System.out.print("Отсортированный массив: ");
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
    }
}
