package org.telran.lecture_09_linked_list.examples;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Создание LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Добавление элементов в конец списка
        linkedList.add("Элемент 1");
        linkedList.add("Элемент 2");
        linkedList.add("Элемент 3");

        // Добавление элемента в начало списка
        linkedList.addFirst("Первый элемент");

        // Добавление элемента по индексу
        linkedList.add(2, "Вставленный элемент");

        // Вывод списка
        System.out.println("LinkedList: " + linkedList);

        // Получение элемента по индексу
        String element = linkedList.get(1);
        System.out.println("Элемент по индексу 1: " + element);

        // Получение первого и последнего элементов
        String firstElement = linkedList.getFirst();
        String lastElement = linkedList.getLast();
        System.out.println("Первый элемент: " + firstElement);
        System.out.println("Последний элемент: " + lastElement);

        // Удаление элемента по индексу
        linkedList.remove(2);

        // Удаление элемента по значению
        linkedList.remove("Элемент 2");

        // Удаление первого и последнего элементов
        linkedList.removeFirst();
        linkedList.removeLast();

        // Вывод списка после удаления
        System.out.println("LinkedList после удаления: " + linkedList);

        // Проверка наличия элемента
        boolean containsElement = linkedList.contains("Элемент 3");
        System.out.println("Содержит элемент 'Элемент 3': " + containsElement);

        // Размер списка
        int size = linkedList.size();
        System.out.println("Размер списка: " + size);

        // Очистка списка
        linkedList.clear();
        System.out.println("LinkedList после очистки: " + linkedList);
    }
}