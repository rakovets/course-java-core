package com.rakovets.course.java.core.practice.jcf.set.PriorityQueue;

public class PriorityQueue<T> {
    private final T[] data;
    private int front;
    private int rear;
    private final int capacity;
    private int count;

    @SuppressWarnings("unchecked")
    public PriorityQueue(Class<T[]> type, int size) {
        data = (T[]) new Object[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    public boolean isEmpty() {
        return (size() == 0);
    }

    public boolean isFull() {
        return (size() == capacity);
    }

    public void insertWithPriority(T item) {
        if (isFull()) {
            System.out.println("OverFlow\nProgram Terminated");
            System.exit(1);
        }
        System.out.println("Inserting " + item);
        rear = (rear + 1) % capacity;
        System.arraycopy(data, front, data, front + 1, rear - front);
        data[front] = item;
        count++;
    }

    public void pullHighestPriorityElement() {
        if (isEmpty()) {
            System.out.println("UnderFlow\nProgram Terminated");
            System.exit(1);
        }
        System.out.println("Removing " + data[front]);
        front = (front + 1) % capacity;
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue Is Empty");
            return null;
        }
        return data[front];
    }

    public void show() {
        for (int i = 0; i < count; i++) {
            System.out.println(data[(front + i) % capacity]);
        }
    }

    public int size() {
        return count;
    }
}
