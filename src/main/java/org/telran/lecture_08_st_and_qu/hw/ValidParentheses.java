package org.telran.lecture_08_st_and_qu.hw;

// Дана строка s, содержащая только символы '(', ')', '{', '}', '[' и ']'.
// Определите, является ли входная строка допустимой.
//
// Входная строка допустима, если:
//
// 1. Открытые скобки должны быть закрыты скобками того же типа.
// 2. Открытые скобки должны быть закрыты в правильном порядке.
// 3. Каждой закрывающейся скобке соответствует открытая скобка того же типа.

// Пример 1:
// Input: s = "()"
// Output: true

// Пример 2:
// Input: s = "[()[]{}]"
// Output: true

// Пример 3:
// Input: s = "(]"
// Output: false

// Пример 4:
// Input: s = "([(]))"
// Output: false

import java.util.*;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()")); // true
        System.out.println(isValid("[()[]{}]")); // true
        System.out.println(isValid("(]")); // false
        System.out.println(isValid("([(]))")); // false
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        // Проходим по каждому символу строки
        for (char c : s.toCharArray()) {
            // Если это открывающая скобка, кладем ее в стек
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // Если это закрывающая скобка
            else {
                // Если стек пуст, то нет пары для закрывающей скобки
                if (stack.isEmpty()) {
                    return false;
                }
                // Проверяем, соответствует ли закрывающая скобка открывающей
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // Если стек пуст, все скобки закрыты правильно
        return stack.isEmpty();
    }
}
