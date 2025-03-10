package org.telran.lecture_05_merge.home_work;

// "Рекламная акция"
// В сети магазинов "Н-Аудио" проводится рекламная акция. Каждый второй товар – бесплатно.
// Естественно, кассирам дано указание пробивать товары в таком порядке, чтобы магазин потерял как можно меньше денег.
// По списку товаров определите максимальную сумму в чеке.
//
// Вход: дан массив натуральных чисел – цены товаров.
// Выход: одно число – максимальная сумма чека.

// Пример
// Вход:
    // 2 1 10 50 10
// Выход:
    // 70
// Пояснение:
    // Возможен такой порядок: 10 2 50 1 10

import java.util.Arrays;

public class Task03 {
    public static void main(String[] args) {
        int[] prices = {2, 1, 10, 50, 10, 22, 2}; // Цены товаров которые вы купили
        System.out.println(getMaxDiscountedTotal(prices));
    }

    public static int getMaxDiscountedTotal(int[] prices) {
        Arrays.sort(prices);
        int sum = 0;
        for (int i = prices.length / 2; i < prices.length; i++) {
            sum += prices[i];
        }
        return sum;
    }
}