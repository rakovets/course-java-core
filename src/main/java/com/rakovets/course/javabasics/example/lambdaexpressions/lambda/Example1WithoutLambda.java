package com.rakovets.course.javabasics.example.lambdaexpressions.lambda;

import com.rakovets.course.javabasics.example.lambdaexpressions.lambda.model.BinaryOperation;

public class Example1WithoutLambda {
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
