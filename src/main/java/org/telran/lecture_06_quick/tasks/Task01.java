package org.telran.lecture_06_quick.tasks;

// "Простая сортировка"
// Дан массив произвольных целых чисел
// Используя любой алгоритм сортировки из lecture_6, отсортируйте элементы в порядке возрастания.


public class Task01 {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 8, -5, 0, 7, 12, 0, -4, 10};
        // Сортировка пузырьком
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}



