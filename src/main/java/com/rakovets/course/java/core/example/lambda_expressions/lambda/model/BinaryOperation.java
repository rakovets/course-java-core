package com.rakovets.course.java.core.example.lambda_expressions.lambda.model;

@FunctionalInterface
public interface BinaryOperation<T> {
    T operate(T t1, T t2);
}
