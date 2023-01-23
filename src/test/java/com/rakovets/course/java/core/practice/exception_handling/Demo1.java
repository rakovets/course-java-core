package com.rakovets.course.java.core.practice.exception_handling;

public class StingNull {
    public static void main(String[] args) {
        StingNull nullString = new StingNull();

        try {
            StingNull.stringConcat();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
