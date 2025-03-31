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

    // Добавление элемента в конец списка
    append(data) {
        const newNode = new Node(data);
        if (!this.head) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
    }

    // Вставка элемента в начало списка
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

    // Вставка элемента по индексу
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

    // Удаление элемента по значению
    remove(data) {
        // TODO: напишите реализацию метода
    }

    // Удаление элемента по индексу
    removeAt(index) {
        // TODO: напишите реализацию метода
    }

    // Получение элемента по индексу
    getAt(index) {
        //  FIXME: доработайте метод, добавив проверку на выход за границы списка
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
myList.append(1);
myList.append(2);
myList.print();