package org.telran.lecture_02_big_o.practice;

// Задача: Вычислить факториал заданного числа.

// Алгоритм:
// Создать переменную для хранения результата и инициализировать ее единицей.
//     Умножить результат на все числа от 1 до заданного числа.
//     Вернуть результат.

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(0));
        System.out.println(factorial(15));
        System.out.println(factorialRecursion(5));
        System.out.println(factorialRecursion(0));
        System.out.println(factorialRecursion(15));
    }

    public static int factorial(int n) {
        if (n == 0) return 1;
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int factorialRecursion(int n) {
        if (n == 1 || n == 0) return 1;
        return n * factorial(n - 1);
    }
}

// Оценить сложность алгоритма O
