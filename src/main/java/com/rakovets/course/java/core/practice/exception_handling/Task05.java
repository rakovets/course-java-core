package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.customExceptions.CustomNoDataException;

public class Task05 {
    private String str;

    public Task05(String str) {
        this.str = str;
    }

    public void printException() throws CustomNoDataException {
        System.out.println("Data entry pending...");
        try {
            if (str == null) {
                throw new CustomNoDataException("Enter the data.");
            }
            System.out.println(str);
        } catch (NullPointerException exception) {
            System.out.println(exception.toString());
            throw new CustomNoDataException(exception.getMessage());
        }
    }

}
