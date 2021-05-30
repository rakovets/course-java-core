package com.rakovets.course.java.core.practice;

import java.util.*;

public class ParallelCalculatorDemo {
    public static void main(String[] args) {
        List<Integer[]> inputArray = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            Integer[] array = new Integer[1000000];
            for (int x = 0; x < array.length; x++) {
                array[x] = new Random().nextInt(300);
            }
            inputArray.add(array);
        }

        Map<Integer[], Integer> map = ParallelCalculator.getArraySum(inputArray);

        for (Map.Entry<Integer[], Integer> map2 : map.entrySet()) {
            System.out.println(" sum = " + map2.getValue());
        }
    }
}
