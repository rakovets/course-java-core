package com.rakovets.course.java.core.practice.concurrent_utilities.parallel_calculator;

import java.util.Arrays;
import java.util.Objects;

public class PairSumArray {
    private long sum;
    private int[] array;

    public PairSumArray(long sum, int[] array) {
        this.sum = sum;
        this.array = array;
    }

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    public int[] getArray() {
        return array;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PairSumArray pair = (PairSumArray) o;
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
        return "Pair {count = " + sum +
                ", array = " + Arrays.toString(array) +
                '}';
    }
}
