package org.telran.lecture_01_intro.homework;

public class Task1 {

    public static int findMax(int a, int b, int c) {
        if (a > b) {
        } else {
            a = b;
        }
        if (a > c) return a;
        else return c;
    }

    public static void main(String[] args) {
        System.out.println(findMax(1, 2, 3));
        System.out.println(findMax(9, 10, 8));
        System.out.println(findMax(Integer.MIN_VALUE, 0, Integer.MAX_VALUE));
    }
}
