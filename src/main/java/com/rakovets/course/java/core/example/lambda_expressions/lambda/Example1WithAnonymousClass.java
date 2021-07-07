package com.rakovets.course.java.core.example.lambda_expressions.lambda;

import com.rakovets.course.java.core.example.lambda_expressions.lambda.model.BinaryOperation;

public class Example1WithAnonymousClass {
    public static void main(String[] args) {
        BinaryOperation<Integer> addition = new BinaryOperation<Integer>() {
            @Override
            public Integer operate(Integer t1, Integer t2) {
                return Integer.sum(t1, t2);
            }
        };
        Integer result = addition.operate(2, 5);
        System.out.println(result);
    }
}
