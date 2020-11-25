package com.rakovets.course.javabasics.example.lambdaexpressions.lambda;

import com.rakovets.course.javabasics.example.lambdaexpressions.lambda.model.BinaryOperation;

public class Example2FullLambda {
    public static void main(String[] args) {
        BinaryOperation<Integer> addition = (Integer t1, Integer t2) -> {
            return Integer.sum(t1, t2);
        };
        Integer result = addition.operate(2, 5);
        System.out.println(result);
    }
}
