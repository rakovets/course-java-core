package com.rakovets.course.javabasics.example.lambdaexpressions;

import com.rakovets.course.javabasics.example.lambdaexpressions.model.IntBinaryOperation;

public class Example1Lambda {
    public static void main(String[] args) {
        IntBinaryOperation additional = (x, y) -> x + y;
        IntBinaryOperation subtract = (x, y) -> x - y;
        IntBinaryOperation multi = (x, y) -> x * y;
        IntBinaryOperation division = (x, y) -> x / y;

        int x = 50;
        int y = 10;
        System.out.println(additional.operate(x, y));
        System.out.println(subtract.operate(x, y));
        System.out.println(multi.operate(x, y));
        System.out.println(division.operate(x, y));
    }
}
