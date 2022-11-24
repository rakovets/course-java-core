package com.rakovets.course.java.core.practice.concurrent_utilities.improved_parallel_calculator;

import java.util.Arrays;
import java.util.Objects;

public class Pair {
    private long sum;
    private int[] array;

    public Pair(int[] array, long sum) {
        this.sum = sum;
        this.array = array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return sum == pair.sum && Arrays.equals(array, pair.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(sum);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "count=" + sum +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
