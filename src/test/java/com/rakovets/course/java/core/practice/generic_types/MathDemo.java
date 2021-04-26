package com.rakovets.course.java.core.practice.generic_types;

import java.util.Arrays;

public class MathDemo {
    public static void main(String[] args) {
        Integer[] array = new Integer[] {2, 5, 6, 12, 4, 1, 8, 16, 13};
        System.out.println(Math.findMaximum(87, 12, 24, 5, 34));
        System.out.println(Math.findMinimum(12,1,5,7,2));
        System.out.println(Math.findArrayArithmetical(array));
        System.out.println(Math.findArrayMaximum(array));
        System.out.println(Math.findArrayMinimum(array));
        System.out.println(Arrays.toString(Math.sortArray(array)));
    }
}
