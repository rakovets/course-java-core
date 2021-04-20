package com.rakovets.course.java.core.practice.generic_types;

import java.util.Arrays;
import java.lang.Math;

public class CustomArrayList {
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
    }

    public void pushBack(int value) {
        if (data[data.length -1] == null) {
            size++;
        }
        data[data.length - 1] = value;
    }

    public void popFront() {
        if(data[0] != null) {
            size--;
        }
        data[0] = null;
    }

    public void pushFront(int value) {
        if (data[0] == null) {
            size++;
        }
        data[0] = value;
    }

    public void insert(int index, int value) {
        if (index > data.length - 1) {
            ensureCapacity();
            capacity++;
        }
        if (data[index] == null) {
            size++;
        }
        data[index] = value;
    }

    public void removeAt(int index) throws ArrayIndexOutOfBoundsException {
        if (index <= data.length - 1) {
            data[index] = null;
            size--;
        } else {
            throw new ArrayIndexOutOfBoundsException("Undefined index");
        }
    }

    public void remove(int element) {
        for (int i = 0; i < data.length; i++) {    //NullPointer
            if (data[i].equals(element)) {
                data[i] = null;
                size--;
                break;
            }
        }
    }

    public void removeAll(int element) {
        for (int i = 0; i < data.length; i++) {       //NullPointer
            if (data[i].equals(element)) {
                data[i] = null;
                size--;
            }
        }
    }

    public void popBack() {
        if (data[data.length - 1] != null) {
            size--;
        }
        this.data[data.length - 1] = null;
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
            for (int i = 0; i < clone.length; i++) {   //problem
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

    public int indexOf(int value) {
        for (int i = 0; i < data.length; i++) {  //NullPointer
            if (data[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(int value) {
        for (int i = data.length -1; i > 0; i--) {  //NullPointer
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

    public boolean equals(Object[] object) {
        return Arrays.equals(data, object);
    }

    public int getElementAt(int index) throws ArrayIndexOutOfBoundsException {
        if (index > data.length - 1) {
            throw new ArrayIndexOutOfBoundsException("Undefined index");
        } else {
            return (int) data[index];
        }
    }

    public Object[] clone() {                  ///?
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
