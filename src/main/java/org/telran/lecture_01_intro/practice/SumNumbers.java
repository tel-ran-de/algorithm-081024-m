package org.telran.lecture_01_intro.practice;

public class SumNumbers {
    /**
        Задача: Вычислить сумму всех целых чисел от 1 до заданного числа N.
        1. На вход получаем число n.
        2. Создать целочисленную переменную sum для подсчета суммы, присвоить начальное значение 0.
        3. Перебрать числа от 1 до N.
        4. Добавить каждое значение в sum
        5. На выход отправляем переменную sum.
     */
    public static int sumUpToN(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumUpToN(1));

    }
}
