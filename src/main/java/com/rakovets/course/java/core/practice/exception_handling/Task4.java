package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.MyRunTimeExceptionOnNullString;

public class Task4 {
    public void getMyExceptionOnNullString(String string) throws MyRunTimeExceptionOnNullString {
        if (string == null) {
            throw new MyRunTimeExceptionOnNullString("Runtime Exception");
        }
    }
}
