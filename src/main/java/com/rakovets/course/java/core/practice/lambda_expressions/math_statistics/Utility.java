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

    public long getEvenNumber(List<Integer> list) {
        return list.stream()
                .filter(number -> number % 2 == 0)
                .count();
    }

    public long getOddNumber(List<Integer> list) {
        return list.stream()
                .filter(number -> number % 2 != 0)
                .count();
    }

    public long getNumberOfNulls(List<Integer> list) {
        return list.stream()
                .filter(number -> number == 0)
                .count();
    }

    public long getNumber(List<Integer> list, int myNumber) {
        return list.stream()
                .filter(number -> number == myNumber)
                .count();
    }
}
