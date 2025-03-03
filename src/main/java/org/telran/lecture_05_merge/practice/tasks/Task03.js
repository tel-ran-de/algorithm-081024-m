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

function totalPrice(arr){
    let sortArr = mergeSort(arr)
    let sum = 0
    let mid = Math.floor(sortArr.length / 2)
    let bigerPriceArr = sortArr.slice(mid)
    for (let i = 0; i < bigerPriceArr.length; i++) {
        sum += bigerPriceArr[i]
    }
}
console.log(totalPrice(prices));



function mergeSort(arr){
    if(arr.length === 1){
        return arr
    }
    let mid = Math.floor(arr.length / 2)
    let leftArr = arr.slice(0, mid)
    let rightArr = arr.slice(mid)
    return merge(mergeSort(leftArr), mergeSort(rightArr))
}
function merge(arr1, arr2) {
   const mergedArray = []
    let i = 0
    let j = 0
    for (; i < arr1.length && j < arr2.length;) {
        if (arr1[i] <= arr2[j]) {
            mergedArray.push(arr1[i]);
            i++;
        } else {
            mergedArray.push(arr2[j]);
            j++;
        }
    }
    for (; i < arr1.length; i++) {
        mergedArray.push(arr1[i]);
    }
    for (; j < arr2.length; j++) {
        mergedArray.push(arr2[j]);
    }
    return mergedArray;
}
