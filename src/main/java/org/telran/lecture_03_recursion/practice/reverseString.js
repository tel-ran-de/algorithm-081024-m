// Задача: перевернуть строку наоборот
// пример: "hello" --> "olleh"

// Дана готовая реализация через итеративный подход.
// Напишите решение, используя рекурсивный подход.

function reverseStringIterative(str) {
    let reversedString = ""; // Создаем пустую строку для хранения результата

    // Проходим по строке с конца до начала
    for (let i = str.length - 1; i >= 0; i--) {
        reversedString += str[i]; // Добавляем текущий символ в начало новой строки
    }

    return reversedString;
}

function reverseStringRecursive(str){
    // You code...
}

// Примеры использования:
console.log(reverseStringIterative("hello")); // "olleh"
console.log(reverseStringIterative("JavaScript")); // "tpircSavaJ"
console.log(reverseStringIterative("12345")); // "54321"