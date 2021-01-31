package com.rakovets.course.java.core.practice.exception_handling;

public class Task3Demo {
    public static void main(String[] args) {
        String name = "*Anton_123";

        try {
            if (Task3.isNameCorrect(name)) {
                System.out.println("Welcome, " + name);
            }
        } catch (ImpossibleAccountNameException forbidden) {
            System.out.println(forbidden.getMessage());
            forbidden.printStackTrace(System.out);
        }
    }
}
