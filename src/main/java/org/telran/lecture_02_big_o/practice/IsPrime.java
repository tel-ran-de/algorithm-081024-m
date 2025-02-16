package org.telran.lecture_02_big_o.practice;

// Задача: Проверить, является ли заданное число простым.

// Алгоритм:
// Проверить, делится ли число на 2. Если делится, то число не простое.
//     Пройти по всем нечетным числам от 3 до корня из числа.
//     Если число делится на какое-то из этих чисел, то оно не простое.
//     Если ни одно из чисел не является делителем, то число простое.

public class IsPrime {
    public static void main(String[] args) {
        int[] array = {2, 6, 2, 1, 9, 22, -3, 4, 7};
    }

    public static boolean isPrime(int number) {
        // You code ...
        if (number<=1) return false;
        if (number==2) return true;
        if (number%2 == 0 ) return false;
        for (int i = 3; i*i <= number ; i+=2) {
            if (number%i == 0) return false;
        }
        return true;
    }
}


// Оценить сложность алгоритма
// Сложность в лучшем O(1) если мы находим сразу,
//Сложность O(√n) количество операций растёт пропорционально квадратному корню из числа n
