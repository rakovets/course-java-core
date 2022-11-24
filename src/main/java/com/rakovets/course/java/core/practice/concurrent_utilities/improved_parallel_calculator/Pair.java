package com.rakovets.course.java.core.practice.concurrent_utilities.improved_parallel_calculator;

import java.util.Arrays;

public class Pair {
    private long sum;
    private int[] array;

    public Pair(int[] array, long sum) {
        this.sum = sum;
        this.array = array;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "count=" + sum +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
