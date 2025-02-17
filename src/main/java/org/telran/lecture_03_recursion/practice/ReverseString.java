package org.telran.lecture_03_recursion.practice;

// Задача: перевернуть строку наоборот
// пример: "hello" --> "olleh"

// Дана готовая реализация через итеративный подход.
// Напишите решение, используя рекурсивный подход.

public class ReverseString {
    public static void main(String[] args) {
        // Примеры использования:
        System.out.println(reverseStringIterative("hello")); // "olleh"
        System.out.println(reverseStringIterative("Java")); // "avaJ"
        System.out.println(reverseStringIterative("12345")); // "54321"
    }

    public static String reverseStringIterative(String str) {
        String reversedString = ""; // Создаем пустую строку для хранения результата

        // Проходим по строке с конца до начала
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString += str.charAt(i); // Добавляем текущий символ в начало новой строки
        }

        return reversedString;
    }

    public static String reverseString(String str) {
        // You code...
        return "";
    }
}
