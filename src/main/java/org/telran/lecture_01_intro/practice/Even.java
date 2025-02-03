package org.telran.lecture_01_intro.practice;

public class Even {

    public static void isEven(int n){
        if (n%2 == 0){
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
    }

    public static void main(String[] args) {
        isEven(5);
        isEven(0);
        isEven(20058);
    }
}
