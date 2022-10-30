package com.rakovets.course.java.core.practice.lambda_expressions.task_02;

import java.util.stream.IntStream;

public class DemoTask02 {
    public static void main(String[] args) {
        final int START_NUMBER = 1;
        final int END_NUMBER = 10;
        final int NUMBER_OF_COLUMNS = 1;


        switch (NUMBER_OF_COLUMNS) {
            case 1 :
                IntStream.range(START_NUMBER, END_NUMBER + 1)
                    .forEach(x -> {
                        IntStream.range(START_NUMBER, END_NUMBER + 1)
                                .forEach(y -> {
                                    System.out.printf(("%d * %d = %d\t"), x, y, x*y);
                                    System.out.println();
                                });
                    });
            break;
            case 5:
                IntStream.range(START_NUMBER, END_NUMBER + 1)
                    .forEach(x -> {
                        IntStream.range(START_NUMBER, NUMBER_OF_COLUMNS + 1)
                                .forEach(y ->
                                        System.out.printf(("%d * %d = %d\t"), x, y, x*y));
                        System.out.println();
                    });
                IntStream.range(START_NUMBER, END_NUMBER + 1)
                        .forEach(x -> {
                            IntStream.range(NUMBER_OF_COLUMNS + 1, END_NUMBER + 1)
                                    .forEach(y ->
                                            System.out.printf(("%d * %d = %d\t"), x, y, x*y));
                            System.out.println();
                        });
        }
    }
}
