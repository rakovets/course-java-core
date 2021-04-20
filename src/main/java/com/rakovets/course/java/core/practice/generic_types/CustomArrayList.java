package com.rakovets.course.java.core.practice.generic_types;

import java.util.Arrays;
import java.lang.Math;
import java.util.Random;

public class CustomArrayList<T> {
    private Object[] data = {};
    private int size = 0;
    private int capacity;

    public CustomArrayList(int setCapacity) {
        this.capacity = setCapacity;
        if (capacity > 0) {
            data = new Object[setCapacity];
        }
    }

    public CustomArrayList() {
        data = new Object[capacity];
    }

    private void ensureCapacity() {
        Object[] clone = new Object[data.length + 1];
        System.arraycopy(data, 0, clone, 0, data.length);
        data = clone;
        capacity++;
    }

    public void pushBack(T value) {
        size++;
        Object[] clone = new Object[data.length + 1];
        System.arraycopy(data, 0, clone, 0, data.length);
        clone[data.length] = value;
        data = clone;
    }

    public void popFront() {
        size--;
        Object[] clone = new Object[data.length - 1];
        for (int i = 0; i + 1 < data.length; i++) {
            data[i] = data[i + 1];
        }
        System.arraycopy(data, 0, clone, 0, data.length -1);
        data = clone;
    }

    public void pushFront(T value) {
        size++;
        Object[] clone = new Object[data.length + 1];
        clone[0] = value;
        System.arraycopy(data, 0, clone, 1, data.length);
        data = clone;
    }

    public void insert(int index, T value) {
        size++;
        if (index > data.length - 1) {
            ensureCapacity();
            data[data.length - 1] = value;
        } else if (data[index] != null) {
            ensureCapacity();
            for (int i = data.length - 1; i > index; i--) {
                data[i] = data[i - 1];
            }
        }
        data[index] = value;
    }

    public void removeAt(int index) throws ArrayIndexOutOfBoundsException {
        if (index <= data.length - 1) {
            size--;
            Object[] clone = new Object[data.length - 1];
            for (int i = index; i + 1 < data.length; i++) {
                    data[i] = data[i + 1];
            }
            System.arraycopy(data, 0, clone, 0, data.length - 1);
            data = clone;
        } else {
            throw new ArrayIndexOutOfBoundsException("Undefined index");
        }
    }

    public void remove(T element) {
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i].equals(element)) {
                size--;
                Object[] clone = new Object[data.length - 1];
                for (int j = i; j + 1 < data.length; j++) {
                    data[j] = data[j + 1];
                }
                System.arraycopy(data, 0, clone, 0, data.length - 1);
                data = clone;
                break;
            }
        }
    }

    public void removeAll(T element) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(element)) {
                size--;
                Object[] clone = new Object[data.length - 1];
                for (int j = i; j + 1 < data.length; j++) {
                    data[j] = data[j + 1];
                }
                System.arraycopy(data, 0, clone, 0, data.length - 1);
                data = clone;
            }
        }
    }

    public void popBack() {
        size--;
        Object[] clone = new Object[data.length - 1];
        System.arraycopy(data, 0, clone, 0, data.length - 1);
        data = clone;
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
        if (capacity > size) {
            Object[] clone = new Object[size];
            for (int i = 0; i < clone.length; i++) {
                clone[i] = data[i];
            }
            data = clone;
            capacity = data.length;
        }
    }

    public void setRandomValuesForArray() {
        for (int i = 0; i < data.length; i++) {
            data[i] = (int)(Math.random() * 20);
        }
        size = data.length;
    }

    public int indexOf(T value) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                continue;
            }
            if (data[i].equals(value)) {
                return i - 1;
            }
        }
        return -1;
    }

    public int lastIndexOf(T value) {
        for (int i = data.length - 1; i > 0; i--) {
            if (data[i] == null) {
                continue;
            }
            if (data[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public void reverse() {
        Object[] reverse = new Object[data.length];
        for (int i = 0, j = data.length - 1; i < data.length; i++, j--) {
            reverse[i] = data[j];
        }
        data = reverse;
    }

    public void shuffle() {
        Random rnd = new Random();
        for (int i = 0; i < data.length; i++) {
            int index = rnd.nextInt(i + 1);
            String a = (String) data[index];
            data[index] = data[i];
            data[i] = a;
        }
    }

    public boolean equals(Object[] object) {
        return Arrays.equals(data, object);
    }

    public String getElementAt(int index) throws ArrayIndexOutOfBoundsException {
        if (index > data.length - 1) {
            throw new ArrayIndexOutOfBoundsException("Undefined index");
        } else {
            return (String) data[index];
        }
    }

    public Object[] clone() {
        return data.clone();
    }


    public String toString() {
       return Arrays.toString(data);
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }
}
