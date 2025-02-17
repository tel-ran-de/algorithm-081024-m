// Задача: Проверить, является ли заданное число простым.

// Алгоритм:
// Проверить, делится ли число на 2. Если делится, то число не простое.
//     Пройти по всем нечетным числам от 3 до корня из числа.
//     Если число делится на какое-то из этих чисел, то оно не простое.
//     Если ни одно из чисел не является делителем, то число простое.

function is_prime(number) {
    if(number === 2){
        return true;
    }
    if(number % 2 === 0 || number ===1){
        return false
    }
    for(let i = 3; i * i <= number; i+=2){
        if(number % i === 0){
            return false
        }
    }
    return true
}
console.log(`is_prime(1) - ${is_prime(1)}`);
console.log(`is_prime(2) - ${is_prime(2)}`);
console.log(`is_prime(5) - ${is_prime(5)}`);
console.log(`is_prime(9) - ${is_prime(9)}`);
console.log(`is_prime(11) - ${is_prime(11)}`);
console.log(`is_prime(2777) - ${is_prime(2777)}`);

// Оценить сложность алгоритма O(v(n))
