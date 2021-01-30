package com.rakovets.course.java.core.practice.exception_handling;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {

        try {
            System.out.println(getIntegerFromString("12345b") + 10);
        } catch (IllegalArgumentsForParserException illegal) {
            System.out.println(illegal.getMessage());
            System.out.println(illegal.getAdvice());
            illegal.printStackTrace(System.out);
        }
    }

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
