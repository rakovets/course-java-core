package com.rakovets.course.javabasics.practice.exceptionhandling;

public class Task5 {
    public static void main(String[] args) throws WrongLengthOfArrayException {
        try {
            throw new RuntimeException("The RuntimeExeption has been Catched");
        } catch (RuntimeException ex) {
            String message = ex.getMessage();
            throw new WrongLengthOfArrayException(message);
        }

    }
}
