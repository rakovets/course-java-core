package com.rakovets.course.java.core.example.lambda_expressions.lambda.model;

public class AddBinaryOperation implements BinaryOperation<Integer> {
    @Override
    public Integer operate(Integer t1, Integer t2) {
        return Integer.sum(t1, t2);
    }
}
