package com.rakovets.course.java.core.practice.jcf.set;

import java.util.HashSet;
import java.util.Iterator;

public class Stack<E> {
    private int size = 5;
    private HashSet stack;

    public Stack( int size, boolean isFixed) {
        if (isFixed && size > 0) {
            this.size = size;
        }
        stack = new HashSet();
    }

    public void add(E element) {
        if (stack.size() < size) {
            stack.add(element);
        }
    }

    public E removeLast() {
        E lastElement = getLastElement();
        stack.remove(lastElement);
        return lastElement;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public boolean isFull() {
        return stack.size() == size;
    }

    public void clearStack() {
        stack.clear();
    }

    public E getLastElement() {
        E lastElement = null;
        if (stack.size() > 0) {
            Iterator<E> iterator = stack.iterator();
            while (iterator.hasNext()) {
                lastElement = iterator.next();
            }
        }
        return lastElement;
    }
}
