package com.rakovets.course.java.core.practice.exception_handling;

public class Task04 {
    public static int calculateSum(int numberOne, int numberTwo, int maxSum) throws MaxSumMessageException {
        int sum = numberOne + numberTwo;
        if (sum > maxSum) {
            throw new MaxSumMessageException("Sum greater than 20");
        }
        return sum;
    }
}
