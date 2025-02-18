package org.telran.lecture_02_big_o.practice;

// Задача: Найти наибольший элемент в массиве целых чисел.

// Алгоритм:
// Создать переменную для хранения текущего наибольшего элемента и инициализировать ее первым элементом массива.
//     Пройти по массиву с начала до конца, сравнивая каждый элемент с текущим наибольшим.
//     Если текущий элемент больше наибольшего, обновить значение наибольшего.
//     Вернуть наибольший элемент.

public class IsPrime {
    public static void main(String[] args) {
        System.out.println("is Prime(1) = " + isPrime(1));
        System.out.println("is Prime(2) = " + isPrime(2));
        System.out.println("is Prime(4) = " + isPrime(4));
        System.out.println("is Prime(9) = " + isPrime(9));
        System.out.println("is Prime(11) = " + isPrime(11));
        System.out.println("is Prime(29) = " + isPrime(29));
        System.out.println("is Prime(427) = " + isPrime(427));

    }

    public static boolean isPrime(int number) {
        if (number == 2){
            return true;
        }
        if (number % 2 ==0 || number <= 1){
            return false;
        }
        for (int i = 3; i * i <= number ; i += 2) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}


// Оценить сложность алгоритма O(v2)