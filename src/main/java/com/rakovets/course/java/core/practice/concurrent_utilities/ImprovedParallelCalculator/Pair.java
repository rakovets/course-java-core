package com.rakovets.course.java.core.practice.concurrent_utilities.ImprovedParallelCalculator;

import java.util.Arrays;
import java.util.Objects;

public class Pair {
    private int[] array;
    private long sum;

    public Pair(int[] array, long sum) {
        this.array = array;
        this.sum = sum;
    }

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
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
                "array=" + Arrays.toString(array) +
                ", sum=" + sum +
                '}';
    }
}
