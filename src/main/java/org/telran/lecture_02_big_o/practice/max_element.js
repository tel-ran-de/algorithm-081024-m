// Задача: Найти наибольший элемент в массиве целых чисел.

// Алгоритм:
// Создать переменную для хранения текущего наибольшего элемента и инициализировать ее первым элементом массива.
//     Пройти по массиву с начала до конца, сравнивая каждый элемент с текущим наибольшим.
//     Если текущий элемент больше наибольшего, обновить значение наибольшего.
//     Вернуть наибольший элемент.

const array = [1453, 520, 2455, 15460, 7565];
function max_element(numbers) {
    if (numbers.length === 0) { 
    }
    let max = numbers[0]; 
    for (let i = 1; i < numbers.length; i++) {
    if (numbers[i] > max) {
    max = numbers[i]; 
        }
    }
 return max;
}


console.log(max_element(array)); 


// Оценить сложность алгоритма
