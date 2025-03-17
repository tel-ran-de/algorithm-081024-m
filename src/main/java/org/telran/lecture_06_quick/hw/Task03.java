package org.telran.lecture_06_quick.hw;

// "Призеры олимпиады"
// По результатам олимпиады участники награждаются дипломами.
// Набравшие одинаковые баллы получают дипломы одинаковой степени.
// Призером олимпиады считается участник, получивший диплом не хуже III степени.
// По результатам олимпиады определите количество призеров.
// Вход: массив из N натуральных чисел – результаты участников.
// Выход: одно число – число призеров.

// Пример:
// Вход
// 1 3 4 3 5 6 7 7 6 1
// Выход
// 5

// 1 3 4 3 5 6 7 7 6 1

// 7 7 6 6 5 4 3 3 1 1

import java.util.Arrays;
import java.util.Comparator;

public class Task03 {
    public static void main(String[] args) {
        Integer[] results = {1, 12, 7, 3, 4, 3, 7, 6, 7, 7, 6, 1};
        System.out.println(countWinners(results));
    }
    public static int countWinners(Integer[] results) {
        if (results.length == 0) return 0;
        Arrays.sort(results, Comparator.reverseOrder());
        int count = 0;
        int degree = 1;
        // {12, 7, 7, 7, 4, 2, 2, 1, 0}
        for (int i = 0; i < results.length; i++) {
            count++;
            if (results[i] - results[i + 1] != 0 && (++degree > 3)) {
                break;
            }
        }
        return count;
    }
}
