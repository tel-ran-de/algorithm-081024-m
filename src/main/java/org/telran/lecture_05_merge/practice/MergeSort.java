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
//        for (int i = 0; i < middle; i++) {
//            left[i] = arr[i];
//        }
        System.arraycopy(arr, middle, right, 0, arr.length - middle);

        return merge(mergeSort(left), mergeSort(right));
    }

    private static int[] merge(int[] left, int[] right) {
        int[] mergedArray = new int[left.length + right.length];
        int index1 = 0;
        int index2 = 0;
        int indexMerged = 0;
        // 1
        while (index1 < left.length && index2 < right.length) {
            if (left[index1] < right[index2]) {
                mergedArray[indexMerged++] = left[index1];
                index1++;
            }else{
                mergedArray[indexMerged++] = right[index2];
                index2++;
            }
        }
        // 2
        while (index1 < left.length){
            mergedArray[indexMerged] = left[index1];
            index1++;
            indexMerged++;
        }
        while (index2 < right.length){
            mergedArray[indexMerged] = right[index2];
            index2++;
            indexMerged++;
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] arr = {};
        int[] sortedArr = mergeSort(arr);
        System.out.print("Отсортированный массив: ");
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
        // O(n*log n)
    }
}
