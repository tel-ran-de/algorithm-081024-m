// "Сумма с условием"
// Дан массив произвольных целых чисел
// Найти: сумму элементов списка, больших данного числа a. Значение a можно задать самостоятельно.
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
let numbers2 = [1, 12, 3, 14, 5, -4, 20];
let a = 0;
let sortedNumbers = mergeSort(numbers2)
let sum2 = 0
for (let i = 0; i < sortedNumbers.length; i++) {
   if (sortedNumbers[i] > a) {
    sum2 += sortedNumbers[i]
   }
    
}
console.log(sum2);
