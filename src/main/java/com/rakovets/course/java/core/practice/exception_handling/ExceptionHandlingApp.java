package com.rakovets.course.java.core.practice.exception_handling;

public class ExceptionHandlingApp {
    public static void main(String[] args) throws ExceptionHandlingClass.AgeException {

        ExceptionHandlingClass e = new ExceptionHandlingClass();

        e.returnNullString();
        e.arrayOutOfBound();


        try {
            String result = ExceptionHandlingClass.Age.checkAge(5);
        } catch (ExceptionHandlingClass.AgeException ex) {}





    }
}
