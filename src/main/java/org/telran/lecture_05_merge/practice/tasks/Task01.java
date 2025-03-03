package org.telran.lecture_05_merge.practice.tasks;
import java.util.Scanner;

// "Сумма наибольших"
// Дан массив произвольных целых чисел
// Найти: сумму 5-ти самых больших элементов.
// Примечание: Используйте алгоритм сортировки, если нужно.


public class Task01 {
    public static void main(String[] args) {
        int[] numbers = {2, 4, -8, -5, 1, 7, 12, 0, -4, 10};
        System.out.println("sumOfBiggestFive(numbers) = " + sumOfBiggestFive(numbers));
    }

    public static int sumOfBiggestFive(int[] numbers){
        if (numbers.length < 5){
            return -1;
        }
        Arrays.sort(numbers);
        int sum = 0;
        for (int i = numbers.length - 5; i < numbers.length; i++) {
            sum += numbers[i];
            System.out.println(numbers[i]);
        }
        return sum;
    }
}
