package org.telran.lecture_02_big_o.practice;

// Задача: Вычислить факториал заданного числа.

// Алгоритм:
// Создать переменную для хранения результата и инициализировать ее единицей.
//     Умножить результат на все числа от 1 до заданного числа.
//     Вернуть результат.

public class Factorial {
    public static void main(String[] args) {
    int number = 5; // Заданное число
        System.out.println("Факториал " + number + " = " + factorial(number));
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

// Оценить сложность алгоритма
//В каждой итерации происходит умножение и присваивание (O(1) операция).
//Общая временная сложность: O(n) (линейная сложность).
//Используется только одна переменная result, не зависит от n.
