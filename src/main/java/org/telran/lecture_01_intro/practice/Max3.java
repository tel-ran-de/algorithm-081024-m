package org.telran.lecture_01_intro.practice;

public class Max3 {
    public static void main(String[] args) {
        System.out.println(max3(22, 5, -4));
        System.out.println(max3(2, 55, 14));
        System.out.println(max3(12, 5, 44));
    }

    public static int max3(int a, int b, int c) {
        if (a <= b) {
            a = b;
        }
        if (a > c) return a;

        return c;
    }
}

//Задача: Найти наибольшее число из трех заданных чисел. Алгоритм:
// 1. Получить три числа. Обозначим их как a, b и c.
// 2. Сравнить a и b.
// 2.1. Если a больше b, то переходим к шагу 3.
// 2.2.Иначе, b больше или равно a, тогда присваиваем b значение a.
// 3. Сравнить a и c.
// 3.1. Если a больше c, то a - наибольшее число,
// завершаем алгоритм.
// 3.2. Иначе, c больше или равно
// a, тогда c - наибольшее число, завершаем алгоритм.
