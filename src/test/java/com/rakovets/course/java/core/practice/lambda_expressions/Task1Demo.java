package com.rakovets.course.java.core.practice.lambda_expressions;

public class Task1Demo {
    public static void main(String[] args) {
        String[] arrayString = {"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
        System.out.println(Task1.map(arrayString));
    }
}
