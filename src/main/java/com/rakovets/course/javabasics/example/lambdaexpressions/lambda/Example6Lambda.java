package com.rakovets.course.javabasics.example.lambdaexpressions.lambda;

import com.rakovets.course.javabasics.example.lambdaexpressions.lambda.model.BinaryOperation;

public class Example6Lambda {
    public static void main(String[] args) {
        BinaryOperation<Integer> additional = Integer::sum;
        BinaryOperation<Integer> subtract = (x, y) -> x - y;
        BinaryOperation<Integer> multi = (x, y) -> x * y;
        BinaryOperation<Integer> division = (x, y) -> x / y;

        int x = 50;
        int y = 10;
        System.out.println(additional.operate(x, y));
        System.out.println(subtract.operate(x, y));
        System.out.println(multi.operate(x, y));
        System.out.println(division.operate(x, y));
    }
}
