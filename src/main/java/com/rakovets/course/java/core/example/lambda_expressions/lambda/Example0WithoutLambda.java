package com.rakovets.course.java.core.example.lambda_expressions.lambda;

import com.rakovets.course.java.core.example.lambda_expressions.lambda.model.AddBinaryOperation;
import com.rakovets.course.java.core.example.lambda_expressions.lambda.model.BinaryOperation;

public class Example0WithoutLambda {
    public static void main(String[] args) {
        BinaryOperation<Integer> addition = new AddBinaryOperation();
        Integer result = addition.operate(2, 5);
        System.out.println(result);
    }
}
