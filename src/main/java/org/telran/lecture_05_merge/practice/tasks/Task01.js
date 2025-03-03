// "Сумма наибольших"
// Дан массив произвольных целых чисел
// Найти: сумму 5-ти самых больших элементов.
// Примечание: Используйте алгоритм сортировки, если нужно.

let numbers = [2, 4, -8, -5, 0, 7, 12, 0, -4, 10]
function mergeSort(arr) {
    if (arr.length <= 1) {
        return arr;
    }
    let mid = Math.floor(arr.length / 2);
    let leftArr = arr.slice(0, mid);
    let rightArr = arr.slice(mid);
    return merge(mergeSort(leftArr), mergeSort(rightArr));
}

function merge(left, right) {
    let result = [];
    let index1 = 0
    let index2 = 0
    while(index1 < left.length && index2 < right.length){
        if (left[index1] < right[index2] ) {
            result.push(left[index1++])
        } else {
            result.push(right[index2++])
        }
    }
    while (index1 < left[index1]) {
        result.push(left[index1++])
    }
    while (index2 < right[index2]) {
        result.push(right[index2++])
    }
    return result;
}

let numbers = [2, 4, -8, -5, 0, 7, 12, 0, -4, 10]
let numbersOf5 = mergeSort(numbers).slice(-5)
let sum = 0
for (let i = 0; i < numbersOf5.length; i++) {
  sum += numbersOf5[i]
}
console.log(sum);
