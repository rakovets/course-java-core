package com.rakovets.course.java.core.example.generic_types.truck.before;

public class Box {
    private Object item;

    public Box(Object item) {
        this.item = item;
    }

    public Object unboxing() {
        return item;
    }

    public void boxing(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Box{" +
                "item=" + item +
                '}';
    }
}
