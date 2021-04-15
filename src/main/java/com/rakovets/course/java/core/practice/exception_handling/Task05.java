package com.rakovets.course.java.core.practice.exception_handling;

public class Task05 {
    public String glue(String str1, String str2) throws NullPointerException {
        if (str1 == null || str2 == null) {
            throw new NullPointerException();
        }
        return str1.concat(str2);
    }
}
