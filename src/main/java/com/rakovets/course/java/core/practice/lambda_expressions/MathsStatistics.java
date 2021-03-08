package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.*;
import java.util.stream.Collectors;

public class MathsStatistics {

    public static List<Integer> getRandom(int size, int start, int finish){
        return new Random().ints(size, start, finish).boxed().collect(Collectors.toList());
    }

    public static int evenNumbers (List<Integer> list) {
        return (int) list.stream().filter(j -> j % 2 == 0).count();
    }

    public static int oddNumbers (List<Integer> list) {
        return (int) list.stream().filter(j -> j % 2 != 0).count();
    }

    public static int equallyZero (List<Integer> list) {
        return (int) list.stream().filter(j -> j == 0).count();
    }

    public static int equallyNumber (List<Integer> list, int number) {
        return (int) list.stream().filter(j -> j == number).count();
    }
}
