package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.example.exception_handling.exception.ExceptionExtendsRunTime;

public class Task04Demo {
    public static void main(String[] args) {
        Task04 task04 = new Task04();
        try {
            System.out.println(task04.findMaxNum(new int[]{5, 2, 7, 9}, 0, 5));
        } catch (ExceptionExtendsRunTime ex) {
            System.out.println("Exception " + ex.getMessage());
            System.out.println("Error index " + ex.getIndex());
            ex.printStackTrace();
        }
    }
}
