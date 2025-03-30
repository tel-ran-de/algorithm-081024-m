package org.telran.lecture_8_st_and_qu.hw;

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

public class ValidParentheses {
  public static void main(String[] args) {
        System.out.println("areParenthesesValid(\"()\") = " + areParenthesesValid("()"));
        System.out.println("areParenthesesValid(\"(()())\") = " + areParenthesesValid("(()())"));
        System.out.println("areParenthesesValid(\"[()[]{}]\") = " + areParenthesesValid("[()[]{}]"));
        System.out.println("areParenthesesValid(\"(]\") = " + areParenthesesValid("(]"));
        System.out.println("areParenthesesValid(\"([(]))\") = " + areParenthesesValid("([(]))"));
    }

 public static boolean areParenthesesValid(String s) {
        Stack<Character> characterStack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                characterStack.push(c);
            } else if (!characterStack.isEmpty()) {
                char lastParenthesis = characterStack.pop();
                if ((lastParenthesis == '(' && c == ')') || (lastParenthesis == '[' && c == ']') || (lastParenthesis == '{' && c == '}')) {
                    continue;
                }
                return false;
            }
        }
        return characterStack.isEmpty();
    }
}
