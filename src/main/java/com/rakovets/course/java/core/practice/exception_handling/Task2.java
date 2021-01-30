package com.rakovets.course.java.core.practice.exception_handling;

public class Task2 {
    public static void main(String[] args)  {
        int[] testArray = new int[5];
        int test = 6;

        try {
            if (test > testArray.length - 1 || test < 0) {
                throw new ArrayIndexOutOfBoundsException("Given variable doesn't match array's length");
            }
            testArray[test] = test;
            System.out.println(testArray[test]);
        } catch (Exception ex) {
                System.out.println(ex.getMessage());
        }
    }
}


