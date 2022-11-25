package com.rakovets.course.java.core.practice.exception_handling;

public class Task06 {
    public void invokingDifferentExceptions(int processingNumber) {
        switch (processingNumber) {
            case 0:
                throw new ArithmeticException();
            case 1:
                throw new NumberFormatException();
            case 2:
                throw new NullPointerException("Null Pointer Exception!");
        }
    }
}
