package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MultiplicationTable {

    private static List<Integer> getListOfNumbersFromOneToTen() {
        List<Integer> numbersFromOneToTen = new ArrayList<>();
        numbersFromOneToTen.add(1);
        numbersFromOneToTen.add(2);
        numbersFromOneToTen.add(3);
        numbersFromOneToTen.add(4);
        numbersFromOneToTen.add(5);
        numbersFromOneToTen.add(6);
        numbersFromOneToTen.add(7);
        numbersFromOneToTen.add(8);
        numbersFromOneToTen.add(9);
        numbersFromOneToTen.add(10);
        return numbersFromOneToTen;
    }

    public static void oneColumn() {
        IntStream.iterate(1, x -> x+1)
                .limit(10)
                .forEach(x -> {
                    Stream.iterate(1, y -> y + 1)
                            .limit(10)
                            .forEach(y -> System.out.println(x + " x " + y + " = " + x * y));
                    System.out.println("____________");
                });
    }

    public static void fiveColumn() {
        IntStream.iterate(1, x -> x+1)
                .limit(10)
                .forEach(x -> {
                    getListOfNumbersFromOneToTen().stream()
                            .limit(5)
                            .forEach(y -> System.out.print(x + " x " + y + " = " + x * y + "\t\t\t"));
                    System.out.println();
                });
        System.out.println();
        getListOfNumbersFromOneToTen()
                .forEach(x -> {
                    getListOfNumbersFromOneToTen().stream()
                            .skip(5)
                            .forEach(y -> System.out.print(x + " x " + y + " = " + x * y + "\t\t\t"));
                    System.out.println();
                });
    }
}

