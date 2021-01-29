package com.rakovets.course.java.core.practice.exception_handling;

public class Task01 {
    public static void main(String[] args) {
        String str = null;
        try {
            str.toString();
        } catch (Exception ex) {
            System.out.println("String is null. Try again");
        }
    }
}
