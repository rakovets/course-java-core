package com.rakovets.course.java.core.practice.exception_handling;

public class Task5 {
    static class BuildString {
        public static String getNewString(String str) {
            String text = new String(str);
            if (text == null) {
                throw new NullPointerException();
            }
            System.out.println(text + " - new string.");
            return text;
        }
    }
}
