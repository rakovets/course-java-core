package com.rakovets.course.java.core.practice.exception_handling;

import java.net.SocketException;

public class Task7Demo {
    public static void main(String[] args) {
        Task7 testFinallyBlock = new Task7();

        try {
            testFinallyBlock.getException(1);
        } catch (SocketException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This is finally block");
        }

        try {
            testFinallyBlock.getException(2);
        } catch (SocketException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This is finally block");
        }
    }
}
