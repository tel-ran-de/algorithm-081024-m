/** Динамическич массив в реализации класса */

class DynamicArray {
    constructor() {
        this.array = new Array(1); // Внутренний массив, для хранения элементов
        this.count = 0; // Количество занятых ячеек массива
        this.size = 1;  // Физический размер массива в памяти
    }

    // function add an element at the end of array
    add(data) {
        if (this.count >= this.size) { // Есть места не хватает
            let tmp = new Array(this.size * 2); // Создаем новый в 2 раза больше
            // Копируем элементы из старого
            for (let i = 0; i < this.size; i++) {
                tmp[i] = this.array[i];
            }
            this.array = tmp;
            this.size *= 2;
        }
        this.array[this.count] = data;
        this.count++;
    }

    // function remove last element
    remove() {
        if(this.size === this.count){
            return this.count - 1;
    }

    // function add an element at given index
    addAt(index, data) {
        // TODO-3: убрать дублирование кода
        if (this.count < this.size) { // Есть места хватает
            for (let i = this.count - 1; i >= index; i--) {
                this.array[i + 1] = this.array[i]; // сдвигаем все элементы вправо от текущего индекса
            }
        } else { // Есть места не хватает
            let tmp = new Array(this.size * 2); // Создаем новый в 2 раза больше
            // Копируем элементы из старого
            for (let i = 0; i < this.size; i++) {
                tmp[i] = this.array[i];
            }
            this.array = tmp;
            this.size *= 2;
        }
         this.array[index] = data;
            this.count++;
    }

    // function add an element at given index
    removeAt(index) {
        if (this.count > 0) {
            for (let i = index; i < this.count - 1; i++) {
                this.array[i] = this.array[i + 1]; // сдвигаем все элементы влево до текущего индекса
            }
            this.array[this.count - 1] = 0;
            this.count--;
        }
    }

    getArray() {
        return this.array;
    }

    length() {
        return this.count;
    }
}

// test DynamicArray
let da = new DynamicArray();
da.add(10);

console.log(da);
