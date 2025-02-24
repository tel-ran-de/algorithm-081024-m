// Задача:
// Дано целое положительное число.
// Найдите сумму его чисел

// Напишите рекурсивное решение

// Алгоритм
// Базовый случай:
// Если число n равно 0, функция возвращает 0. Это останавливает рекурсию.
// Рекурсивный случай:
// n % 10 извлекает последнюю цифру числа.
// Math.floor(n / 10) - отбрасывает последнюю цифру.
// Функция рекурсивно вызывает саму себя с оставшимся числом и добавляет извлеченную цифру к результату рекурсивного вызова.

function sumOfDigitsRecursive(n) {
    if (n === 0){
    return 0
   }
  let lastSymbol = n % 10
  let cutLastSymbol = Math.floor(n / 10)
  return lastSymbol + sumOfDigitsRecursive (cutLastSymbol)
}

const number = 12345;
const result = sumOfDigitsRecursive(number);
console.log(`Сумма цифр числа ${number} равна ${result}`);
