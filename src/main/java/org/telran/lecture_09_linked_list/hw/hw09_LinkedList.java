package org.telran.lecture_09_linked_list.hw;

// Закончите все методы, которые не успели на занятии

public class hw09_LinkedList {
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
        if (index < 0 || index > size){
                    System.out.println("Index out of bounds");
                    return;
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
        Node current = head;
        Node previous = null;

        // Поиск элемента в списке
        while (current != null && current.data != data) {
            previous = current;
            current = current.next;
        }

        // Если элемент не найден
        if (current == null) {
            return null;
        }

        // Если элемент находится в начале списка
        if (previous == null) {
            head = current.next;
            if (head == null) { // Если список стал пустым
                tail = null;
            }
        } else {
            previous.next = current.next;
            if (current == tail) { // Если элемент был последним
                tail = previous;
            }
        }

        size--;
        return current.data;
    }

    // Удаление элемента по индексу
    public Integer removeAt(int index) {
        if (index < 0 || index >= size) {
                    System.out.println("Index out of bounds");
                    return null;
                }

                if (index == 0) {
                    if (head == null) return null;
                    Integer data = head.data;
                    head = head.next;
                    if (head == null) {
                        tail = null;
                    }
                    size--;
                    return data;
                }

                Node current = head;
                Node previous = null;
                for (int i = 0; i < index; i++) {
                    previous = current;
                    current = current.next;
                }

                previous.next = current.next;
                if (current == tail) {
                    tail = previous;
                }
                size--;
                return current.data;
    }

    // Получение элемента по индексу
    public Integer getAt(int index) {
       if (index < 0 || index >= size) {
                    System.out.println("Index out of bounds");
                    return null;
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
