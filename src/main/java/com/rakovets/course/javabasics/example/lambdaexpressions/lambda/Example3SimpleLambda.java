package com.rakovets.course.javabasics.example.lambdaexpressions.lambda;

import com.rakovets.course.javabasics.example.lambdaexpressions.lambda.model.BinaryOperation;

public class Example3SimpleLambda {
    public static void main(String[] args) {
        BinaryOperation<Integer> addition = (t1, t2) -> {
            return Integer.sum(t1, t2);
        };
        Integer result = addition.operate(2, 5);
        System.out.println(result);
    }
}
