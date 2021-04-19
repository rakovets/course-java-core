package com.rakovets.course.java.core.practice.exception_handling;

import java.util.NoSuchElementException;

public class Task06Demo {
    public static void main(String[] args) {
        try {
            Task06.getException();
        } catch (NullPointerException | NoSuchElementException ex) {
            ex.printStackTrace(System.out);
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("ArrayIndexOutOfBoundsException: " + arrayIndexOutOfBoundsException.getMessage());
        }
    }
}
