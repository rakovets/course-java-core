package com.rakovets.course.java.core.practice.exception_handling;

public class Task5 {
    public static void throwExistException() {
        throw new NullPointerException("NullPointerException");
    }


    public static void myException() throws MyOwnException {
        try {
            throwExistException();
        } catch (NullPointerException e) {
            throw new MyOwnException(e, e.getMessage());
        }
    }
}
