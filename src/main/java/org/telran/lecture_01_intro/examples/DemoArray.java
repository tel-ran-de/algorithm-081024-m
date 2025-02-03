package org.telran.lecture_01_intro.examples;

import java.util.Arrays;

public class DemoArray {
    public static void main(String[] args) {
        // Create Array:
        int[] numbers = {1, 2, 3, 4, 5, 6};
        String[] names = {"Aleks", "Thea", "Thomas", "Sergey", "Azriel"};

        // Output:
        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("names = " + Arrays.toString(names));
    }
}
