// Задача: Вычислить факториал заданного числа.

// Алгоритм:
// Создать переменную для хранения результата и инициализировать ее единицей.
//     Умножить результат на все числа от 1 до заданного числа.
//     Вернуть результат.

function factorial(number) {
    if(number == 0){
        return 1
    }
    let result = 1
    for (let i = 1; i <= number; i++) {
        result *= i   
    }
    return result
}
console.log(`factorial(0) - ${factorial(0)}`);
console.log(`factorial(1) - ${factorial(1)}`);
console.log(`factorial(2) - ${factorial(2)}`);
console.log(`factorial(4) - ${factorial(4)}`);
console.log(`factorial(10) - ${factorial(10)}`);

// Оценить сложность алгоритма O(n)
