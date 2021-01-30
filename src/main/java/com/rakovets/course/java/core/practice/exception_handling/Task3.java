package com.rakovets.course.java.core.practice.exception_handling;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String name = "*Anton_123";

        try {
           if (isNameCorrect(name)) {
               System.out.println("Welcome, " + name);
           }
        } catch (ImpossibleAccountNameException forbidden){
            System.out.println(forbidden.getMessage());
            StackTraceElement[] stackTrace = forbidden.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                System.out.println(stackTraceElement);
            }
        }
    }

    public static boolean isNameCorrect (String string) throws ImpossibleAccountNameException {
        Pattern pattern = Pattern.compile("\\W");
        Matcher matcher = pattern.matcher(string);
        boolean found = matcher.find();
        if (found) {
            throw new ImpossibleAccountNameException();
        } else {
            return true;
        }
    }
}
