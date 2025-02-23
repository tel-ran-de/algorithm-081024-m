package org.telran.lecture_03_recursion.home_work;

public class Hanoi {

    public static void hanoi(int n, String start, String end, String aux) {
        // n: количество дисков
        // start: начальный столбец
        // end: конечный столбец
        // aux: вспомогательный столбец

        if (n == 1) {
            System.out.println("Переместить диск 1 с " + start + " на " + end);
            return;
        }
        // Шаг 1: перемещаем n-1 дисков с начального на вспомогательный столбец
        hanoi(n - 1, start, aux, end);

        // Шаг 2: перемещаем самый большой диск с начального на конечный столбец
        System.out.println("Переместить диск " + n + " с " + start + " на " + end);

        // Шаг 3: перемещаем n-1 дисков с вспомогательного на конечный столбец
        hanoi(n - 1, aux, end, start);
    }

    public static void main(String[] args) {
        hanoi(3, "A", "C", "B"); // Выводит в терминал описание действие по перемещению дисков "A" --> "C"
    }
}