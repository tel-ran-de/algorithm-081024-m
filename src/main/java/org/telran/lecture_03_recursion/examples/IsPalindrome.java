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
        str = str.toLowerCase();

        if (str.length() <= 1) {
            return true;
        }

        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalindrome(str.substring(1, str.length() - 1));
        } else {
            return false;
        }
    }


}

// isP(кабак)   [0] == [-1]
// isP(аба)     [0] == [-1]
// isP(б)       [0] == [-1]
// isP("")      [0] == [-1]


//isPa()
