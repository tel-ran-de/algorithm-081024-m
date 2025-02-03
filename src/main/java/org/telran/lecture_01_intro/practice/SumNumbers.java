package org.telran.lecture_01_intro.practice;

//1. Вывести число N.
//2. Инициализировать сумму (sum = 0)
//3. Перебрать числа от 1 до N
//4. Добавить каждое значение в sum
//5. выводим результат - сумму чисел

public class SumNumbers {
    public static void main(String[] args) {
        int n = 1; // 1 2 3 4 5 6
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}

// C++  |src| -comp-> .bin
// Java |src| -comp-> .pre  -JMV-> run...
// JS   |src| -int JS -> run
// nodeJS