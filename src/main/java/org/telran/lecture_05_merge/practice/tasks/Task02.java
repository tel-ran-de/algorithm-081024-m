package org.telran.lecture_05_merge.practice.tasks;

import java.util.Scanner;

// "Сумма с условием"
// Дан массив произвольных целых чисел
// Найти: сумму элементов списка, больших данного числа a. Значение a можно задать самостоятельно.
// Примечание: Используйте алгоритм сортировки, если нужно.

public class Task02 {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 8, -5, 0, 7, 12, 0, -4, 10};
        int a = 0;
        System.out.println("sumElementsBiggerThan(numbers,14) = " + sumElementsBiggerThan(numbers, 5));
    }

    public static int sumElementsBiggerThan(int[] numbers, int target) {
        int sum = 0;
        for (int number : numbers) {
            if (number > target) {
                sum += number;
            }
        }
        return sum;
    }
}
