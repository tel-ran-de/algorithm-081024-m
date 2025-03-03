package org.telran.lecture_05_merge.practice.tasks;
import java.util.Scanner;

// "Сумма наибольших"
// Дан массив произвольных целых чисел
// Найти: сумму 5-ти самых больших элементов.
// Примечание: Используйте алгоритм сортировки, если нужно.


public class Task01 {
    public static void main(String[] args) {
        int[] numbers = {2, 4, -8, -5, 0, 7, 12, 0, -4, 10};
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
