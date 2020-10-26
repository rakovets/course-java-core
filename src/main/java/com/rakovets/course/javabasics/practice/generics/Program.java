package com.rakovets.course.javabasics.practice.generics;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(40, "value");
        PairUtil<Integer, String> util = new PairUtil();
        Pair<String, Integer> swaped = util.swap(pair);
        System.out.println(pair);
        System.out.println(swaped);

        Math<Double> math = new Math();
        double max = math.getMaxOf(600.0, 1000.6, 970.7);
        System.out.println(max);

        Math<Double> math1 = new Math();
        Double min = math1.getMinOf(1.5, 12.0, 22.0, 33.0, 14.0);
        System.out.println(min);
        Double[] array = {100.0, 135.0, 87.3, 13.0,133.0};
        System.out.println(math1.getAverageFromArray(array));
        System.out.println(math1.getMaximumFromArray(array));
        System.out.println(math1.getMinimumFromArray(array));
        System.out.println(Arrays.toString(math1.getSortedArray(array)));
        System.out.println("Array contain the key " + math1.getBinarySearch(array,13.0));



    }


}

