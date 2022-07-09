package com.rakovets.course.java.core.practice.exception_handling;

public class Task1 {

    public void printStringLength(String string) {
        try {
            string.length();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
