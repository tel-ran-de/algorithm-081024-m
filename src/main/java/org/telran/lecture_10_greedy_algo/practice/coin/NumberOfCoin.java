package org.telran.lecture_10_greedy_algo.practice.coin;

import java.util.ArrayList;
import java.util.List;

// Напишите программу, используя жадный алгоритм.
// Задача:
// Монетная система некоторого государства состоит из монет достоинством: 1, 2, 5, 10
// Требуется выдать сумму x, наименьшим возможным количеством монет.


public class NumberOfCoin {

    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 10};
        int sum = 100;
        System.out.print(getChange(sum, coins));
    }

    private static List<Integer> getChange(int sum, int[] coins) {
        if (coins == null || coins.length == 0){
            throw new IndexOutOfBoundsException("Invalid coins array.");
        }
        
        List<Integer> result = new ArrayList<>();
        List<Integer> coinsList = Arrays.stream(coins).boxed().sorted(Comparator.reverseOrder()).toList();
        int sumCopy = sum;
        for (int coin : coinsList) {
            while (sumCopy >= coin) {
                if (sumCopy == coin) {
                    result.add(coin);
                    return result;
                }
                sumCopy -= coin;
                result.add(coin);
            }
        }
        return new ArrayList<>();
    }
}
