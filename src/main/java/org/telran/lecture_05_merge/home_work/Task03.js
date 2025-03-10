// "Рекламная акция"
// В сети магазинов "Н-Аудио" проводится рекламная акция. Каждый второй товар – бесплатно.
// Естественно, кассирам дано указание пробивать товары в таком порядке, чтобы магазин потерял как можно меньше денег.
// По списку товаров определите максимальную сумму в чеке.
//
// Вход: дан массив натуральных чисел – цены товаров.
// Выход: одно число – максимальная сумма чека.

// Пример
// Вход:
// 2 1 10 50 10
// Выход:
// 70
// Пояснение:
// Возможен такой порядок: 10 2 50 1 10

function calculateMaxReceiptSum(prices) {
    let sum = 0;   
    while (prices.length > 0) {
        let maxIndex = prices.indexOf(Math.max(...prices));
        sum += prices[maxIndex];
        prices.splice(maxIndex, 1);
        if (prices.length > 0) {
            let minIndex = prices.indexOf(Math.min(...prices));
            prices.splice(minIndex, 1);
        }
    }

let prices = [2, 1, 10, 50, 10]; // Цены товаров которые вы купили
