package com.rakovets.course.java.core.practice.exception_handling;

public class Task3 {

    public static void main(String[] args) {
        try {
            concatination(null, "13234");
        } catch (CustomException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static String concatination(String str1, String str2) throws CustomException {
        if (str1 == null || str2 == null) {
            throw new CustomException("The string is null");
        }
        return str1.concat(str2);
    }
}
