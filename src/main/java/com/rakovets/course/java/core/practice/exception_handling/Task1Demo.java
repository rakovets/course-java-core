package com.rakovets.course.java.core.practice.exception_handling;

public class Task1Demo {
    public static void main(String[] args) {
        try {
            Task1.strToUpperCase();
        } catch (Exception e) {
            System.out.println("Null pointer exception");
            e.printStackTrace();
        }
    }
}
