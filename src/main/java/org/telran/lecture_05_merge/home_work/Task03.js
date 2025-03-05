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

let prices = [2, 1, 10, 50, 10]; // Цены товаров которые вы купили
let sortedPrice = mergeSort(prices)
let payProduct = sortedPrice.slice(Math.floor(prices.length / 2)) 
let sumPrice = 0
for (let i = 0; i < payProduct.length; i++) {
    sumPrice += payProduct[i]
    
}
console.log(sumPrice);

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
    let result = [];
    let index1 = 0
    let index2 = 0
    while(index1 < left.length && index2 < right.length){
        if (left[index1] < right[index2] ) {
            result.push(left[index1++])
        } else {
            result.push(right[index2++])
        }
    }
    while (index1 < left[index1]) {
        result.push(left[index1++])
    }
    while (index2 < right[index2]) {
        result.push(right[index2++])
    }
    return result;
}
