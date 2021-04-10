package com.rakovets.course.java.core.example.wrapper_classes;

public class Example1 {
    public static void main(String[] args) {
        int number = 123;
        String numberAsString = "35645a345345";
        int parsedNumber = Integer.parseInt(numberAsString);

        System.out.println(number - parsedNumber);
    }
}
