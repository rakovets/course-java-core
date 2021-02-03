package com.rakovets.course.java.core.practice.generic_types;

public class CustomArrayList <T extends Number> {
    private T data[];
    private int size;
    private int capacity;

    public CustomArrayList(int capacity) {
        this.capacity = capacity;
        this.size = 0;
    }

    public CustomArrayList() {
        this(10);
        this.size = 0;
    }

    @Override
    public String toString(){
        String str = "";
        for (int i = 0; i < size - 1; i++) {
            str += data[i] + " ";
        }
        return str += data[size-1];
    }

    public int getSize() {
        return size;
    }
}

