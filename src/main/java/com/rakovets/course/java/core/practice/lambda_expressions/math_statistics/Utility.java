package com.rakovets.course.java.core.practice.lambda_expressions.math_statistics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Utility {
    public int getRandom() {
        return (int) (Math.random() * 100);
    }

    public List<Integer> getRandomList() {
        List<Integer> list = new ArrayList<>();
        IntStream.range(1, 16)
                .forEach(i -> list.add(getRandom()));
        return list;
    }

    public int numberOfEven(List<Integer> list) {
        return (int) list.stream()
                .filter(number -> number % 2 == 0)
                .count();
    }

    public int numberOfNotEven(List<Integer> list) {
        return (int) list.stream()
                .filter(number -> number % 2 != 0)
                .count();
    }

    public int numberOfNulls(List<Integer> list) {
        return (int) list.stream()
                .filter(number -> number == 0)
                .count();
    }

    public int numberOfMyNum(List<Integer> list, int myNumber) {
        return (int) list.stream()
                .filter(number -> number == myNumber)
                .count();
    }
}
