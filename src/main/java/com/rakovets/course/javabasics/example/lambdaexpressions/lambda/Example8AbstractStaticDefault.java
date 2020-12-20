package com.rakovets.course.javabasics.example.lambdaexpressions.lambda;

import com.rakovets.course.javabasics.example.lambdaexpressions.lambda.model.Printable;

public class Example8AbstractStaticDefault {
    public static void main(String[] args) {
        Printable printable = System.out::println;

        printable.print("Hello World with Lambda");
        Printable.printToStandardOutput("Hello World with static method");
        printable.printUtf8To("Hello World with default method", System.out);
    }
}
