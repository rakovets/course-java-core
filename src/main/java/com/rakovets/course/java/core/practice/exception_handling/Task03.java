package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.example.exception_handling.exception.ExceptionFactorial;

public class Task03 {
    public int factorial(int data) throws ExceptionFactorial {
        if (data < 0) {
            throw new ExceptionFactorial("factorial < 0", data);
        }
        int resultFactorial = 1;
        if (data == 0) {
            return 1;
        }
        for (int i = 1; i <= data; i++) {
            resultFactorial *= i;
        }
        return resultFactorial;
    }
}
