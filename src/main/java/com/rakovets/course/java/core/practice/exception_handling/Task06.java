package com.rakovets.course.java.core.practice.exception_handling;

public class Task06 {
    public void checkCorrectEnteredNumber(String processingNumber) {
        if (Integer.valueOf(processingNumber) == 0) {
            throw new ArithmeticException("Passed value is incorrect!");
        }
        if (!processingNumber.matches("\\d+")) {
            throw new NumberFormatException("Passed value is incorrect!");
        }
        if (processingNumber == null) {
            throw new NullPointerException("Null pointer!");
        }
    }
}
