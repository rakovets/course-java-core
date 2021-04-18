package com.rakovets.course.java.core.practice.exception_handling;

public class Task5Demo {
    public static void main(String[] args) throws NewStringException {
        try {
            String str1= null;
            String result = Task5.BuildString.getNewString(str1);
            System.out.println(result);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw new NewStringException("This is my Exception");
        }
        System.out.println("Here we need to catch own exception");
    }

    private static class NewStringException extends Exception {
        public NewStringException(String message) {
            super(message);
        }
    }
}
