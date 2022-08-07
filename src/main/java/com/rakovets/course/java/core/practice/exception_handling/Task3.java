package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.DivisionException;

public class Task3 {
    public double divisionNumber(double numerator, double denominator) throws DivisionException {
        System.out.println("Start division!");
        if(denominator == 0) {
            throw new DivisionException("You can't divide by zero");
        }
        return numerator / denominator;
    }
}
