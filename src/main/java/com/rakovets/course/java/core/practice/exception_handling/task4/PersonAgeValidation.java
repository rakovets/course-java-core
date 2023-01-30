package com.rakovets.course.java.core.practice.exception_handling.task4;

import com.rakovets.course.java.core.practice.exception_handling.task4.exceptions.CustomException;

public class PersonAgeValidation {
    public void isAgeValid(int age) {
        if (age < 21) {
            throw new CustomException("Here in USA, we don't sell alcohol to person under 18!");
        }
    }
}
