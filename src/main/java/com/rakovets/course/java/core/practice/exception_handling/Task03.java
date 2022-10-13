package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exeption.AgeException;

public class Task03 {
    public String adult(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age less than 18", age);
        }
        String result = "Age over 18";
        return result;
    }
}
