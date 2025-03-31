class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    constructor() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Добавление элемента в конец списка O(1)
    append(data) {
        const newNode = new Node(data);
        if (!this.head) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.size++;
    }

    // Вставка элемента в начало списка O(1)
    prepend(data) {
        const newNode = new Node(data);
        if (!this.head) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
        this.size++;
    }

    // Вставка элемента по индексу O(n)
    insertAt(data, index) {
        //  FIXME: доработайте метод, добавив проверку на выход за границы списка
        const newNode = new Node(data);
        if (index === 0) {
            this.prepend(data);
        } else if (index === this.size) {
            this.append(data);
        } else {
            let current = this.head;
            let previous;
            for (let i = 0; i < index; i++) {
                previous = current;
                current = current.next;
            }
            newNode.next = current;
            previous.next = newNode;
            this.size++;
        }
    }

    // Удаление первого элемента по значению
    remove(data) {
        // TODO: напишите реализацию метода
        // 1. Найти индекс удаляемого узла
        // 2. Вызвать метод removeAt(найденный индекс)
    }
    // 3 -> 6 -> 3 -> 4 -> 6

    // Удаление элемента по индексу O(n)
    removeAt(index) {
        // TODO: напишите реализацию метода
        let current;
        if (index === 0){
            // 1
            current = this.head;
            this.head = current.next;
        }else if (index === this.size - 1){
            // 2
        }else{
            // 3
            current = this.head;
            let previous;
            for (let i = 0; i < index; i++) {
                previous = current;
                current = current.next;
            }
            previous.next = current.next;
        }
        this.size--;
        return current.data;
    }

    // Получение элемента по индексу O(n)
    getAt(index) {
        //  FIXME[complete]: доработайте метод, добавив проверку на выход за границы списка
        if (index < 0 || index >= this.size){
            return null;
        }
        let current = this.head;
        for (let i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    // Проверка, пустой ли список
    isEmpty() {
        return this.size === 0;
    }

    // Получение размера списка
    getSize() {
        return this.size;
    }

    // Очистка списка
    clear() {
        // TODO: напишите реализацию метода
    }

    // Вывод списка в консоль
    print() {
        let current = this.head;
        let result = '';
        while (current) {
            result += current.data + ' -> ';
            current = current.next;
        }
        result += 'null';
        console.log(result);
    }
}

// Пример использования
const myList = new LinkedList();
myList.append(1); // 0
myList.append(2); // 1
myList.append(3); // 2
// myList.prepend(4); // 0
myList.print();
myList.removeAt(0);
// console.log(myList.getSize())
// console.log(myList.getAt(2))
// myList.insertAt(10, 1);
myList.print();