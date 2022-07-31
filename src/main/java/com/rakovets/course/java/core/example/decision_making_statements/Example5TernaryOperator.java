package com.rakovets.course.java.core.example.decision_making_statements;

public class Example5TernaryOperator {
    public static void main(String[] args) {
        int time = 20;

        if (time < 18) {
            System.out.println("Good day!");
        } else {
            System.out.println("Good evening!");
        }

        String greeting = (time < 18)
                ? "Good day!"
                : "Good evening!";
        System.out.println(greeting);
    }
}
