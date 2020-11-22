package com.rakovets.course.javabasics.example.lambdaexpressions;

import com.rakovets.course.javabasics.example.lambdaexpressions.model.MathOperation;

public class Example2ProductionLambda {
    public static void main(String[] args) {
        int x = 50;
        int y = 10;
        System.out.println(MathOperation.ADDITIONAL.operate(x, y));
        System.out.println(MathOperation.SUBTRACT.operate(x, y));
        System.out.println(MathOperation.MULTI.operate(x, y));
        System.out.println(MathOperation.DIVISION.operate(x, y));
    }
}
