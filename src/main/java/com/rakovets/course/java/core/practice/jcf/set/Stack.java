package com.rakovets.course.java.core.practice.jcf.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Stack<Integer> {
    private int size = 16;
    private Set<Integer> stack = new HashSet<>(size);
    public Stack(int size) {
        this.size = size;
    }
    public Stack() {
    }
    public void putValue(Integer value) { // помещение целого значения в стек
        if (stack.size() < size) {
            stack.add(value);
        }
    }
    public void pushValue() { // выталкивание целого значения из стека
        Iterator<Integer> iter = stack.iterator();
        while (iter.hasNext()) {
            iter.next();
        }
        iter.remove();
    }
    public int countValue() { // подсчет количества целых в стеке
        return stack.size();
    }
    public boolean isEmpty() { // проверка пустой ли стек
        return stack.isEmpty();
    }
    public boolean isFullStack() { // проверка полный ли стек
        return stack.size() == size;
    }
    public void clearStack() { // очистка стека
        stack.clear();
    }
    public Integer viewLastElement() { // получение значения без выталкивания верхнего целого в стеке
        Iterator<Integer> iter = stack.iterator();
        Integer current = null;
        while (iter.hasNext()) {
            current = iter.next();
        }
        return current;
    }
    @Override
    public String toString() {
        return "Stack{" +
                "size=" + size +
                ", stack=" + stack +
                '}';
    }
}
