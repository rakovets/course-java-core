package com.rakovets.course.java.core.practice.generic_types;

public class MathDemo {
    public static void main(String[] args) {

        double max = Math.getMaxValueOfThree(0, 12, -12);
        System.out.println("Max value is " + max);

        double min = Math.getMinValueOfFive(1.2, 0.0, -5.0, -5.1, 12.0);
        System.out.println("Min value is " + min);

        double average = Math.getAverageMeanInArray(new Double[] {0.0, -1.0, 22.0, 1.1});
        System.out.println("Average value of array is " + average);

        double maxValueInArray = Math.getMaxValueInArray(new Double[] {-3.2, 5.0, 0.0, 11.1, -6.0});
        System.out.println("Max array value is " + maxValueInArray);

        double minValueInArray = Math.getMinValueInArray(new Double[] {32.0, 5.0, 0.0, 11.1, -6.0});
        System.out.println("Max array value is " + minValueInArray);
    }
}

