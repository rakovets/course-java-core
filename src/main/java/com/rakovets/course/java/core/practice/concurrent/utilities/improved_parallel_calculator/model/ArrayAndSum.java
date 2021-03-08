package com.rakovets.course.java.core.practice.concurrent.utilities.improved_parallel_calculator.model;

public class ArrayAndSum {
    private final int[] array;
    private final int sum;

    public ArrayAndSum(int[] array, int sum) {
        this.array = array;
        this.sum = sum;
    }

    public int[] getArray() {
        return array;
    }

    public int getSum() {
        return sum;
    }
}

