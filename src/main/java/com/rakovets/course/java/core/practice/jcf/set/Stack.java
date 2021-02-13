package com.rakovets.course.java.core.practice.jcf.set;

import java.util.HashSet;
import java.util.Set;

public class Stack<T> {
    private int capacity = 16;
    Set<T> stack = new HashSet<>(capacity);

    public Stack() {
    }

    public Stack (int capacity) {
        this.capacity = capacity;
    }

    public Set<T> pushInt(T value) {
        if (stack.size() < capacity) {
            stack.add(value);
        }
        return stack;
    }

    public int countInt() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public boolean isFull() {
        return stack.size() == capacity;
    }
}
