/** Сортировка слиянием */

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
        }else{
            mergedArray.push(right[index2++]);
        }
    }
    // 2
    while (index1 < left.length){
        mergedArray.push(left[index1++]);
    }
    while (index2 < right.length){
        mergedArray.push(right[index2++]);
    }
    return mergedArray;
}

console.log(mergeSort([15, 21, 13, 5, 10, 7]));
console.log(mergeSort([-3, 12, -7, 22, 4, 0, 3]));
console.log(mergeSort([])); // -> []
console.log(mergeSort([2]));
