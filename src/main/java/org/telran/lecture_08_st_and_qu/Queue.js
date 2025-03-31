/** ЗАДАЧА Q */
class Queue {
    constructor(capacity) {
        this.capacity = capacity;
        this.items = new Array(capacity);
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }

    enqueue(element) {
        if (this.isFull()) {
            console.log("Queue is full");
        } else {
            this.items[this.tail] = element;
            this.tail = (this.tail + 1) % this.capacity; // Циклический сдвиг
            this.size++;
        }

    }

    dequeue() {
        if (this.isEmpty()) {
            console.log("Queue is empty");
        } else {
            const element = this.items[this.head];
            this.head = (this.head + 1) % this.capacity; // Циклический сдвиг
            this.size--;
            return element;
        }

    }

    peek() {
        if (isEmpty()) {
            console.log("Queue is empty");
            return -1;
        } else {
            return items[head];
        }
    }

    isEmpty() {
        return this.size === 0;
    }

    isFull() {
        return this.size === this.capacity;
    }

    get length() {
        return this.size
    }
}

const queue = new Queue();

// [][][][][]
// .enqueue(5)
// [5][][][][]
// .enqueue(4)
// [5][4][][][]
// [5][4][3][2][1]
// .dequeue() O(n)
// [5][4][3][2][1]
// [4][3][2][1][x]

//  h           t
// [5][4][3][2][1]
// .dequeue()
//     h        t
// [5][4][3][2][1]
// .dequeue()
//        h     t=4 c=5
// [5][4][3][2][1]
// .enqueue(8)

// t = 4 -> 5 % 5 -> 0 + 1 -> 1 % 5 -> 1
// t = 0 -> 1 -> 2 -> 3 -> 4 -> 0 -> 1
// this.tail = (this.tail + 1) % this.capacity;
//
// this.tail += 1;
// if (this.tail >= this.capacity)  this.tail = 0;