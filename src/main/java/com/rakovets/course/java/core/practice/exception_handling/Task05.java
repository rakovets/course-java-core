package com.rakovets.course.java.core.practice.exception_handling;

public class Task05 {

    public static double divideValues(double value1, double value2) {
        if (value1 == 0.0 || value2 == 0.0) {
            throw new NullPointerException("This is NullPointerException");
        } else {
            return value1 / value2;
        }
    }

    public static void throwException() throws CustomException {
        throw new CustomException("You cant divide by zero");
    }
}
