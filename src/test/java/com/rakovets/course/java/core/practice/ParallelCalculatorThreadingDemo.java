package com.rakovets.course.java.core.practice;

import java.util.*;

public class ParallelCalculatorThreadingDemo {
    public static void main(String[] args) throws InterruptedException {
        List<Integer[]> inoutArray = new LinkedList<>();
        int countArrays = new Random().nextInt(100);

        for (int i = 0; i < countArrays; i++) {
            Integer[] array = new Integer[new Random().nextInt(1000000)];
            for (int x = 0; x < array.length; x++) {
                array[x] = new Random().nextInt(300);
            }
            inoutArray.add(array);
        }
        System.out.println("Input size of arrays : " + inoutArray.size());
        ParallelCalculatorThreading parallelCalculatorThreading = new ParallelCalculatorThreading();

        Date before = new Date();
        long timeBefore = before.getTime();
        Map<Integer[], Integer> map = parallelCalculatorThreading.getArraySum(inoutArray, 2);
        Date after = new Date();

        System.out.println("time is " + (after.getTime() - timeBefore) + "ms");
        System.out.println("Output size of arrays : " + map.size());

        for (Map.Entry<Integer[], Integer> map2 : map.entrySet()) {
            Integer[] arrayS = map2.getKey();
            System.out.println(Arrays.toString(arrayS) + " sum = " + map2.getValue());
        }
    }
}
