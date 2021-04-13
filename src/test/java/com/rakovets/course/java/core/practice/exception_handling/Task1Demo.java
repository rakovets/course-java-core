package com.rakovets.course.java.core.practice.exception_handling;

public class Task1Demo {
    public static void main(String[] args) {
       try{
           Task1.throwsomeException();
       }
       catch (NullPointerException e) {
           System.out.println("This is NullPointerException");
       }
    }
}
