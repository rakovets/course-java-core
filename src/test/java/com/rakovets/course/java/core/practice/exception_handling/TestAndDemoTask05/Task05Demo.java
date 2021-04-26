package com.rakovets.course.java.core.practice.exception_handling.TestAndDemoTask05;

import com.rakovets.course.java.core.practice.exception_handling.CustomException;
import com.rakovets.course.java.core.practice.exception_handling.Task05;

public class Task05Demo {
    public static void main(String[] args) throws CustomException {

        try {
            System.out.println(Task05.divideValues(0,5));
        } catch (NullPointerException e) {
            Task05.throwException();
        }
    }
}
