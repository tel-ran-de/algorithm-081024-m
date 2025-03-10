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
function mergeSort(arr) {
    if (arr.length <= 1) {
        return arr;
    }
    let mid = Math.floor(arr.length / 2);
    let leftArr = arr.slice(0, mid);
    let rightArr = arr.slice(mid);
    return merge(mergeSort(leftArr), mergeSort(rightArr));
}

function merge(left, right) {
    let index1 = 0;
    let index2 = 0;
    let mergedArray = [];
    // 1
    while (index1 < left.length && index2 < right.length) {
        if (left[index1] < right[index2]) {
            mergedArray.push(left[index1++]);
        } else {
            mergedArray.push(right[index2++]);
        }
    }
    // 2
    while (index1 < left.length) {
        mergedArray.push(left[index1++]);
    }
    while (index2 < right.length) {
        mergedArray.push(right[index2++]);
    }
    return mergedArray;
}

let prices = [2, 1, 10, 50, 10, 18]; // Цены товаров которые вы купили

// 1. сортировать [1, 2, 10, 10, 50]
sort_prices = mergeSort(prices)

// 2. Делим пополам
let centerIndex = Math.floor(sort_prices.length / 2);
// 3. Находим сумму правой части
let total_price = 0;
for (let i = centerIndex; i < sort_prices.length; i++) {
    total_price += sort_prices[i];
}

console.log(total_price);