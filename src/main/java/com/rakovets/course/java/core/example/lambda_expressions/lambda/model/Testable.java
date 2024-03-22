package com.rakovets.course.java.core.example.lambda_expressions.lambda.model;

public class Testable {
    public boolean test() {
        return true;
    }

    public static boolean test(Testable testable) {
        return testable.test();
    }

}
