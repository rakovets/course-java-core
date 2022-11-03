package com.rakovets.course.java.core.practice.lambda_expressions.statistics;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ProjectMathsStatistics {
    public long getEven(List<Integer> list) {
        return list.stream()
                .filter(x -> x % 2 == 0)
                .count();
    }

    public long getNotEven(List<Integer> list) {
        return list.stream()
                .filter(x -> x % 2 != 0)
                .count();
    }

    public long getEqualsZero(List<Integer> list) {
        return list.stream()
                .filter(x -> x == 0)
                .count();
    }

    public long getSomethingValue(List<Integer> list, long y) {
        return list.stream()
                .filter(x -> x == y)
                .count();
    }

    public List<Long> getRandom() {
        return new Random()
                .longs(19, 6, 88)
                .boxed()
                .collect(Collectors.toList());
    }
}
