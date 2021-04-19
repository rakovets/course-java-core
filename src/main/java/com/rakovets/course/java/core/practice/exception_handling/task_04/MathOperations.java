package com.rakovets.course.java.core.practice.exception_handling.task_04;

public class MathOperations {
    public static int divide(int num1, int num2) {
        int result =  num1 / num2;
        if(num2 == 3) {
            throw new WrongDividerException("Wrong number");
        }

        return  result;
    }
}
