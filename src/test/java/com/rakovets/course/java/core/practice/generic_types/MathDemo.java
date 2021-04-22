package com.rakovets.course.java.core.practice.generic_types;

public class MathDemo {
    public static void main(String[] args) {
        Integer max = Math.maxValue(0, 170, -120);
        System.out.println("Max value is " + max);

        Double min = Math.minValue(0.0, 12.5, -12.7, 14.0, 18.5);
        System.out.println("Min value is " + min);

        Double average = Math.getAverageValueArray(new Double[] {0.0, 15.0, 22.0, 17.0});
        System.out.println("Average value of array is " + average);

        Double maxValueArray = Math.getMaxValueArray(new Double[] {-15.0, 15.0, 22.0, 17.0});
        System.out.println("Max value of array is " + maxValueArray);

        Integer minValueArray = Math.getMinValueArray(new Integer[] {-15, 15, 22, 17});
        System.out.println("Min value of array is " + minValueArray);
    }
}
