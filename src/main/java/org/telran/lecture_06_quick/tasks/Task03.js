// "Призеры олимпиады"
// По результатам олимпиады участники награждаются дипломами.
// Набравшие одинаковые баллы получают дипломы одинаковой степени.
// Призером олимпиады считается участник, получивший диплом не хуже III степени.
// По результатам олимпиады определите количество призеров.
// Вход: массив из N натуральных чисел – результаты участников.
// Выход: одно число – число призеров.

// Пример:
// Вход
// 1 3 4 3 5 6 7 7 6 1
// Выход
// 5

let results = [1, 3, 4, 3, 5, 6, 7, 7, 6, 1]
//Вариант 1
function findWinners(array){
    let sortedResults = array.sort((a, b) => b - a);
    let winnersCount = 0
    for (let i = 0; i < sortedResults.length; i++) {
        if(array[i] < array[0] - 2){
            winnersCount++
        }
    }
    return winnersCount
}
let winners = findWinners(results)
console.log(`Количество призеров: ${winners}`);
//Вариант 2
function findWinners(array){
    let firstPlaceResult = 0
    let winnersCount = 0
    for (let i = 0; i < array.length; i++) {
        if(firstPlaceResult < array[i]){
            firstPlaceResult = array[i]
        }
    }
    for (let i = 0; i < array.length; i++) {
        if(array[i] < firstPlaceResult - 2){
            winnersCount++
        }
    }
    return winnersCount
}
let winners = findWinners(results)
console.log(`Количество призеров: ${winners}`);
