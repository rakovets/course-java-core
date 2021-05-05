package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.stream.IntStream;

public class Task2 {

    public static void tableFirst(){
        IntStream.range(1,11).forEach( i -> {
            IntStream.range(1,11).forEach( j -> {
                System.out.println( i + " x " + j + " = " + i * j);
            if (j == 10){
                System.out.println();
            } }); });
    }

    public static void tableSecond() {
        IntStream.range(1, 11).forEach(i -> {
            IntStream.range(1, 6).forEach(j -> {
                System.out.print(i + " x " + j + " = " + i * j + "\t");
                if (j == 5) {
                    System.out.println();
                }
            });
        });
        System.out.println();
        IntStream.range(1, 11).forEach(i -> {
            IntStream.range(6, 11).forEach(j -> {
                System.out.print(i + " x " + j + " = " + i * j + "\t");
                if (j == 10) {
                    System.out.println();
                }
            });
        });
    }
}
