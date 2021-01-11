package com.rakovets.course.java.core.example.lambdaexpressions.lambda.model;

@FunctionalInterface
public interface BinaryOperation<T> {
    T operate(T t1, T t2);
}
