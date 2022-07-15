package com.rakovets.course.java.core.practice.generics;

public class MathDemo {
    public static void main(String[] args) {
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_RESET = "\u001B[0m";

        System.out.printf(ANSI_PURPLE + "\nMAX of three passed parameters  = %s;\n " + ANSI_RESET, Math.getMax(2.5, 2.8, 3.6));
        System.out.printf(ANSI_PURPLE + "\nMin of three passed parameters  = %s;\n " + ANSI_RESET, Math.getMin(2, 6, 8, 4, 9));
        System.out.printf(ANSI_PURPLE + "\nAverage array in value  = %s;\n " + ANSI_RESET, Math.getAverage(new Double[]{1.5, 2.6, 3.9}));
        System.out.printf(ANSI_PURPLE + "\nMAX in array  = %s;\n " + ANSI_RESET, Math.getMaxFromArray(new Double[]{1.5, 2.6, 3.9}));
        System.out.printf(ANSI_PURPLE + "\nMIN in array  = %s;\n " + ANSI_RESET, Math.getMinFromArray(new Double[]{1.5, 2.6, 3.9}));
    }
}
