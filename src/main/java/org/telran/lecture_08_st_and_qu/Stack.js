/** Реализация СТЕКА */
class Stack {
    constructor(size = 100) {
        this.top = -1;
        this.capacity = size;
        this.data = new Array(size);
    }

    isEmpty() {
        return (this.top < 0);
    }

    isFull(){
        return this.top >= (this.capacity - 1)
    }

    push(x) {
        if (this.isFull()) {
            throw new Error("Stack Overflow");
        } else {
            this.data[++this.top] = x;
            // console.log(x + " pushed into stack");
            return true;
        }
    }

    pop() {
        if (this.isEmpty()) {
            throw new Error("Stack Underflow");
        } else {
            return this.data[this.top--];
        }
    }

    peek() {
        if (this.isEmpty()) {
            throw new Error("Stack Underflow");
        } else {
            return this.data[this.top];
        }
    }

    print() {
        for (let i = this.top; i > -1; i--) {
            console.log(" " + this.data[i]);
        }
    }
}

// Driver code
let stack = new Stack();
stack.push(10);
stack.push(20);
stack.push(30);
stack.print();
// console.log(stack.pop() + " Popped from stack");
// console.log("Top element is :" + stack.peek());
// console.log("Elements present in stack :");
// stack.print();