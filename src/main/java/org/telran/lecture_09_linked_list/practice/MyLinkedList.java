package org.telran.lecture_09_linked_list.practice;

public class MyLinkedList {
    public static void main(String[] args) {
        // Пример использования
        LinkedList myList = new LinkedList();
        myList.append(1);
        myList.append(2);
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
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Вставка элемента в начало списка
    public void prepend(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // Вставка элемента по индексу
    public void insertAt(int data, int index) {
        //  FIXME: доработайте метод, добавив проверку на выход за границы списка
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
        // TODO: напишите реализацию метода
        return 0;
    }

    // Удаление элемента по индексу
    public Integer removeAt(int index) {
        // TODO: напишите реализацию метода
        return 0;
    }

    // Получение элемента по индексу
    public Integer getAt(int index) {
        //  FIXME: доработайте метод, добавив проверку на выход за границы списка
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