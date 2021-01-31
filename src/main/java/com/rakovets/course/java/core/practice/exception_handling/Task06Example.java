package com.rakovets.course.java.core.practice.exception_handling;

public class Task06Example {
    public static void main(String[] args) {
        try {
            Task06.getRandomException();
        } catch (Exception ex) {
            if (ex.getMessage().equals("Exception 3")) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            } else {
                System.out.println(ex.getMessage());
            }
        }
    }
}
