package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.stream.IntStream;

public class Task02 {
    private int startTable;
    private int endTable;

    public Task02(int startTable, int endTable) {
        this.startTable = startTable;
        this.endTable = endTable;
    }

    public void getMultiplicationTableOneColumn() {
        IntStream.range(startTable, endTable)
                .forEach((x) -> {
                    IntStream.range(startTable, endTable).forEach((y) -> System.out.printf("%d * %d = %d\n", x, y, x * y));
                    System.out.println();
                });
    }

    public void getMultiplicationTableFiveColumn() {
        IntStream.range(startTable, endTable).forEach((x) -> {
            IntStream.range(startTable, 6).forEach((y) -> {
                System.out.print(y + " x " + x + " = " + (x * y) + "\t");
            });
            System.out.println();
        });
        IntStream.range(startTable, endTable).forEach((x) -> {
            IntStream.range(6, endTable).forEach((y) -> {
                System.out.print(y + " x " + x + " = " + (x * y) + "\t");
            });
            System.out.println();
        });
    }
}
