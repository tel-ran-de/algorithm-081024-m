// "Сумма наибольших по модулю"
// Дан массив чисел.
// Найти: сумму 5-ти самых больших элементов по модулю.
// Пояснение: сравниваем элементы по модулю, а в сумму добавляем сами значения элементов(без модуля)
// В примере ниже, два самых больших по модулю числа это: -224 и 211. Они самые большие по модулю, а их сумма = -13
function sumFiveModNumbers(array){
    let modSortNum = array.sort((a, b) => Math.abs(a) - Math.abs(b))
    let modSortNum5 = modSortNum.slice(-5)
    let sum = 0
   for (let i = 0; i < modSortNum5.length; i++) {
    sum += modSortNum5[i]
   }
    return sum
}
