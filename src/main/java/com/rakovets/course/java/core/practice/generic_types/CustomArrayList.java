package com.rakovets.course.java.core.practice.generic_types;

import java.util.Arrays;

public class CustomArrayList<T> {
    private T[] data;
    private int size = 0;
    private int capacity = 10;

    public CustomArrayList(int capacity) {
        data = (T[])new Object[capacity];
        this.capacity = capacity;
    }

    public CustomArrayList() {

    }

    public CustomArrayList(T[] values) {
        data = values;
        this.size = values.length;
        this.capacity = values.length;
    }

    private void insureCapacity() {
        if (size > capacity){
            capacity = (int)(capacity * 1.5 + 1);
            T[] tempArray = (T[])new Object[capacity];
            int i = 0;
            for(T value : data) {
                tempArray[i] = value;
                i++;
            }
            data = tempArray;
        }
    }

    public void pushBack(T newValue) {
        size++;
        insureCapacity();
        data[size - 1] = newValue;

    }

    public void popFront() {
        T[] tempArray = (T[])new Object[capacity];
        for(int i = 1; i < size; i++) {
            tempArray[i - 1] = data[i];
        }
        data = tempArray;
        size--;
    }

    public void pushFront(T newValue) {
        size++;
        insureCapacity();
        T[] tempArray = (T[])new Object[capacity];
        for(int i = 0; i < size; i++) {
            tempArray[i + 1] = data[i];
        }
        tempArray[0] = newValue;
        data = tempArray;
    }

    public void insert(T newValue, int index) {
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Use Index between 0 and " + size);
        }
        size++;
        insureCapacity();
        T[] tempArray = (T[])new Object[capacity];
        for(int i = 0; i < index; i++) {
            tempArray[i] = data[i];
        }
        tempArray[index] = newValue;
        for(int i = index ; i < size; i++) {
            tempArray[i+1] = data[i];
        }
        data = tempArray;

    }

    public void removeAt(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("Use Index between 0 and " + size --);
        }
        T[] tempArray = (T[])new Object[capacity];
        for(int i = 0; i < index; i++) {
            tempArray[i] = data[i];
        }
        for(int i = index + 1; i < size; i++) {
            tempArray[i - 1] = data[i];
        }
        data = tempArray;
        size--;
    }

    public void remove(T remoningValue) {
        int i = 0;
        T[] tempArray = (T[]) new Object[capacity];
        while(data[i] != remoningValue || i >= size) {
            tempArray[i] = data[i];
            i++;
        }
        if(i < size) {
            for(int j = i + 1; j < data.length; j++) {
            tempArray[j - 1] = data[j];
            }
        }
        data = tempArray;
        size--;
    }

    public void removeAll(T removeValue) {
        T[] tempArray = (T[]) new Object[capacity];
        int j = 0;
        for(int i = 0; i < data.length; i++) {
            if(data[i] != removeValue) {
                tempArray[j] = data[i];
                j++;
            }else {
                size--;
            }
        }
        data = tempArray;
    }

    public void popBack() {
        T[] tempArray = (T[])new Object[capacity];
        for (int i = 0; i < size - 1; i++) {
            tempArray[i] = data[i];
        }
        data = tempArray;
        size--;
    }

    public void clear() {
        for(int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void trimToSize() {
        capacity = size;
        T[] tempArray = (T[])new Object[capacity];
        int j = 0;
        for(int i = 0; i < tempArray.length; i++){
            tempArray[i] = data[j];
            if(j < size){
                j++;
            }
        }
        data = tempArray;
    }

    public int indexOf(T value) {
        int index = -1;
        for(int i = 0; index < size; i++) {
            if(data[i] == value) {
                index = i;
                break;
            }
        }
        return index;
    }

    public int lastIndexOf(T value) {
        int index = -1;
        for(int i = size - 1; i >= 0; i--) {
            if(data[i] == value) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void revers() {
        T[] tempArray = (T[])new Object[capacity];
        int j = size;
        for(int i = 0 ; i < data.length; i++) {
            if(j > 0) {
                j--;
            }
            tempArray[i] = data[j];
            if(j == 0) {
                break;
            }
        }

        data = tempArray;
    }

    public T getElementAt(int index) {
        if (index < 0 && index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return data[index];
    }


    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "CustomArrayList " +
                Arrays.toString(data);
    }
}
