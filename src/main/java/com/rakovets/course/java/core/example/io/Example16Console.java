package com.rakovets.course.java.core.example.io;

import java.io.Console;

public class Example16Console {
    public static void main(String[] args) {
        Console console = System.console();
        System.out.println("Enter your name: ");
        try {
            String name = console.readLine();
            System.out.printf("Welcome %s!\n", name);
        } catch (NullPointerException e) {
            System.out.println("\nThrew: NullPointerException\n" +
                    "No console associated to the JVM.\n" +
                    "Please read JavaDoc for method 'System.console()`");
        }
    }
}
