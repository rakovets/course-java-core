package com.rakovets.course.java.core.example.methods;

public class Example4WithDifferentTypeOfParameters {
    public static void main(String[] args) {
        display("Tom", 34);
        display("Bob", 28);
        display("Sam", 23);
    }

    static void display(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }
}
