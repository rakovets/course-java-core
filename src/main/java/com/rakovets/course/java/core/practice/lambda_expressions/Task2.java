package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.stream.IntStream;

public class Task2 {
    public String getTableMultiplicationInOneColumn() {
        StringBuilder stringBuilder = new StringBuilder();
        IntStream.rangeClosed(1, 10).forEach(i ->
                IntStream.rangeClosed(1, 10).forEach(j -> stringBuilder.append(i + " * " + j + " = " + i * j + "\n")));
        return stringBuilder.toString();
    }

    public String getTableMultiplicationFiveColumns(int columnCount) {
        StringBuilder stringBuilder = new StringBuilder();
        IntStream.rangeClosed(1, 10).forEach(i -> {
            IntStream.rangeClosed(1, columnCount).forEach(j -> {
                stringBuilder.append(j + " * " + i + " = " + (i * j) + "\t");
                if (j % columnCount == 0 && columnCount != Math.abs(j)) {
                    stringBuilder.append("\n");
                }
            });
            stringBuilder.append("\n");
        });
        return stringBuilder.toString();
    }
}
