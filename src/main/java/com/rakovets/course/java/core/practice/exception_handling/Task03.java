package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.customExceptions.CustomGetException;

public class Task03 {
    public void throwGetException() throws CustomGetException {
        throw new CustomGetException("Test Error");
    }
}
