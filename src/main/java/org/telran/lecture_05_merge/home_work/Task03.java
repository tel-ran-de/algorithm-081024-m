package Homework.Homezadacha5;
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
import java.util.Collections;

public class Task03 {
    public static void main(String[] args) {
        Integer[] prices = {10, 2, 50, 1, 100}; // Цены товаров которые вы купили
        System.out.println(maxCheck(prices));
    }

    public static int maxCheck(Integer[] prices) {
//        Arrays.sort(prices, Collections.reverseOrder());
        int sum = 0;
        for (int i = 0; i < prices.length; i += 2) { //vigoda max dlya magazina
            sum += prices[i]; //
//        for (int i = prices.length - 1; i >= 0; i -= 2) { //max ekonomiya
//            sum += prices[i];
//        }

        }return sum;
    }
}
//proboval raznie varianty, esli kazdij vtoroj besplatno  - daze sortirovka nenuzna.
//eto max vigoda dlya magazina
