package org.telran.lecture_07_dynamic_array.hw;

import java.util.Arrays;

public class DynamicArray {
    private int[] array; // внутренний массив для хранения элементов
    private int count; // физический размер - сколько элементов храним
    private int size; // логический размер - сколько памяти выделили

    public DynamicArray() {
        array = new int[1];
        count = 0;
        size = 1;
    }

    private void growSize(){
        int[] tmp = new int[size * 2]; // Создаем новый в 2 раза больше
        // Копируем элементы из старого
        for (int i = 0; i < size; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
        size *= 2;
    }
    //DRY - don't repeat yourself
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
        if (count == 0){
            throw new IllegalArgumentException("Array is empty, cannot remove element.");
        }
        count--;  // Уменьшаем логический размер на 1
    }

    public void addAt(int index, int data) {
        // Проверяем, если места хватает, вставляем элемент в массив
        if (index < 0 || index > count) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        if (count < size) {
            // Сдвигаем элементы вправо, начиная с последнего и до индекса
            for (int i = count - 1; i >= index; i--) {
                array[i + 1] = array[i];
            }

            array[index] = data;  // Вставляем новый элемент
            count++;  // Увеличиваем количество элементов
        } else {
            // Если места не хватает, увеличиваем размер массива
            growSize();  // Вызываем метод для увеличения размера массива

            array[index] = data;  // Вставляем новый элемент
            count++;  // Увеличиваем количество элементов
        }
    }


    // function shift all element of right side from given index in left
    public void removeAt(int index) {
//        if (index < 0 || index >= count) {
//            throw new IndexOutOfBoundsException("Invalid index: " + index);
//        }
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

    // Устанавливает новое значение элемента по индексу
    public void set(int index, int data) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        array[index] = data;
    }

    // Полностью очищает массив
    public void clean() {
        array = new int[1]; // Создаем новый массив размером 1
        count = 0;
        size = 1;
    }

    // Проверяет, содержит ли массив данный элемент
    public boolean contains(int data) {
        for (int i = 0; i < count; i++) {
            if (array[i] == data) {
                return true;
            }
        }
        return false;
    }

    // Проверяет, пуст ли массив
    public boolean isEmpty() {
        return count == 0;
    }

    public int length() {
        return this.count;
//        return count;
    }

    public static void main(String[] args) {
        //test DynamicArray
        DynamicArray data = new DynamicArray();
//        data.remove();
//        System.out.println(Arrays.toString(data.getArray()));
//        System.out.println("Length: " + data.length());
        data.add(1);
        data.add(2);
        data.add(3);
        System.out.println(Arrays.toString(data.getArray()));
        System.out.println(data);
        System.out.println("Length: " + data.length());
        System.out.println();

        data.remove();
        System.out.println(Arrays.toString(data.getArray()));
        System.out.println("Length: " + data.length());

        // Добавляем элемент в середину
        data.addAt(1, 15);
        System.out.print("После добавления элемента 15 на позицию 1: ");
        data.printArray();

        data.removeAt(1); // Удаляем последний элемент
        System.out.println("Array after remove: " + Arrays.toString(data.getArray()));
        System.out.println("Length after remove: " + data.length());

        data.set(1, 99);
        System.out.println(data);

        System.out.println("Содержит ли 99? " + data.contains(99));
        System.out.println("Содержит ли 5? " + data.contains(5));

        System.out.println("Пуст ли массив? " + data.isEmpty());

        data.clean();
        System.out.println("После очистки: " + data);
        System.out.println("Пуст ли массив? " + data.isEmpty());
    }


    private void printArray() {
        System.out.println("Array: " + Arrays.toString(getArray()));
    }
}