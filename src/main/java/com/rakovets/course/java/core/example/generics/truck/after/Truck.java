package com.rakovets.course.java.core.example.generics.truck.after;

public class Truck<T> {
    private final Box<T>[] boxes = new Box[5];
    public final int size = 5;

    public Box<T> unloadBox(int position) {
        Box<T> currentBox = boxes[position];
        boxes[position] = null;
        return currentBox;
    }

    public void loadBox(Box<T> box, int position) {
        boxes[position] = box;
    }
}
