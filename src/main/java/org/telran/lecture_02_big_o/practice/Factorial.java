package org.telran.lecture_02_big_o.practice;

// Задача: Вычислить факториал заданного числа.

// Алгоритм:
// Создать переменную для хранения результата и инициализировать ее единицей.
//     Умножить результат на все числа от 1 до заданного числа.
//     Вернуть результат.

public class Factorial {
    public static void main(String[] args) {
        System.out.println("factorial (0) - " + factorial(0));
        System.out.println("factorial (1) - " + factorial(1));
        System.out.println("factorial (2) - " + factorial(5));
        System.out.println("factorial (10) - " + factorial(10));
    }

    public static int factorial(int n) {
        if(n == 0) return 1;
        int result = 1;
        for (int i = 2; i <= n; i++) {
          result *= i;
        }
        return result;
    }
}

// Оценить сложность алгоритма O(n)
