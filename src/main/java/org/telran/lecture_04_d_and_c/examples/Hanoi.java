package org.telran.lecture_04_d_and_c.examples;

public class Hanoi {

    public static void hanoi(int n, char source, char destination, char helper) {
        // n: количество дисков
        // start: начальный столбец
        // end: конечный столбец
        // aux: вспомогательный столбец
        if (n > 0) {
            // Перемещаем n-1 дисков с исходного на вспомогательный
            hanoi(n - 1, source, helper, destination);

            // Перемещаем самый большой диск с исходного на целевой
            System.out.println("Переместить диск " + n + " с " + source + " на " + destination);

            // Перемещаем n-1 дисков с вспомогательного на целевой
            hanoi(n - 1, helper, destination, source);
        }
    }

    public static void main(String[] args) {
        hanoi(4, 'A', 'C', 'B');
    }
}