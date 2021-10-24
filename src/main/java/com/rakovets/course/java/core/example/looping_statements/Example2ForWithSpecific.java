package com.rakovets.course.java.core.example.looping_statements;

public class Example2ForWithSpecific {
    public static void main(String[] args) {
        for (
                int i = 0, j = 0, k = (i == 0)? 0 : 1;
                i < 10;
                i++, k++, j = 10, System.out.print("Iteration: "), System.out.println(i)
        ) {
            System.out.println("Execute code for iteration: " + i);
        }
    }
}
