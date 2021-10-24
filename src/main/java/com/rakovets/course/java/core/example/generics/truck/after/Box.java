package com.rakovets.course.java.core.example.generics.truck.after;

public class Box<T> {
    private T item;

    public Box(T item) {
        this.item = item;
    }

    public T unboxing() {
        return item;
    }

    public void boxing(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Box{" +
                "item=" + item +
                '}';
    }
}
