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

function merge(left, right) {
    let result = [];
    // TODO: добавьте реализацию методы
      let leftIndex = 0;
    let rightIndex = 0;
    while(leftIndex < left.length && rightIndex < right.length) {
        if(left[leftIndex] < right[rightIndex]) {
            result.push(left[leftIndex]);
            leftIndex++;
        } else {
            result.push(right[rightIndex]);
            rightIndex++;
        }
    }
    return result;
}

console.log(mergeSort([15, 21, 13, 5, 10, 7]));
