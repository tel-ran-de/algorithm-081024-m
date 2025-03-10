// "Сумма с условием"
// Дан массив произвольных целых чисел
// Найти: сумму элементов списка, больших данного числа a. Значение a можно задать самостоятельно.
// Примечание: Используйте алгоритм сортировки, если нужно.

let numbers = [1, 12, 3, 14, 5, -4, 20]; // O(n)
let a = 10;

let sum2 = 0;
function sumWithCondition(array) {
    if (array.length == 0) {
        return 0;
    }
    for (let i = 0; i < array.length; i++) {
        if (array[i] > a) {
            sum2 += array[i];
        }
    }
    return sum2;
}

console.log("Task 2. Сумма с условием: " + sumWithCondition(numbers2));
