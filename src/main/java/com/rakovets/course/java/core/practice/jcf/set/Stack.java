package com.rakovets.course.java.core.practice.jcf.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Stack<T> {
    private int capacity = 10;
    private boolean isSizeFixed;
    private HashSet<T> newSet = new LinkedHashSet<>(capacity);

    public Stack(int totalCapacity, boolean isFixed) {
        if (totalCapacity > 0) {
            this.capacity = totalCapacity;
        }
        this.isSizeFixed = isFixed;
    }

    public void addToStack(T x) {
        if (newSet.size() < capacity) {
            newSet.add(x);
        }
    }

    public T removeLast() {
        Iterator<T> iter = newSet.iterator();
        T last = null;

        while (iter.hasNext()) {
            last = iter.next();
        }
        iter.remove();
        return last;
    }

    public int stackSize() {
        return newSet.size();
    }

    public boolean isEmpty() {
       return newSet.isEmpty();
    }

    public boolean isFull() {
        return newSet.size() == capacity;
    }

    public void clearStack() {
        newSet.clear();
    }

    public T showLast() {
        Iterator<T> iter = newSet.iterator();
        T last = null;

        while (iter.hasNext()) {
            last = iter.next();
        }
        return last;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "newSet=" + newSet +
                '}';
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isSizeFixed() {
        return isSizeFixed;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setSizeFixed(boolean sizeFixed) {
        isSizeFixed = sizeFixed;
    }
}
