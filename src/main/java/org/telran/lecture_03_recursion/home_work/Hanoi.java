package org.telran.lecture_03_recursion.home_work;

public class Hanoi {

    public static void hanoi(int n, String start, String end, String aux) {
        // n: количество дисков
        // start: начальный столбец
        // end: конечный столбец
        // aux: вспомогательный столбец
        if (n == 1) {
            System.out.println(start + " --> " + end);
        } else {
            hanoi(n - 1, start, aux, end);
            System.out.println(start + " --> " + end);
            hanoi(n - 1, aux, end, start);
        }
    }

    public static void main(String[] args) {
        hanoi(3, "A", "C", "B"); // Выводит в терминал описание действие по перемещению дисков "A" --> "C"
    }
}
