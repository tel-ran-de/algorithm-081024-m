// "Сумма наибольших"
// Дан массив произвольных целых чисел
// Найти: сумму 5-ти самых больших элементов.
// Примечание: Используйте алгоритм сортировки, если нужно.

let numbers = [2, 4, -8, -5, 0, 7, 12, 0, -4, 10]

function sumFiveBiger(arr){
    let sortArr = mergeSort(arr)
    let sumFive = 0
    for (let i = sortArr.length-1; i >= 5; i--) {
        sumFive += sortArr[i]
    }
    return sumFive
}
console.log(sumFiveBiger(numbers));

function mergeSort(arr){
    if(arr.length === 1){
        return arr
    }
    let mid = Math.floor(arr.length / 2)
    let leftArr = arr.slice(0, mid)
    let rightArr = arr.slice(mid)
    return merge(mergeSort(leftArr), mergeSort(rightArr))
}
function merge(arr1, arr2) {
   const mergedArray = []
    let i = 0
    let j = 0
    for (; i < arr1.length && j < arr2.length;) {
        if (arr1[i] <= arr2[j]) {
            mergedArray.push(arr1[i]);
            i++;
        } else {
            mergedArray.push(arr2[j]);
            j++;
        }
    }
    for (; i < arr1.length; i++) {
        mergedArray.push(arr1[i]);
    }
    for (; j < arr2.length; j++) {
        mergedArray.push(arr2[j]);
    }
    return mergedArray;
}
