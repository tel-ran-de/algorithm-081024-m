/** Быстрая сортировка */

function quickSort(array, start, end) {
    if (start < end) {
        let indexPivot = partition(array, start, end);
        // smaller to the left
        quickSort(array, start, indexPivot - 1);
        // bigger to the right
        quickSort(array, indexPivot + 1, end);
    }
}

function partition(array, start, end) {
    let pivot = array[end]; // choose pivot element
    let indexPivot = start; // Index of smaller element and indicates the right position

    for (let i = start; i < end; i++) {
        if (array[i] <= pivot) {
            swap(array, i, indexPivot);
            indexPivot++;
        }
    }
    swap(array, end, indexPivot); // swap pivot to right position

    return indexPivot;
}

function swap(array, first, second) {
    let temp = array[first];
    array[first] = array[second];
    array[second] = temp;
}

let testArray = [39, 22, 2, 55, 6, 20];
quickSort(testArray, 0, testArray.length - 1);
console.log(testArray);


// [20, 2, 12, 4, 8, 3, 5]
// // pivot = 20
//
// [ 2, 12, 4, 1, 3, 6, 20]
// // pivot = 2
//
// [2, 12, 4, 8, 3, 6, 20]
// // O(n^2)
// // O(n*log n)
// // O(n*log n)