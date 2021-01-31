package com.rakovets.course.java.core.practice.exception_handling;

public class Task3 {
    public static String concatination(String str1, String str2) throws CustomException {
        if (str1 == null || str2 == null) {
            throw new CustomException("The string is null");
        }
        return str1.concat(str2);
    }
}
