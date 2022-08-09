package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.stream.IntStream;

public class Task02 {
    public void tableInOneColumn() {
        IntStream.range(1, 11).forEach(i->{
            IntStream.range(1, 11).forEach(j->{System.out.println(i + " x " + j + " = " + i * j);});
            System.out.println();
        });
    }

    public void tableInFiveColumns() {
        IntStream.range(1, 11).forEach(i -> {
            IntStream.range(1, 6).forEach(j -> {
                System.out.print(j + " x " + i + " = " + (i * j) + "\t");
            });
            System.out.println();
        });
        IntStream.range(1, 11).forEach(i -> {
            IntStream.range(6, 11).forEach(j -> {
                System.out.print(j + " x " + i + " = " + (i * j) + "\t");
            });
            System.out.println();
        });
    }
}
