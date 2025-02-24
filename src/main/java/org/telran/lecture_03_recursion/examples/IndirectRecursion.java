package org.telran.lecture_03_recursion.examples;

public class IndirectRecursion {
    public static void main(String[] args) {
        functionA(3);
    }


    public static void functionA(int number) {
        System.out.println("functionA: " + number);
        if (number != 5) {
            functionB(number - 1);
        }
    }

    public static void functionB(int number) {
        System.out.println("functionB: " + number);
        if (number != 5) {
            functionA(number - 1);
        }
    }


}
