package org.telran.lecture_03_recursion.examples;

public class SimpleRecursion {

    public static void main(String[] args) {
        System.out.println("----------iteration----------");
        functionIteration(5);
//        System.out.println("----------recursion----------");
//        functionRecursion(5);
    }

    private static void functionIteration(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.println("n = " + i);
        }
    }

    private static void functionRecursion(int n) {
        if (n >= 0) {
            functionRecursion(n - 1);
            System.out.println("n = " + n);
        }
    }
}

