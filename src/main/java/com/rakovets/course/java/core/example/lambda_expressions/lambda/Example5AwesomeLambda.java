package com.rakovets.course.java.core.example.lambda_expressions.lambda;

import com.rakovets.course.java.core.example.lambda_expressions.lambda.model.BinaryOperation;

public class Example5AwesomeLambda {
    public static void main(String[] args) {
        BinaryOperation<Integer> addition = Integer::sum;
        Integer result = addition.operate(2, 5);
        System.out.println(result);
    }
}
