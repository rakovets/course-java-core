package com.rakovets.course.java.core.practice.jcf.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Stack<T> {
    private int capacity = 10;
    private boolean isSizeFixed;
    private HashSet<T> mySet = new LinkedHashSet<>(capacity);

    public Stack(int totalCapacity, boolean isFixed) {
        if (totalCapacity > 0) {
            this.capacity = totalCapacity;
        }
        this.isSizeFixed = isFixed;
    }

    public void addToStack(T x) {
        if (mySet.size() < capacity) {
            mySet.add(x);
        }
    }

    public T removeLast() {
        Iterator<T> iter = mySet.iterator();
        T last = null;

        while (iter.hasNext()) {
            last = iter.next();
        }
        iter.remove();
        return last;
    }

    public int stackSize() {
        return mySet.size();
    }

    public boolean isEmpty() {
        return mySet.isEmpty();
    }

    public boolean isFull() {
        return mySet.size() == capacity;
    }

    public void clearStack() {
        mySet.clear();
    }

    public T showLast() {
        Iterator<T> iterator = mySet.iterator();
        T last = null;

        while (iterator.hasNext()) {
            last = iterator.next();
        }
        return last;
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

    @Override
    public String toString() {
        return "Stack{" +
                "newSet=" + mySet +
                '}';
    }
}
