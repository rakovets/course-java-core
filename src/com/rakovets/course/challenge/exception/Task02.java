package com.rakovets.course.challenge.exception;

public class Task02 {
    public static void main(String[] args) {
        try {
            String s1 = null;
            System.out.println(s1.trim());
        } catch (java.lang.Exception ex) {
            System.out.printf("You have exception: %s \n", ex);
            ex.printStackTrace();
        }
    }
}
