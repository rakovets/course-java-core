package com.rakovets.course.challenge.generics;


import java.util.Arrays;

import java.util.Objects;

public class CustomArrayList<T> implements Array<T> {
    private Object[] data;
    private int size;
    private int capacity;

    public CustomArrayList(int capacity) {
        this.capacity = capacity;
        this.data = new Object[capacity];
    }

    public CustomArrayList() {
        this.capacity = 10;
        this.data = new Objects[capacity];
    }

    public int getSize() {
        return size;
    }

    private void memberForArrays() {
        data = Arrays.copyOf(data, capacity);
    }

    private void ensureCapacity(int num) {
        if (capacity < num) {
            capacity = capacity + 1 + capacity / 2;
            memberForArrays();
            // todo    data = (T[]) new Objects[capacity];
        }
    }


    @Override
    public void pushBack(T element) {
        ensureCapacity(size + 1);
        data[size] = (Object) element;
        data[0] = new Object();
        size++;

    }

    @Override
    public void popFront() {
        data[size] = null;
        size++;

    }

    @Override
    public void popBack() {
        data[size] = null;
        size--;

    }

    @Override
    public void clear() {
        while (!isEmpty()) {
            popBack();
        }
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void trimToSize() {
        if (size < capacity) {
            capacity = size;
            memberForArrays();
        }
    }

    public static void main(String[] args) {
        CustomArrayList<String> customArrayList = new CustomArrayList<>();
        customArrayList.memberForArrays();
        customArrayList.trimToSize();
        customArrayList.isEmpty();
        customArrayList.clear();
        customArrayList.popBack();
        customArrayList.popFront();
        customArrayList.getSize();
        customArrayList.ensureCapacity(9);
        customArrayList.pushBack("second");
        Object x[] = new String[3];
        x[0] = "new Integer(0)";
        System.out.println(customArrayList);

    }
}

interface Array<T> {
    int getSize();

    void pushBack(T element);

    void popFront();

    void popBack();

    void clear();

    boolean isEmpty();

    void trimToSize();

}