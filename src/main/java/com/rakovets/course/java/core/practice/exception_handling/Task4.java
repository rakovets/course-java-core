package com.rakovets.course.java.core.practice.exception_handling;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static int getIntegerFromString (String string) throws IllegalArgumentsForParserException {
        Pattern pattern = Pattern.compile("\\D");
        Matcher matcher = pattern.matcher(string);
        boolean found = matcher.find();
        if (found) {
            throw new IllegalArgumentsForParserException("Illegal arguments in String: " + string, "Try to enter only numbers");
        } else {
            return Integer.parseInt(string);
        }
    }
}
