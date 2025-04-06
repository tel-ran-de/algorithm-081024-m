package org.telran.lecture_09_linked_list.hw;

// Закончите все методы, которые не успели на занятии

public class hw09_LinkedList {
    public static void main(String[] args) {
        // Пример использования
        LinkedList myList = new LinkedList();
        myList.append(2);
        myList.append(4);
        myList.append(6);

        myList.prepend(1);
        myList.print();
        myList.insertAt(5,3);
        myList.print();
        myList.insertAt(3,2);
        myList.print();
        myList.insertAt(0,0);
        myList.print();

        myList.remove(5);
        myList.print();
        myList.remove(5);
        myList.print();

        myList.removeAt(0);
        myList.print();
        myList.removeAt(4);
        myList.print();

        myList.clear();
        myList.print();
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    Node tail;
    int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Добавление элемента в конец списка
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    // Вставка элемента в начало списка
    public void prepend(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            tail = newNode;
        } else {
            newNode.next = head;
        }
        head = newNode;
        size++;
    }

    // Вставка элемента по индексу
    public void insertAt(int data, int index) {
        //  FIXME: доработайте метод, добавив проверку на выход за границы списка
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for this array");
        }
        
        if (index == 0) {
            prepend(data);
        } else if (index == size) {
            append(data);
        } else {
            Node newNode = new Node(data);
            Node current = head;
            Node previous = null;
            for (int i = 0; i < index; i++) {
                previous = current;
                current = current.next;
            }
            newNode.next = current;
            previous.next = newNode;
            size++;
        }
    }

    // Удаление элемента по значению
    public Integer remove(int data) {
        int index = 0;
        for (Node current = head; current != null; current = current.next, index++) {
            if (Objects.equals(data, current.data)) {
                return removeAt(index);
            }
        }
        return -1;
    }

    // Удаление элемента по индексу
    public Integer removeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for this array");
        }

        Node current = head;
        if (index == 0) {
            head = head.next;
        } else {
            Node previous = null;
            for (int i = 0; i < index; i++) {
                previous = current;
                current = current.next;
            }
            previous.next = current.next;
        }
        size--;
        return current.data;
    }

    // Получение элемента по индексу
    public Integer getAt(int index) {
        //  FIXME: доработайте метод, добавив проверку на выход за границы списка
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for this array");
        }
        
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    // Проверка, пустой ли список
    public boolean isEmpty() {
        return size == 0;
    }

    // Получение размера списка
    public int getSize() {
        return size;
    }

    // Очистка списка
    public void clear() {
        // TODO: напишите реализацию метода
        head = null;
        tail = null;
        size = 0;
    }

    // Вывод списка в консоль
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
