package org.telran.lecture_01_intro.practice;

public class LinealSearch {

    public static void hasANumber(int[] array,int number){
        for (int a:array){
            if (a == number){
                System.out.println("Найдено");
                return;
            }
        }
        System.out.println("Не найдено");
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {1, 1, 1, 1, 1, 1};
        int[] array3 = {1, 6, 3, 4, 5, 2};

        hasANumber(array1,2);
        hasANumber(array1,2);
        hasANumber(array1,2);
    }
}
