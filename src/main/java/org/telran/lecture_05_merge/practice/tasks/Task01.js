// "Сумма наибольших"
// Дан массив произвольных целых чисел
// Найти: сумму 5-ти самых больших элементов.
// Примечание: Используйте алгоритм сортировки, если нужно.

let numbers = [2, 4, -8, -5, 0, 7, 12, 0, -4, 10]

function sumLargest(array) {
    if (array.length === 0) {
        return 0
    }
    let sortedArrays = mergeSort(array)
    let sum = 0;
    let count = 0;
    for (let i = Math.max(0, sortedArrays.length - 5); i < sortedArrays.length; i++) {
        sum += sortedArrays[i];
        count++;
    }
    return sum;
}
