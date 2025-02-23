function hanoi(n, start, end, aux) {
    // n: количество дисков
    // start: начальный столбец
    // end: конечный столбец
    // aux: вспомогательный столбец

    function hanoi(n, start, end, aux) {
    if (n === 1) {
        console.log(`Перемещаем с ${start} на ${end}`);
        return;
    }
    hanoi(n - 1, start, aux, end);
    console.log(`Перемещаем с ${start} на ${end}`);
    hanoi(n - 1, aux, end, start);
}

hanoi(3, 'A', 'C', 'B');
}
