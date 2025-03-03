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
    let result = [];
    let i = 0;
    let j = 0;
    while (i < left.length && j < right.length) {
        if (left[i] > right[j]) {
            result.push(left[i])
            i++;
        } else {
            result.push(right[j])
            j++;
        }
    }

    while (i < left.length) {
        result.push(left[i])
        i++;
    }
    while (j < right.length) {
        result.push(right[j])
        j++
    }
    return result;
}

function sumLargeFive(arr) {
    let sorted = mergeSort(arr)
    let sum = sorted.slice(0, 5).reduce((acc, num) => acc + num, 0)
    return sum
}

let numbers = [2, 4, -8, -5, 0, 7, 12, 0, -4, 10]
console.log(sumLargeFive(numbers));
