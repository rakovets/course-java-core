package com.rakovets.course.util;


import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

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

    public long NumberOfInputValues() {
        int userInput;
        Scanner scanner = new Scanner(System.in);
        userInput = scanner.nextInt();

        long values = Arrays.stream(array)
                .filter(v -> v == userInput)
                .count();
        return values;
    }
}