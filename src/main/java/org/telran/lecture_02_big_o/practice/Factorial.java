package org.telran.lecture_02_big_o.practice;

// Задача: Вычислить факториал заданного числа.

// Алгоритм:
// Создать переменную для хранения результата и инициализировать ее единицей.
//     Умножить результат на все числа от 1 до заданного числа.
//     Вернуть результат.

public class Factorial {
    public static void main(String[] args) {
int n = 2;
        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        // You code ...
        int result = 1;
        for (int i = 1; i <=n ; i++) {
            result *= i;
        }
        return result;
    }
}

// Оценить сложность алгоритма
// В итеративном методе O(n) сложность прямо пропорциональна количеству вхлдных данных n, так как алгоритм выполняет n операций умножения.
