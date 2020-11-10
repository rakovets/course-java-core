package com.rakovets.course.javabasics.practice.concurrency;

public class ArrayMax {
    private int[] array;
    private int max;

    public ArrayMax(int[] array, int max) {
        this.array = array;
        this.max = max;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

}
