// "Простая сортировка"
// Дан массив произвольных целых чисел
// Используя любой алгоритм сортировки из lecture_6, отсортируйте элементы в порядке возрастания.
function quickSort(array, start = 0, end = array.length - 1) {
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

const numbers = [3, -5, 0, 4, 12, -2, 10];

quickSort(numbers);
console.log(numbers);