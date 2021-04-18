package com.rakovets.course.java.core.practice.generic_types.custom_array_list;

import java.util.Arrays;
public class CustomArrayList<T> {
    private T[] data;
    private int size;
    private int capacity;

    public CustomArrayList(int capacity) {
        this.capacity = capacity;
        size = 0;
        data = (T[]) new Object[capacity];
    }

    public CustomArrayList() {
        this(10);
    }

    private void ensureCapacity(int capacity) {
        if (capacity >= this.capacity) {
            T[] list = (T[]) new Object[(int) (this.capacity * 1.5 + 1)];
            System.arraycopy(data, 0, list, 0, data.length);
            data = list;
            this.capacity = (int) (capacity * 1.5 + 1);
        }
    }

    public void pushBack(T data) {
       ensureCapacity(size);
       this.data[size] = data;
       size++;
    }

    public void popFront() {
        if (size > 0) {
            for (int i = 0; i < size - 1; i++) {
                data[i] = data[i + 1];
            }
            size--;
            data[size] = null;
        }
    }

    public void pushFront(T data) {
        ensureCapacity(size);
        for (int i = size; i > 0; i--) {
            this.data[i] = this.data[i - 1];
        }
        this.data[0] = data;
        size++;
    }

    private void checkIndex(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Oy shiiiiit");
        }
    }

    public void insert(T data, int index) {
        checkIndex(index);
        ensureCapacity(size);
        for (int i = size; i > index ; i--) {
            this.data[i] = this.data[i - 1];
        }
        this.data[index] = data;
        size++;
    }

    public void removeAt(int index) {
        checkIndex(index);
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size - 1] = null;
        size--;
    }

    public void remove(T data) {
        for (int i = 0; i < size; i++) {
            if (this.data[i].equals(data)) {
                for (int j = i; j < size - 1; j++) {
                    this.data[j] = this.data[1 + j];
                }
                break;
            }
        }
        size--;
        this.data[size] = null;
    }

    public void removeAll(T data) {
        for (int i = 0; i < size; i++) {
            if (this.data[i].equals(data)) {
                for (int j = i; j < size - 1; j++) {
                    this.data[j] = this.data[j + 1];
                }
                size--;
                i--;
                this.data[size] = null;
            }
        }
    }

    public void popBack() {
        size--;
        data[size] = null;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    public void reverse() {
        for (int i = size - 1; i > 0; i--) {
            T temp = data[i];
            data[i] = data[size - i - 1];
            data[size - i - 1] = temp;
        }
    }

    public void shuffle() {
        for (int i = 0; i < size; i++) {
            int randomIndexFirstElement = (int) (Math.random() * size);
            int randomIndexSecondElement = (int) (Math.random() * size);
            T temp = data[randomIndexFirstElement];
            data[randomIndexFirstElement] = data[randomIndexSecondElement];
            data[randomIndexSecondElement] = temp;
        }
    }

    public boolean equals(CustomArrayList<T> object) {
        if (this.getSize() == object.getSize()) {
            int countContain = 0;
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (data[i].equals(data[j])) {
                        countContain++;
                        break;
                    }
                }
            }
            return countContain == size;
        } else {
            return false;
        }
    }

    public T getElementAt(int index) {
        checkIndex(index);
        return data[index];
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        CustomArrayList<T> list = new CustomArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.pushBack(data[i]);
        }
        return list;
    }

    @Override
    public String toString() {
        T[] list = (T[]) new Object[size];
        System.arraycopy(data, 0, list, 0, size);
        return "CustomArrayList{" +
                "data=" + Arrays.toString(list) +
                '}';
    }

    public int getSize() {
        return size;
    }
}
