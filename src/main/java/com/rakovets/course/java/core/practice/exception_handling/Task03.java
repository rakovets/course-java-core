package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.ExceptionTask03;

public class Task03 {
    public void checkExceptionTask03(int a) throws ExceptionTask03 {
        if (a > 0) {
            throw new ExceptionTask03("Input number should more than 0");
        }
    }
}
