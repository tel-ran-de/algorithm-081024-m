// Задача: Проверить, является ли заданное число простым.

// Алгоритм:
// Проверить, делится ли число на 2. Если делится, то число не простое.
//     Пройти по всем нечетным числам от 3 до корня из числа.
//     Если число делится на какое-то из этих чисел, то оно не простое.
//     Если ни одно из чисел не является делителем, то число простое.

// 127
// 127 % 2 127 % 3
// 1 ... 127
// 1 ... sqt(127)
// 27 % 3 == 0
// 27 % 9 == 0

// n % 121 = 0
// n % 11 = 0
// 1 2 3  5  7  9
function is_prime(number) {
    if (number === 2) {
        return true
    }
    if (number % 2 === 0 || number === 1) {
        return false
    }
    for (let i = 3; i * i <= number; i += 2) {
        if (number % i === 0) {
            return false
        }
    }
    return true
}
// O(v(n))
console.log(`is_prime(1) - ${is_prime(1)}`)
console.log(`is_prime(2) - ${is_prime(2)}`)
console.log(`is_prime(3) - ${is_prime(3)}`)
console.log(`is_prime(9) - ${is_prime(9)}`)
console.log(`is_prime(11) - ${is_prime(11)}`)
console.log(`is_prime(21) - ${is_prime(21)}`)
console.log(`is_prime(427) - ${is_prime(427)}`)
console.log(`is_prime(1031) - ${is_prime(1031)}`)
console.log(`is_prime(10009) - ${is_prime(10009)}`)

// 5! = 1*2*3*4*5