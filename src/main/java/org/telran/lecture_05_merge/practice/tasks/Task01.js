// "Сумма наибольших"
// Дан массив произвольных целых чисел
// Найти: сумму 5-ти самых больших элементов.
// Примечание: Используйте алгоритм сортировки, если нужно.

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
    let index1 = 0;
    let index2 = 0;
    let mergedArray = [];
    // 1
    while (index1 < left.length && index2 < right.length) {
        if (left[index1] < right[index2]) {
            mergedArray.push(left[index1++]);
        } else {
            mergedArray.push(right[index2++]);
        }
    }
    // 2
    while (index1 < left.length) {
        mergedArray.push(left[index1++]);
    }
    while (index2 < right.length) {
        mergedArray.push(right[index2++]);
    }
    return mergedArray;
}

let numbers = [2, 4, -8, -5, 0, 9, 12, 0, 10] // 12 10 9 4 2

// 1. Сортируем массив
let numbersSort = mergeSort(numbers);
// console.log(numbersSort);
// 2. Берем пять последних элементов и Суммировать эти элементы
let sumFive = 0
for (let i = numbersSort.length - 1; i >= numbersSort.length - 5; i--) {
    // console.log(numbersSort[i]);
    sumFive += numbersSort[i];
}
//
console.log("Сумма пяти наибольших =", sumFive);

// вариант решение второй
// let sorted = mergeSort(arr)
// let sum = sorted.slice(-5).reduce((acc, num) => acc + num, 0)
// console.log(sum)