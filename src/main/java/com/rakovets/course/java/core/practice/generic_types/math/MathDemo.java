package com.rakovets.course.java.core.practice.generic_types.math;

import java.util.Arrays;

public class MathDemo {
    public static void main(String[] args) {
        int[] array = new int[] {10, 5, 0, 5, 10, 40, 20, 10};
        System.out.println(Math.returnMaximumOfThreeParameters(10,20,30));
        System.out.println(Math.returnMaximumOfFiveParameters(10,20,30,40,50));
        System.out.println(Math.returnArithmeticMeanArray(array));
        System.out.println(Math.returnArrayMaximum(array));
        System.out.println(Math.returnArrayMinimum(array));
      }
}
