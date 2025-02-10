// Задача: Найти элемент в массиве целых чисел.

// Алгоритм:
//     Пройти по массиву с начала до конца, сравнивая каждый элемент с искомым.
//     Если элемент найден, вернуть его индекс.
//     Если элемент не найден, вернуть -1.

// Решение
function linear_search(numbers, target_number) {
   function linear_search(numbers, target_number) {
    for (let i = 0; i < numbers.length; i++) {
        if (numbers[i] === target_number) {
            return i;
        }
    }
    return -1;
}

let numbers = [1, 8, -3, 45, -7];
let target_number = 45;

let index = linear_search(numbers, target_number);
console.log(index); 
}

// Оценить сложность алгоритма
