package org.telran.lecture_02_big_o.practice;

// Задача: Проверить, является ли заданное число простым.

// Алгоритм:
// Проверить, делится ли число на 2. Если делится, то число не простое.
//     Пройти по всем нечетным числам от 3 до корня из числа.
//     Если число делится на какое-то из этих чисел, то оно не простое.
//     Если ни одно из чисел не является делителем, то число простое.

public class IsPrime {
    public static void main(String[] args) {
        System.out.println("isPrime(1) = " + isPrime(1));
        System.out.println("isPrime(2) = " + isPrime(2));
        System.out.println("isPrime(3) = " + isPrime(3));
        System.out.println("isPrime(9) = " + isPrime(9));
        System.out.println("isPrime(9) = " + isPrime(427));

    }

    public static boolean isPrime(int number) {
        if (number != 2 && number % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number != i && number % i == 0) {
                return false;
            }
        }
        return true;
    }
}


// Оценить сложность алгоритма