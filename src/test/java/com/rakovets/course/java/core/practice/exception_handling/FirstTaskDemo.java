package com.rakovets.course.java.core.practice.exception_handling;

public class FirstTaskDemo {
    public static void main(String[] args) {
        try {
            FirstTask.exceptionForFirstTask();
        } catch (NullPointerException e) {
            System.out.print("Str1 is null");
        }
    }
}
