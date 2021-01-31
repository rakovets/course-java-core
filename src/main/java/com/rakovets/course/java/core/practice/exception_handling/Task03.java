package com.rakovets.course.java.core.practice.exception_handling;

public class Task03 {
    public static int calculateSum(int numberOne, int numberTwo, int maxSum) throws MaxSumException {
        int sum = numberOne + numberTwo;
        if (sum > maxSum) {
            throw new MaxSumException();
        }
        return sum;
    }
}
