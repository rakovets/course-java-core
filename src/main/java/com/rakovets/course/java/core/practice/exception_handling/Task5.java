package com.rakovets.course.java.core.practice.exception_handling;

import java.util.Locale;

public class Task5 {

    public static String getCorrectName (String string) throws ImpossibleAccountNameException {
        try {
            string = string.toUpperCase(Locale.ROOT).trim() + "123";
        } catch (NullPointerException nullPointer) {
            throw new ImpossibleAccountNameException(nullPointer.getMessage(), string);
        }
        return string;
    }
}
