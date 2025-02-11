// Задача: Вычислить факториал заданного числа.

// Алгоритм:
// Создать переменную для хранения результата и инициализировать ее единицей.
//     Умножить результат на все числа от 1 до заданного числа.
//     Вернуть результат.


function factorial(number) {
    if (number < 0) return undefined;
    let result = 1;
    for (let i = 1; i <= number; i++) {
        result = result*i;
    }
    return result;
}
    console.log(factorial);


// Оценить сложность алгоритма
