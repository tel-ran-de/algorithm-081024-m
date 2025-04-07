// Напишите программу, используя жадный алгоритм.
// Задача:
// Монетная система некоторого государства состоит из монет достоинством: 1, 2, 5, 10
// Требуется выдать сумму x, наименьшим возможным количеством монет.


function getChange(sum, coins) {
    let result = [];
    coins.sort((a, b) => b - a);
    
    for (let i = 0; i < coins.length; i++) {
        const coin = coins[i];
        const count = Math.floor(sum / coin);
        for (let j = 0; j < count; j++) {
            result.push(coin);
        }
        sum -= coin * count;
    }
    
    return result
}

const coins = [1, 2, 5, 10];
const sum = 100;

let changeCoins = getChange(sum, coins);
console.log(changeCoins);
