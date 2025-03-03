/** Сортировка слиянием */

function mergeSort(arr) {
    if (arr.length === 1) {
        return arr;
    }
    let mid = Math.floor(arr.length / 2);
    let leftArr = arr.slice(0, mid);
    let rightArr = arr.slice(mid);
    return merge(mergeSort(leftArr), mergeSort(rightArr));
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

console.log(mergeSort([15, 21, 13, 5, 10, 7]));
