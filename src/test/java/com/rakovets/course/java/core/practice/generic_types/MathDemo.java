package com.rakovets.course.java.core.practice.generic_types;

import java.util.Arrays;

public class MathDemo {
    public static void main(String[] args) {
        Math<Integer> math = new Math<Integer>();

        int dem =  Math.getMaxOfThree(3,5,6);
        System.out.println(dem);

        dem = Math.getMinOfFive(3, 4, 5, 1, 2);
        System.out.println(dem);

        Integer[] aray = new Integer[]{6, 5, 4, 3, 2, 1};

        double av = Math.getAverageValue(aray);
        System.out.println(av);

        int min = Math.getMinFromArray(aray);
        System.out.println(min);

        int max = Math.getMaxFromArray(aray);
        System.out.println(max);

        aray = math.getSortedArray(aray);
        System.out.println(Arrays.toString(aray));
    }
}
