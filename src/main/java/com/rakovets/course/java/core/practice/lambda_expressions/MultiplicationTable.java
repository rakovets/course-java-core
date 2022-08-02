package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.stream.IntStream;

public class MultiplicationTable {
    public String getMultiplicationTableInOneColumn(int first, int second) {
        StringBuilder stringBuilder = new StringBuilder();
        IntStream.rangeClosed(first, second)
                .forEach(i -> IntStream.rangeClosed(first, second)
                        .forEach(j -> stringBuilder.append(i + " * " + j + " = " + (i * j) + "\n")));
        return stringBuilder.toString();
    }

    public String getMultiplicationTableByColumns(int first, int second, int columnCount) {
        StringBuilder stringBuilder = new StringBuilder();
        IntStream.rangeClosed(first, second).boxed().forEach(i -> {
            IntStream.rangeClosed(first, second)
                    .forEach(j -> {
                        stringBuilder.append(i + " * " + j + " = " + (i * j) + "\t");
                        if (j % columnCount == 0 && columnCount != Math.abs(j)) {
                            stringBuilder.append("\n");
                        }
                    });
            stringBuilder.append("\n");
        });
        return stringBuilder.toString().replaceAll("\\n\\n", "\n");
    }
}
