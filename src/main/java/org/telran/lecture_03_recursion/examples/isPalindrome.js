function isPalindrome(str) {
    // Приводим строку к нижнему регистру
    str = str.toLowerCase()
    // Базовый случай: пустая строка или строка из одного символа - палиндром
    if (str.length <= 1) {
        return true;
    }

    // Рекурсивный случай: сравниваем первый и последний символы
    if (str[0] === str[str.length - 1]) {
        // Если символы совпадают, проверяем оставшуюся часть строки
        return isPalindrome(str.slice(1, str.length - 1));
    } else {
        // Если символы не совпадают, строка не палиндром
        return false;
    }
}