package com.rakovets.course.java.core.practice.exception_handling;

public class Task4Demo {
    public static void main(String[] args) {
        try {
            System.out.println(Task4.getIntegerFromString("12345b") + 10);
        } catch (IllegalArgumentsForParserException illegal) {
            System.out.println(illegal.getMessage());
            System.out.println(illegal.getAdvice());
            illegal.printStackTrace(System.out);
        }
    }
}
