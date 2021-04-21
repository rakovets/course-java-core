package com.rakovets.course.java.core.practice.generic_types;

import java.util.Arrays;
import java.util.Random;

public class CustomArrayList<T> {
    private T[] data;
    private int size = 0;
    private int capacity = 10;

    public CustomArrayList(int capacity) {
        data = (T[]) new Object[capacity];
        this.capacity = capacity;
    }

    public CustomArrayList() {
    }

    public int getSize() {
        return size;
    }

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

    public void clear() {
        for (int i = 0; i < data.length; i++) {
            data[i] = null;
        }
        size = 0;
    }

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


