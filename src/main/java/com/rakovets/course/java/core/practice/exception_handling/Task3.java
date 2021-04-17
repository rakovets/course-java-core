package com.rakovets.course.java.core.practice.exception_handling;

public class Task3 {
    static class YearOfBirth {
        public static int getYearOfBirth(int currentYear, int age) throws AgeException{
            if (age < 0) {
                throw new AgeException("The age is less than 0!!!");
            }
            return currentYear - age;
        }
    }

    static class AgeException extends Exception {
        public AgeException(String message) {
            super(message);
        }
    }
}
