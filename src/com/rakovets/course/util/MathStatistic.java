package com.rakovets.course.util;


import java.util.Arrays;

public class MathStatistic {
    private int[] array;

    public MathStatistic(int[] array) {
        this.array = array;
    }

    public long NumberOfEvenValues() {
        long values = Arrays.stream(array)
                .filter(v -> v % 2 == 0)
                .count();
        return values;
    }


    public long NumberOfUnevenValues() {
        long values = Arrays.stream(array)
                .filter(v -> v % 2 != 0)
                .count();
        return values;
    }

    public long NumberOfZeroValues() {
        long values = Arrays.stream(array)
                .filter(v -> v == 0)
                .count();
        return values;
    }
}