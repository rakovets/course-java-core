package com.rakovets.course.java.core.practice.exception_handling;

public class Task5 {
    static class DoNullString {
        public static String getNewString(String str) throws NewStringException {
            try {
                String text = new String(str);
                if (text == null) {
                    throw new NullPointerException("This is an empty string.");
                }
                return text + " - new string";
            } catch (NullPointerException ex) {
                throw new NewStringException(ex, "This is me exception");
            }
        }
    }


    static class NewStringException extends NullPointerException {
        public NewStringException(NullPointerException ex, String message) {
            super(message);
        }
    }
}

