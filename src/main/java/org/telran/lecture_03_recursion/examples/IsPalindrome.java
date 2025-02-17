package org.telran.lecture_03_recursion.examples;

public class IsPalindrome {
    public static void main(String[] args) {
        // Примеры использования
        System.out.println(isPalindrome("Madam")); // true
        System.out.println(isPalindrome("нежен")); // true
        System.out.println(isPalindrome("hello")); // false
        System.out.println(isPalindrome("Кабак")); // true
        System.out.println(isPalindrome("башмак")); // false
    }

    public static boolean isPalindrome(String str) {
        // Приводим строку к нижнему регистру
        str = str.toLowerCase();

        // Базовый случай: пустая строка или строка из одного символа - палиндром
        if (str.length() <= 1) {
            return true;
        }

        // Рекурсивный случай: сравниваем первый и последний символы
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            // Если символы совпадают, проверяем оставшуюся часть строки
            return isPalindrome(str.substring(1, str.length() - 1));
        } else {
            // Если символы не совпадают, строка не палиндром
            return false;
        }
    }


}
