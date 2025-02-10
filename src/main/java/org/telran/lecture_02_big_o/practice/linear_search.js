// Задача: Найти элемент в массиве целых чисел.

// Алгоритм:
//     Пройти по массиву с начала до конца, сравнивая каждый элемент с искомым.
//     Если элемент найден, вернуть его индекс.
//     Если элемент не найден, вернуть -1.

// Решение
function linear_search(numbers, target_number) {
    for (let i = 0; i < numbers.length; i++) {
        if (numbers[i] === target_number) {
            return i;
        } 
    }
    return -1;
}

let num = [2, 7, -4, 4, 3, 0, 5, 10]

console.log(linear_search(num, 10)); // 7
console.log(linear_search(num, 6)); // -1
console.log(linear_search(num, 2)); // 0

// Оценить сложность алгоритма O(n) - линейная
