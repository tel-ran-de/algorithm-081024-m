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


public class Task03 {
    public static void main(String[] args) {
        int[] prices = {2, 1, 10, 50, 10}; // Цены товаров которые вы купили
        int[] sortedPrices = mergeSort(prices);
        System.out.println(Arrays.toString(sortedPrices));

        int middle = sortedPrices.length / 2;
        //Arrays.copyOfRange(originalArray, from, to);
        int[] expensiveItems = Arrays.copyOfRange(sortedPrices, middle, sortedPrices.length);
        System.out.println(Arrays.toString(expensiveItems));

        int sum = 0;
        for (int price : expensiveItems) {
            sum += price;
        }
        System.out.println("Максимальная сумма чека: " + sum);
    }
}
