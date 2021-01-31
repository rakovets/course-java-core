package com.rakovets.course.java.core.practice.exception_handling;

import java.util.NoSuchElementException;

public class Task6Demo {
    public static void main(String[] args) {
        try {
            Task6.getException();
        } catch (NullPointerException | NoSuchElementException ex) {
            ex.printStackTrace(System.out);
        } catch (ArrayIndexOutOfBoundsException arx) {
            System.out.println("ArrayIndexOutOfBoundsException: " + arx.getMessage());
        }
    }
}
