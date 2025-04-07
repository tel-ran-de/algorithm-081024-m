// Напишите программу, используя жадный алгоритм.
// Задача:
// Монетная система некоторого государства состоит из монет достоинством: 1, 2, 5, 10
// Требуется выдать сумму x, наименьшим возможным количеством монет.


function getChange(sum, coins) {
    let resultCoins = [];
    let copyCoins = [...coins];
    copyCoins.sort((a, b) => b - a);
    // [ 10, 5, 2, 1 ]
    let coin = copyCoins[0];
    let indexCoin = 0;
    while (sum > 0) {
        if (sum >= coin) {
            sum -= coin;
            resultCoins.push(coin);
        } else { // Берем монету помельче
            coin = copyCoins[++indexCoin];
        }
    }
    return resultCoins
}

const coins = [1, 2, 5, 10];    // V
const sum = 20;

let changeCoins = getChange(sum, coins);
console.log(changeCoins);