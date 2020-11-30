package com.rakovets.course.javabasics.practice.concurrency;

public class ArrayMax {
    private Integer[] array;
    private int max;

    public ArrayMax(Integer[] array, int max) {
        this.array = array;
        this.max = max;
    }

    public Integer[] getArray() {
        return array;
    }

    public void setArray(Integer[] array) {
        this.array = array;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

}
