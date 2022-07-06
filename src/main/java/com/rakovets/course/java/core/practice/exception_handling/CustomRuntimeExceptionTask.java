package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.MyRuntimeExceptionOnNullString;

public class CustomRuntimeExceptionTask {
    public void produceMyExceptionOnNullString(String string) throws MyRuntimeExceptionOnNullString {
        if (string == null) {
            throw new MyRuntimeExceptionOnNullString("Runtime Exception");
        }
    }
}
