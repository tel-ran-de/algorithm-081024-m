function hanoi(n, start, end, aux) {
    // n: количество дисков
    // start: начальный столбец
    // end: конечный столбец
    // aux: вспомогательный столбец

    if (n === 1) {
        console.log(`Переместить диск 1 с ${start} на ${end}`);
        return;
      }
      hanoi(n - 1, start, aux, end);
      console.log(`Переместить диск ${n} с ${start} на ${end}`);
      hanoi(n - 1, aux, end, start)    
}

hanoi(3, 'A', 'C', 'B'); // Выводит в терминал описание действие по перемещению дисков "A" --> "C"
