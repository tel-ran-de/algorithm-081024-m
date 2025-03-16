package org.telran.lecture_06_quick.tasks;

// "Анаграммы"
// Задается массив строк - слов. Найти в нем все анаграммы (слова, составленные из одних и тех же букв).

import java.util.*;

public class Task04 {
    public static void main(String[] args) {
        String[] words = {"кот", "ток", "окт", "стол", "лост", "слот", "лист", "силь", "пила", "липа"};

        // Сортируем слова по их буквам
        String[][] sortedWords = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toCharArray();
            Arrays.sort(chars);
            sortedWords[i][0] = new String(chars); // отсортированное представление
            sortedWords[i][1] = words[i]; // оригинальное слово
        }

        // Сортировка массива по отсортированным буквам с использованием стандартного Comparator
        Arrays.sort(sortedWords, Comparator.comparing(a -> a[0]));
        // Выводим анаграммы
        boolean foundAnagram = false;
        for (int i = 0; i < sortedWords.length - 1; i++) {
            if (sortedWords[i][0].equals(sortedWords[i + 1][0])) {
                if (!foundAnagram) {
                    System.out.print("[" + sortedWords[i][1]);
                    foundAnagram = true;
                }
                System.out.print(", " + sortedWords[i + 1][1]);
            } else if (foundAnagram) {
                System.out.println("]");
                foundAnagram = false;
            }
        }
        if (foundAnagram) {
            System.out.println("]");
        }
    }
}

