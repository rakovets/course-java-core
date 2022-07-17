package com.rakovets.course.java.core.practice.generics;

public class MathDemo {
    public static void main(String[] args) {
        System.out.println("Maximum of three double parameters: " + Math.getMaxValueOfThree(3.0, 5.2, 10.0));
        System.out.println("Maximum of three integer parameters: " + Math.getMaxValueOfThree(31, 52, 13));

        System.out.println("Minimum of five double parameters: " + Math.getMinValueOfFive(1.2,20.5,50.1,-4.0,0.0));
        System.out.println("Minimum of five integer parameters: " + Math.getMinValueOfFive(10,2,5,4,8));

        System.out.println("Average from double array: " + Math.getAverageValueInArray(new Double[] {51.0, 0.0, 10.0, 10.0, 10.0}));
        System.out.println("Average from integer array: " + Math.getAverageValueInArray(new Integer[] {51, 0, 10, 10, 10}));

        System.out.println("Minimum number from double array: " + Math.getMinValueInArray(new Double[] {0.0, -1.0, 22.0, 1.1}));
        System.out.println("Minimum number from integer array: " + Math.getMinValueInArray(new Integer[] {1000, -1, 22, 1, 0}));

        System.out.println("Maximum number from double array: " + Math.getMaxValueInArray(new Double[] {0.0, -1.0, 22.0, 1.1}));
        System.out.println("Maximum number from integer array: " + Math.getMaxValueInArray(new Integer[] {1000, -1, 22, 1, 0}));
    }
}
