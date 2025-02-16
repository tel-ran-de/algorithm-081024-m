package org.telran.lecture_02_big_o.practice;

// Задача: Найти наибольший элемент в массиве целых чисел.

// Алгоритм:
// Создать переменную для хранения текущего наибольшего элемента и инициализировать ее первым элементом массива.
//     Пройти по массиву с начала до конца, сравнивая каждый элемент с текущим наибольшим.
//     Если текущий элемент больше наибольшего, обновить значение наибольшего.
//     Вернуть наибольший элемент.

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


// Оценить сложность алгоритма O(log(n))
