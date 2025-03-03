// Задача: "Объединение отсортированных массивов"
// Даны два целочисленных массива arr1 и arr2, каждый из которых отсортирован по возрастанию.
// Необходимо создать новый целочисленный массив mergedArray,
// который будет содержать все элементы массивов arr1 и arr2 в отсортированном порядке (также по возрастанию).

// Входные данные:
// arr1: Целочисленный массив, отсортированный по возрастанию.
// arr2: Целочисленный массив, отсортированный по возрастанию.

// Выходные данные:
// mergedArray: Целочисленный массив, содержащий все элементы arr1 и arr2 в отсортированном порядке по возрастанию.

// Ограничения:
// Массивы arr1 и arr2 могут быть пустыми.
// Элементы массивов arr1 и arr2 могут повторяться.

// Примеры:
//Вход: arr1 = [1, 3, 5, 7], arr2 = [2, 4, 6, 8]
//Выход: mergedArray = [1, 2, 3, 4, 5, 6, 7, 8]

//Вход: arr1 = [1, 2, 2, 5], arr2 = [1, 3, 4]
//Выход: mergedArray = [1, 1, 2, 2, 3, 4, 5]

//Вход: arr1 = [], arr2 = [1, 2, 3]
//Выход: mergedArray = [1, 2, 3]

function mergeSortedArrays(arr1, arr2) {
    const mergeArray = []
    let i = 0;
    let j = 0;
    while (i < arr1.length && j < arr2.length) {
        if (arr1[i] < arr2[j]) {
            mergeArray.push(arr1[i]);
            i++;
        } else {
            mergeArray.push(arr2[j]);
            j++;
        }
    }
    while (i < arr1.length) {
        mergeArray.push(arr1[i]);
        i++;
    }
    while (j < arr2.length) {
        mergeArray.push(arr2[j]);
        j++;
    }
    return mergeArray;
}

const arr1 = [1, 3, 5, 7];
const arr2 = [2, 4, 6, 8];
const mergedArray = mergeSortedArrays(arr1, arr2);
