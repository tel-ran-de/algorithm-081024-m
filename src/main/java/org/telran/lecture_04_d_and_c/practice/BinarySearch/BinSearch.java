package org.telran.lecture_04_d_and_c.practice.BinarySearch;
// Алгоритм "Бинарный поиск"
// 1. Начинаем с поиска среднего элемента массива.
// 2. Если средний элемент совпадает с искомым, поиск завершается.
// 3. Если искомый элемент меньше среднего, поиск продолжается в левой половине массива.
// 4. Если искомый элемент больше среднего, поиск продолжается в правой половине массива.
// 5. Шаги 1-4 повторяются до тех пор, пока элемент не будет найден или пока не останется пустой диапазон для поиска.

public class BinSearch {

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 12;
        int result = binarySearchRecursive(arr, target, 0, arr.length - 1);

        if (result == -1) {
            System.out.println("Элемент не найден");
        } else {
            System.out.println("Элемент найден по индексу " + result);
        }
    }

    public static int binarySearchRecursive(int[] arr, int target, int left, int right) {
        int middle = (left + right) / 2;

        if (arr[middle] == target) {
            return middle;
        }
        if (left >= right) {
            return -1;
        }
        if (arr[middle] < target) {
            left = middle + 1;//work with right
            return binarySearchRecursive(arr, target, left, right);
        } else {
            right = middle - 1;// work with left
            return binarySearchRecursive(arr, target, left, right);
        }


//            if (left > right) {
//                return -1;
//            }
//            int mid = left + (right - left) / 2;
//
//            if (arr[mid] == target) {
//                return mid;
//            }
//
//            if (arr[mid] > target) {
//                return binarySearchRecursive(arr, target, left, mid - 1);
//            }
//            return binarySearchRecursive(arr, target, mid + 1, right);
    }
}
