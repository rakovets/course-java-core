package com.rakovets.course.java.core.practice.generic_types;

public class MathDemo {
    public static void main(String[] args) {
        Number max = Math.getMaxValueOfThree(0, 12, -12);
        System.out.println("Max value is " + max);

        Number min = Math.getMinValueOfFive(1.2, 0.0, -5.0, -5.1, 12.0);
        System.out.println("Min value is " + min);

        Number average = Math.getArithmeticMeanInArray(new Number[] {0.0, -1.0, 22.0, 1.1});
        System.out.println("Average value of array is " + average);

        Number maxValueInArray = Math.getMaxValueInArray(new Number[] {-3.2, 5.0, 0.0, 11.1, -6.0});
        System.out.println("Max array value is " + maxValueInArray);

        Number minValueInArray = Math.getMinValueInArray(new Number[] {-3.2, 5.0, 0.0, 11.1, -6.0});
        System.out.println("Max array value is " + minValueInArray);
    }
}

