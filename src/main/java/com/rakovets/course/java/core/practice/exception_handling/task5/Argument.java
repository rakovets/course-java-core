package com.rakovets.course.java.core.practice.exception_handling.task5;

public class Argument {
    public void getIllegalArgument(Double a, Double b) throws ArgumentException {
        String errMessage = "";
        try {
            if ((a == null) || (b == null)) {
                double result = a / b;
            }
        } catch (IllegalArgumentException e) {
            errMessage = e.getMessage();
        }
        throw new ArgumentException(errMessage);
    }
}
