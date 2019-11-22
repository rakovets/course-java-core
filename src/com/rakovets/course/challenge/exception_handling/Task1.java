package com.rakovets.course.challenge.exception_handling;

public class Task1 {
    private String str = null;
    public void checkOnException() {
        try {
            if (str == null) {
                throw new Exception("String have value: null");
            }
            System.out.println("String is " + str);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
