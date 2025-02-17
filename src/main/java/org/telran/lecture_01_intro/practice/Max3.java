package org.telran.lecture_01_intro.practice;

public class Max3 {
    public static void main(String[] args) {
//        System.out.println(max3(2, 5, -4)); // 5
//        System.out.println(max3(2, 5, 14)); // 14
//        System.out.println(max3(12, 5, -4)); // 12

    }

//    1/Получить три числа. Обозначим их как a, b и c.
//    2/Сравнить a и b.
//    Если a больше b, то переходим к шагу 3.
//    Иначе, b больше или равно a, тогда присваиваем b значение a.
//    3. Сравнить a и c.
//    Если a больше c, то a - наибольшее число, завершаем алгоритм.
//      Иначе, c больше или равно a, тогда c - наибольшее число, завершаем алгоритм.

    public static int max3(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            }else{
                return c;
            }
        }else{
            return b;
        }
    }
}
