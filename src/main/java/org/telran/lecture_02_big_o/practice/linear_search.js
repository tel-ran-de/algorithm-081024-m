// Задача: Найти элемент в массиве целых чисел.

// Алгоритм:
//     Пройти по массиву с начала до конца, сравнивая каждый элемент с искомым.
//     Если элемент найден, вернуть его индекс.
//     Если элемент не найден, вернуть -1.

// Решение
    const array = [4, 3, 2, 34, 21];
    function linear_search(numbers, target_number) {
    for (let i = 0; i < numbers.length; i++) {
        if (numbers[i] === target_number) {
            return i; 
        }
    }
    return -1; 
}

console.log(linear_search(array, 30)); 

}

// Оценить сложность алгоритма
