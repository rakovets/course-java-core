package com.rakovets.course.java.core.practice.exception_handling;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static boolean isNameCorrect (String string) throws ImpossibleAccountNameException {
        Pattern pattern = Pattern.compile("\\W");
        Matcher matcher = pattern.matcher(string);
        boolean found = matcher.find();
        if (found) {
            throw new ImpossibleAccountNameException("Invalid account name", string);
        } else {
            return true;
        }
    }
}
