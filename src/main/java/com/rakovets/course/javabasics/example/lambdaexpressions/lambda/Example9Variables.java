package com.rakovets.course.javabasics.example.lambdaexpressions.lambda;

import com.rakovets.course.javabasics.example.lambdaexpressions.lambda.model.Printable;

public class Example9Variables {
    private static String staticVar = "Use static var";
    private String globalVar = "Use global var";

    public static void main(String[] args) {
        Printable printable;

        // Local var
        String localVar = "Use local var";
//        localVar = "New value for local var"; // compile error: must be final OR effectively final
        printable = s -> System.out.println(s + localVar);
        printable.print("Hello World with Lambda. ");

        // Static var
        staticVar = "New value for static var";
        printable = s -> System.out.println(s + staticVar);
        printable.print("Hello World with Lambda. ");

        // Global var
        new Example9Variables().printWithGlobalVar();
    }

    private void printWithGlobalVar() {
        globalVar = "New value for global var";
        Printable printable = s -> System.out.println(s + globalVar);
        printable.print("Hello World with Lambda. ");
    }
}
