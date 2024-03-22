package com.rakovets.course.java.core.example.looping_statements;

public class Example1ForWithSpecific {
    public static void main(String[] args) {
        int i = 0;
        for (
                System.out.print("Init loop iterator with value: "), System.out.println(i), i = 0;
                i < 10;
                i++, System.out.print("Iteration: "), System.out.println(i)
        ) {
            System.out.println("Execute code for iteration: " + i);
        }
    }
}
