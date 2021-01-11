package com.rakovets.course.java.core.example.methods;

public class Example2CallMethods {
    public static void main(String[] args) {
        hello();
        welcome();
        welcome();
    }

    static void hello() {
        System.out.println("Hello");
    }

    static void welcome() {
        System.out.println("Welcome to Java 11");
    }
}
