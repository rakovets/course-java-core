package com.rakovets.course.java.core.example.decision_making_statements;

public class Example4NestedIfElseStatement {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 10;
        int number3 = 10;

        if (number1 > number2) {
            if (number1 > number3) {
                System.out.println("Number 1 is MAX");
            } else {
                System.out.println("Number 3 is MAX");
            }
        } else {
            if (number2 > number3) {
                System.out.println("Number 2 is MAX");
            } else {
                System.out.println("Number 3 is MAX");
            }
        }
    }
}
