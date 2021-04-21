package com.rakovets.course.java.core.practice.generic_types;

import java.util.Arrays;
import java.util.Random;

public class CustomArrayList<T> {
    /*data - ссылка на инкапсулированный массив;
      size - текущее количество существующих элементов в массиве;
       capacity - текущая емкость массива (по умолчанию 10).*/

    private T[] data;
    private int size = 0;
    private int capacity = 10;

    public CustomArrayList(int capacity) {
        data = (T[]) new Object[capacity];
        //data = type.cast(Array.newInstance(type.getComponentType(), size));
        this.capacity = capacity;
    }

    public CustomArrayList() {

    }

    public int getSize() {
        return size;
    }

    /*ensureCapacity() – закрытый метод, который проверяет, достаточно ли резерва памяти для хранения
указанного в параметре количества элементов.
    Если значение параметра меньше текущего capacity, то ничего
 не происходит. Если значение параметра больше текущего capacity, то массив пересоздается,
 памяти выделяется в 1,5 раза + 1 элемент больше. Существующие элементы не должны быть потеряны,
 они переносятся в новый массив.
     */
    private void ensureCapacity() {

        if (size == capacity) {
            int i = 0;
            capacity = (capacity * 3 / 2) + 1;
            T[] newArray = (T[]) new Object[capacity];
            for (T object : data) {
                newArray[i] = object;
                i++;
            }
            data = newArray;
        }
    }

    public void printCustomArray() {
        System.out.println(Arrays.toString(data));
    }

/*pushBack() - добавление элемента в конец массива. Должна быть проверка, достаточно ли памяти! Если памяти недостаточно увеличить емкость массива данных
popFront() - удаление первого элемента из массива
pushFront() - добавление нового элемента в начало массива
insert() - вставка нового элемента в массив по указанному индексу, с проверкой на выход за пределы массива
removeAt() - удаление одного элемента по указанному индексу. Должна быть проверка на допустимость индекса
remove() - удаление одного элемента, значение которого совпадает со значением переданного параметра
removeAll() - удаление всех элементов, значения которых совпадает со значением переданного параметра
popBack() - удаление последнего элемента из массива
clear() - обнуление массива – всем элементам массива по индексам от 0 до size - 1 присвоить значение null, полю size присвоить значение 0*/


    public void pushBack(T obT) {
        ensureCapacity();
        data[size] = obT;
        size++;
    }

    public void popFront() {
        ensureCapacity();
        T[] newArray = (T[]) new Object[capacity];
        for (int i = 1; i < data.length; i++) {
            newArray[i - 1] = data[i];
        }
        data = newArray;
        size--;
    }

    public void pushFront(T obT) {
        ensureCapacity();
        T[] newArray = (T[]) new Object[capacity];
        newArray[0] = obT;
        for (int i = 0; i < data.length - 1; i++) {
            newArray[i + 1] = data[i];
        }
        data = newArray;
        size++;
    }

    public void insert(T obT, int i) throws IndexOutOfBoundsException {
        ensureCapacity();
        if (i < 0 || i >= size + 1) {
            throw new IndexOutOfBoundsException();
        }
        T[] newArray = (T[]) new Object[capacity];
        for (int j = 0; j < i; j++) {
            newArray[j] = data[j];
        }
        newArray[i] = obT;
        for (int j = i + 1; j < data.length; j++) {
            newArray[j] = data[j - 1];
        }
        data = newArray;
        size++;
    }
    // removeAt() - удаление одного элемента по указанному индексу. Должна быть проверка на допустимость индекса

    public void removeAt(int i) {
        ensureCapacity();
        T[] newArray = (T[]) new Object[capacity];

        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            for (int j = 0; j < i; j++) {
                newArray[j] = data[j];
            }
            for (int j = i; j < data.length - 1; j++) {
                newArray[j] = data[j + 1];
            }
            data = newArray;
            size--;
        }

    }

    //remove() - удаление одного элемента, значение которого совпадает со значением переданного параметра
    public void remove(T obT) {
        int index = 0;
        T[] newArray = (T[]) new Object[capacity];
        while ((data[index] != obT) && (index < size)) {
            newArray[index] = data[index];
            index++;
        }
        if (index < size) {
            size--;
            for (int i = index++; i < data.length - 1; i++) {
                newArray[i] = data[i + 1];
            }
        }
        data = newArray;

    }


    // removeAll() - удаление всех элементов, значения которых совпадает со значением переданного параметра
    public void removeAll(T obT) {
        int index = 0;
        T[] newArray = (T[]) new Object[capacity];
        for (int i = 0; i < data.length; i++) {
            if (data[i] != obT) {
                newArray[index] = data[i];
                index++;
            } else size--;
        }
        data = newArray;
    }

    public void popBack() {
        T[] newArray = (T[]) new Object[capacity];
        for (int i = 0; i < size - 1; i++) {
            newArray[i] = data[i];
        }
        size--;
        data = newArray;
    }

    //clear() - обнуление массива – всем элементам массива по индексам от 0 до size - 1 присвоить значение null, полю size присвоить значение 0*/
    public void clear() {
        for (int i = 0; i < data.length; i++) {
            data[i] = null;
        }
        size = 0;
    }
    /*
    isEmpty() - метод возвращает true, если size = 0, и false в обратном случае
trimToSize() - метод подгоняет значение capacity под size,
 естественно уменьшая размер используемой памяти
indexOf() - линейный поиск слева направо первого вхождения в массив указанного значения.
 В результате работы вернуть индекс найденного элемента, а если ничего не найдено, вернуть -1
lastIndexOf() - линейный поиск справа налево вхождения в массив указанного значения.
 В результате работы вернуть индекс найденного элемента, а если ничего не найдено, вернуть -1
     */

    public boolean isEmpty() {
        return size == 0;
    }

    public void trimToSize() {
        capacity = size;
        T[] newArray = (T[]) new Object[capacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = data[i];
        }
        data = newArray;
    }

    public int indexOf(T obT) {
        int index = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == obT) {
                index = i;
                break;
            }
        }
        return index;
    }

    public int lastIndexOf(T obT) {
        int index = -1;
        for (int i = data.length - 1; i >= 0; i--) {
            if (data[i] == obT) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void reverse() {
        T[] newArray = (T[]) new Object[capacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = data[size - 1 - i];
        }
        data = newArray;
    }

    public void shuffle() {
        T[] newArray = (T[]) new Object[capacity];
        int[] index = new int[size];
        int j = 0;
        boolean flag;
        for (int i = 0; i < index.length; i++) {
            index[i] = -1;
        }
        for (int i = 0; i < size; i++) {
            flag = true;
            while (flag) {
                flag = false;
                j = new Random().nextInt(size);
                for (int id : index) {
                    if (j == id) {
                        flag = true;
                    }
                }
            }
            index[i] = j;
            newArray[i] = data[j];
        }
        data = newArray;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public T[] getElementAt(int j) {
        if (j < 0 && j > data.length) {
            throw new IndexOutOfBoundsException();
        }
        T[] newArray = (T[]) new Object[capacity];
        for (int i = 0; i < j; i++) {
            newArray[i] = data[i];
        }
        return newArray;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


