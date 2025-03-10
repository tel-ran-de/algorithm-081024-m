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
function mergeSort(arr) { // сортировка слиянием
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
    i = 0
    j = 0
    while(i < left.length && j <right.length){
        if (left[i] <= right[j]){
            result.push(left[i])
            i++
        }else{
            result.push(right[j])
            j++
        }
    }
    while(i < left.length){
        result.push(left[i])
        i++
    }
    while (j < right.length) {
        result.push(right[j]);
        j++;
    }
       return result;
}
function totalPrice(arr) {
    let sortArr = mergeSort(arr)
    let sum = 0
    let mid = Math.floor(sortArr.length / 2)
    let biggerPriceArr = sortArr.slice(mid)// берет элементы массива с середины до конца
    for (let i = 0; i < biggerPriceArr.length; i++) {
        sum +=biggerPriceArr[i]        
    }
    return sum       
}
console.log(totalPrice(prices));
