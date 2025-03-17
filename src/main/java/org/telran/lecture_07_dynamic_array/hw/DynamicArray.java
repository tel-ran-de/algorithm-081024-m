package org.telran.lecture_07_dynamic_array.hw;

import java.util.Arrays;

public class DynamicArray {
    private int[] array; // внутренний массив для хранения элементов
    private int count; // логический размер - сколько элементов храним
    private int size; // физический размер - сколько памяти выделили

    public DynamicArray() {
        array = new int[1]; // 1 -> 2 -> 4 -> 8 -> 16 -> 32
        count = 0;
        size = 1;
    }

    private void growSize() {
        int[] tmp = new int[size * 2]; // Создаем новый в 2 раза больше
        // Копируем элементы из старого
        for (int i = 0; i < size; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
        size *= 2;
    }


    // function add an element at the end of array
    public void add(int data) {
        if (count >= size) { // Есть места не хватает
            growSize();
        }
        array[count] = data;
        count++;
    }

    // function remove last element
    public void remove() {
        // TODO-2[complete]: реализовать метод
        if (this.count == 0) {
            throw new Error("Empty array");
        }
        this.count--;
    }

    // function add an element at given index
    public void addAt(int index, int data) {
        if (count < size) { // Есть места хватает
            // TODO-3: убрать дублирование кода
            for (int i = count - 1; i >= index; i--) {
                array[i + 1] = array[i]; // сдвигаем все элементы вправо от текущего индекса
            }

            array[index] = data;
            count++;

        } else { // Есть места не хватает
            growSize();

            for (int i = count - 1; i >= index; i--) {
                array[i + 1] = array[i]; // сдвигаем все элементы вправо от текущего индекса
            }

            array[index] = data;
            count++;
        }
    }

    // function shift all element of right side from given index in left
    public void removeAt(int index) {
        if (count > 0) {
            for (int i = index; i < count - 1; i++) {
                array[i] = array[i + 1]; // сдвигаем все элементы влево до текущего индекса
            }
            array[count - 1] = 0;
            count--;
        }
    }

    public int[] getArray() {
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = array[i];
        }
        return result;
    }

    @Override
    public String toString() {
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = array[i];
        }
        return Arrays.toString(result);
    }

    /**
     * Изменяет элемент с заданным индексом на значение data.
     */
    public void set(int index, int data) {
        // TODO-4: напишите реализацию метода
    }

    /**
     * Удаляет все элементы из списка.
     */
    public void clean() {
        // TODO-5: напишите реализацию метода
    }

    /**
     * Проверяет, существует ли элемент со значением data в списке.
     */
    public boolean contains(int data) {
        // TODO: напишите реализацию метода
        return false; // Заглушка, замените на реальную реализацию
    }

    /**
     * Проверяет, является ли список пустым.
     */
    public boolean isEmpty() {
        // TODO: напишите реализацию метода
        return true; // Заглушка, замените на реальную реализацию
    }

    public int length() {
        // TODO-1[complete]: реализуйте метод
        return count;
    }

    public static void main(String[] args) {
        DynamicArray data = new DynamicArray();
        data.add(1);
        data.add(2);
        data.add(3);

        System.out.println(Arrays.toString(data.getArray()));
        System.out.println(data);
    }
}
