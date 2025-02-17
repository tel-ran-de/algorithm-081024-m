package org.telran.lecture_02_big_o.practice;

// Задача: Найти наибольший элемент в массиве целых чисел.

// Алгоритм:
// Создать переменную для хранения текущего наибольшего элемента и инициализировать ее первым элементом массива.
//     Пройти по массиву с начала до конца, сравнивая каждый элемент с текущим наибольшим.
//     Если текущий элемент больше наибольшего, обновить значение наибольшего.
//     Вернуть наибольший элемент.

public class IsPrime {
    public static void main(String[] args) {
        int number = 29;
        if (number == 1) {
            System.out.println("1 не является простым числом по определению.");
        } else  if (isPrime(number)) {
            System.out.println(number + " — простое число.");
        } else {
            System.out.println(number + " — не простое число.");
        }
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

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
