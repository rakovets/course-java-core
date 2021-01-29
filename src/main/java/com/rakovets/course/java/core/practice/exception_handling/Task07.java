package com.rakovets.course.java.core.practice.exception_handling;

public class Task07 {
    public static void main(String[] args) {
        try {
            getRandomException();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Block finally");
        }

    }

    public static void getRandomException() throws Exception{
        double i = Math.random();
        if (i >= 0.5) {
            throw new Exception("Exception - number have to be < 0.5");
        }
    }
}
