package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.FactorialException;

public class Task3 {
    int result = 1;

    void calculate(int number) throws FactorialException{
        if (number > 0) {
            while (number > 1) {
               result = result * number;
               number--;
            }
            System.out.println(result);
        } else {
            throw new FactorialException("Number can not be negative or zero!");
        }
    }
}
