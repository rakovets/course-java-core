package com.rakovets.course.java.core.practice.exception_handling.task4;

import com.rakovets.course.java.core.practice.exception_handling.task4.exceptions.CustomRuntimeException;

public class CallRuntimeException {
    public void isAgeValid(int age) {
        if (age < 21) {
            throw new CustomRuntimeException("Here in USA, we don't sell alcohol to person under 18!");
        }
    }
}
