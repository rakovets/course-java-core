package com.rakovets.course.java.core.practice.jcf.set.Queue;

public class Queue<T> {
    private final T[] data;
    private int front;
    private int rear;
    private final int capacity;
    private int count;

    @SuppressWarnings("unchecked")
    public Queue(Class<T[]> type, int size) {
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

    public void enqueue(T item) {
        if (isFull()) {
            System.out.println("OverFlow\nProgram Terminated");
            System.exit(1);
        }
        System.out.println("Inserting " + item);
        rear = (rear + 1) % capacity;
        data[rear] = item;
        count++;
    }

    public void dequeue(T item) {
        if (isEmpty()) {
            System.out.println("UnderFlow\nProgram Terminated");
            System.exit(1);
        }
        System.out.println("Removing " + data[front]);
        front = (front + 1) % capacity;
        count--;
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
