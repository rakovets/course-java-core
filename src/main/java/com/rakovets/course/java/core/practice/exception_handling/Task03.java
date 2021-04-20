package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.example.exception_handling.exception.NotFoundGetException;

public class Task03 {
    public static void notFoundGetException() throws NotFoundGetException {
        throw new NotFoundGetException("Not Found");
    }
}
