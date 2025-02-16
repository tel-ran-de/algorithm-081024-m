package org.telran.lecture_02_big_o.practice;

// Задача: является ли число простым.
//
//Алгоритм:
//Если число меньше или равно 1, оно не простое.
//Для чисел больше 1:
//Проверяем, делится ли число на любое число от 2 до его квадратного корня.
//Если делится на любое число, то оно не простое.
//Если не делится ни на одно число в этом диапазоне, то число простое.

public class IsPrime {
    public static void main(String[] args) {
     int number = 29;
        if (isPrime(number)) {
            System.out.println(number + " — простое число.");
        } else {
            System.out.println(number + " — не простое число.");
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i * i <= number; i++) { // Ищем делители от 2 до квадратного корня
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}


// Оценить сложность алгоритма
//O(√n) — мы проверяем делители только до квадратного
// корня числа, что значительно быстрее, чем проверка всех чисел до n.
