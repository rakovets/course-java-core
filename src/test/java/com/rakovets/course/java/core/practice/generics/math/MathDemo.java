package com.rakovets.course.java.core.practice.generics.math;

public class MathDemo {
    public static void main(String[] args) {
        System.out.printf(Math.max(1.2, 3, 4.7) + "\n");
        System.out.printf(Math.maxOfThree(1.2, 3.2, 4.7) + "\n");

        System.out.printf(Math.min(4, 2, 3, 4, 5) + "\n");
        System.out.printf(Math.minOfFive(4.0, 2.0, 3.0, 4.0, 5.0) + "\n");

        Double[] array = {2.0, 2.0, 2.0, 2.0};
        System.out.println(Math.avgInArrayS(array));

    }
}
