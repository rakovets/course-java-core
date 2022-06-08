package com.rakovets.course.java.core.example.decision_making_statements;

public class Example3IfElseIfElseStatement {
    public static void main(String[] args) {
        int number = -10;

        if (number > 0) {
            System.out.println("This number is positive");
        } else if (number < 0) {
            System.out.println("This number is negative");
        } else {
            System.out.println("This number is 0");
        }
        System.out.println("statement AFTER if-else statement");
    }
}
