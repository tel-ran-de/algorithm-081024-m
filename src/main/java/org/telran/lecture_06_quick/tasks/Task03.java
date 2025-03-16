package org.telran.lecture_06_quick.tasks;
import java.util.HashSet;
import java.util.Arrays;
// "Призеры олимпиады"
// По результатам олимпиады участники награждаются дипломами.
// Набравшие одинаковые баллы получают дипломы одинаковой степени.
// Призером олимпиады считается участник, получивший диплом не хуже III степени.
// По результатам олимпиады определите количество призеров.
// Вход: массив из N натуральных чисел – результаты участников.
// Выход: одно число – число призеров.

// Пример:
// Вход
// 1 3 4 3 5 6 7 7 6 1
// Выход
// 5

public class Task03 {
    public static void main(String[] args) {
        Integer[] results = {1, 3, 4, 3, 5, 6, 7, 7, 6, 1};

        // Сортируем результаты по убыванию
        Arrays.sort(results, (a, b) -> b - a);
        System.out.println(Arrays.toString(results));

//        int place = 0;

//        int prizeWinnersCount = 0;
//
//        for (int i = 0; i < results.length-1; i++) {
//            if (results[i] != results[i+1]) {
//                place++;
//            }
//            prizeWinnersCount++;
//            if (place >= 3)
//                break;
//         }
//
//        System.out.println("Количество призеров: " + prizeWinnersCount);

        // Находим третий уникальный балл
                int thirdHighest = -1;
                int uniqueCount = 0;

                // Перебираем отсортированный массив и ищем третий уникальный результат
                for (int i = 0; i < results.length; i++) {
                    if (i == 0 || !results[i].equals(results[i - 1])) {
                        uniqueCount++;
                    }

                    if (uniqueCount == 3) {
                        thirdHighest = results[i];
                        break;
                    }
                }

                // Если третий уникальный балл найден, подсчитываем призеров
                if (thirdHighest != -1) {
                    int count = 0;
                    for (int result : results) {
                        if (result >= thirdHighest) {
                            count++;
                        }
                    }

                    System.out.println(count);  // Выводим количество призеров
                } else {
                    System.out.println(0);  // Если третьего уникального балла нет
                }
            }

//        // Находим третий уникальный результат
//                Set<Integer> uniqueResults = new HashSet<>();
//                int thirdHighest = -1;
//
//                for (int result : results) {
//                    uniqueResults.add(result);
//                    if (uniqueResults.size() == 3) {
//                        thirdHighest = result;
//                        break;
//                    }
//                }
//
//                // Подсчитываем количество участников с результатами >= третьего уникального
//                int count = 0;
//                for (int result : results) {
//                    if (result >= thirdHighest) {
//                        count++;
//                    }
//                }
//
//                System.out.println(count);  // Выводим количество призеров
//            }
    }




