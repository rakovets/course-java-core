package com.rakovets.course.java.core.practice.generic_types;

public class MathDemo {
    public static void main(String[] args) {
        int[] arr = new int[] {1,3,5,7,9,11,13,15};
        System.out.println(Math.findAverage(arr));
        System.out.println(Math.findMaximum(arr));
        System.out.println(Math.findMinimum(arr));
        System.out.println(Math.findMaximumValue(11,13,15));
        System.out.println(Math.findMinimumValue(17, 17,11,22,66));
    }
}
