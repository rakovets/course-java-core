package com.rakovets.course.java.core.example.lambda_expressions.lambda;

import com.rakovets.course.java.core.example.lambda_expressions.lambda.model.Testable;

import java.util.function.Supplier;

public class Example10SpecificCases {
    public static void main(String[] args) {
        Supplier<Boolean> supplier = new Testable()::test;
        Supplier<Testable> testableSupplier  = Testable::new;
        // compile-time errors:
//        Predicate<Testable> predicate = Testable::test;
//        Predicate<Testable> predicate2 = new Testable()::test;
//        Supplier<Boolean> supplier2 = Testable::test;
    }
}
