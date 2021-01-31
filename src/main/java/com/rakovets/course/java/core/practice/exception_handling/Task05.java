package com.rakovets.course.java.core.practice.exception_handling;

import java.lang.reflect.Array;

public class Task05 {
    public static void catchAndChangeException(String str) throws CustomNullException{
        try {
            str = str.toString();
        } catch (Exception e) {
            throw new CustomNullException(e.getMessage());
        }
    }
}
