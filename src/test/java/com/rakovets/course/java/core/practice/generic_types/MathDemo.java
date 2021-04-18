package com.rakovets.course.java.core.practice.generic_types;

import java.util.Arrays;

public class MathDemo {
    public static void main(String[] args) {
        int[] array = new int[] {2, 5, 6, 12, 4, 1, 0, 16, 13};
        System.out.println(Math.findMaximum(1,8,3));
        System.out.println(Math.findMinimum(12,8,5,7,2));
        System.out.println(Math.findArrayArithmetical(array));
        System.out.println(Math.findArrayMaximum(array));
        System.out.println(Math.findArrayMinimum(array));
        System.out.println(Arrays.toString(Math.sortArray(array)));
    }
}
