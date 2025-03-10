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
