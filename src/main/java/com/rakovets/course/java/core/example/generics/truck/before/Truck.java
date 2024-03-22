package com.rakovets.course.java.core.example.generics.truck.before;

public class Truck {
    private final Box[] boxes = new Box[5];
    public final int size = 5;

    public Box unloadBox(int position) {
        Box currentBox = boxes[position];
        boxes[position] = null;
        return currentBox;
    }

    public void loadBox(Box box, int position) {
        boxes[position] = box;
    }
}
