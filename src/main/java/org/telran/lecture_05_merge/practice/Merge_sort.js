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

function mergeSort(arr) {
    if (arr.length === 1) {
        return arr;
    }
    let mid = Math.floor(arr.length / 2);
    let leftArr = arr.slice(0, mid);
    let rightArr = arr.slice(mid);
    return merge(mergeSort(leftArr), mergeSort(rightArr));
}

function merge(left, right) {
    let result = [];
    i = 0
    j = 0
    while(i < left.length && j <right.length){
        if (left[i] <= right[j]){
            result.push(left[i])
            i++
        }else{
            result.push(right[j])
            j++
        }
    }
    while(i < left.length){
        result.push(left[i])
        i++
    }
    while (j < right.length) {
        result.push(right[j]);
        j++;
    }
       return result;
}

console.log(mergeSort([15, 21, 13, 5, 10, 7]));
