package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.MyArithmeticExceptionTask5;

public class Task5 {
    public void getArithmeticException(int a, int b) throws MyArithmeticExceptionTask5 {
        String exMessage = "Сan't divide by zero";
        try {
            if (b == 0) {
                double divisionResult = a / b;
            }
        } catch (ArithmeticException e) {
            exMessage = e.getMessage();
        }
        throw new MyArithmeticExceptionTask5(exMessage);
    }
}
