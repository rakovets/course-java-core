package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.ReadNumberException;

public class Demo5 {
    public static void main(String[] args) {
        Task5 task5 = new Task5();
        try {
            System.out.println(task5.numberRead("50dd"));
        } catch (ReadNumberException e) {
            System.err.println(e.getMessage());
            System.err.println(e.getCause());
        }
    }
}
