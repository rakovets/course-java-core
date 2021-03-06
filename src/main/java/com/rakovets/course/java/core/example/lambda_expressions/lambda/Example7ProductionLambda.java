package com.rakovets.course.java.core.example.lambda_expressions.lambda;

import com.rakovets.course.java.core.example.lambda_expressions.lambda.model.MathIntOperation;

public class Example7ProductionLambda {
    public static void main(String[] args) {
        int x = 50;
        int y = 10;
        System.out.println(MathIntOperation.ADDITIONAL.operate(x, y));
        System.out.println(MathIntOperation.SUBTRACT.operate(x, y));
        System.out.println(MathIntOperation.MULTI.operate(x, y));
        System.out.println(MathIntOperation.DIVISION.operate(x, y));
    }
}
