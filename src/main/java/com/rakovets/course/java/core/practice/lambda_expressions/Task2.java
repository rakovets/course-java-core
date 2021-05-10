package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.stream.IntStream;

public class Task2 {
    public static void getMultiplicationTableInOneColumn() {
        IntStream.range(1, 11).forEach(i -> {IntStream.range(1, 11).forEach(j -> {
            System.out.println(i + "*" + j + "=" + i * j);
        });
            System.out.println();
        });
    }


    public static void getMultiplicationTableInFiveColumns() {
        IntStream.range(1, 11).forEach(i -> {IntStream.range(1, 11).forEach(j -> {
            System.out.println(i + "*" +j + "=" + i * j + "\t \t");
        });
            System.out.println();
        });
        IntStream.range(1, 11).forEach(i -> {IntStream.range(6, 11).forEach(j -> {
            System.out.println(i + "*" +j + "=" + i * j + "\t \t");
        });
            System.out.println();
        });
    }
}
