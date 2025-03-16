package org.telran.lecture_06_quick.hw;

// "Камни"
// Имеется N камней веса А1,А2,...,АN.
// Необходимо разбить их на две кучи таким образом, чтобы веса куч отличались не более чем в 2 раза.
// Если этого сделать нельзя, то указать это.

// Вход: массив целых чисел - веса камней
// Выход: два числа - вес первой и второй куч. Или сообщение "Разбить на две кучи нельзя"

public class Task05 {
    public static void main(String[] args) {
        Integer[] stones = {3, 5, 8, 25, 3, 5, 10};
        System.out.println("stones = " + Arrays.toString(stones));
        System.out.println("splitStonesBalanced(stones) = " + Arrays.toString(splitStonesBalanced(stones)));
    }

    public static int[] splitStonesBalanced(Integer[] stones) {
        Arrays.sort(stones, Comparator.reverseOrder());
        int sum1 = 0, sum2 = 0;
        for (int stone : stones) {
            if (sum1 <= sum2) {
                sum1 += stone;
            } else {
                sum2 += stone;
            }
        }
        if (sum1 <= sum2 * 2) {
            return new int[]{sum1, sum2};
        } else throw new RuntimeException("The stones cannot be split into two piles.");
    }
}
