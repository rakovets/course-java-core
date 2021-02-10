package com.rakovets.course.java.core.practice.jcf.set.Stack;

import java.util.Arrays;

class Stack<T> {
    private T[] data;
    private int top;
    private int capacity;
    private int size;

    @SuppressWarnings("unchecked")
    public Stack(Class<T[]> type, int size) {
        data = (T[]) new Object[size];
        capacity = size;
        top = -1;
    }

    public void push(T item) {
        if (isFull())
            ensureCapacity();
        System.out.println("Inserting " + item);
        top = (top + 1) % capacity;
        data[top] = item;
        size++;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("UnderFlow\nProgram Terminated");
            System.exit(1);
        }
        System.out.println("Removing " + data[top]);
        data[top] = null;
        size--;
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return capacity;
    }

    public boolean isEmpty() {
        return (size() == 0);
    }

    public boolean isFull() {
        return (size() == capacity);
    }

    public void clear() {
        Arrays.fill(data, null);
        size = 0;
    }

    public T peek() {
        return data[top];
    }

    @SuppressWarnings("unchecked")
    private void ensureCapacity() {
        Object[] newData = new Object[capacity * 2];
        if (capacity >= 0) System.arraycopy(data, 0, newData, 0, capacity);
        data = (T[]) newData;
        capacity = capacity * 2;
    }

    public void show() {
       System.out.println(Arrays.toString(data));
    }
}
