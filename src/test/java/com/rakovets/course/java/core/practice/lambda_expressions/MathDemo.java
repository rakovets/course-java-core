package com.rakovets.course.java.core.practice.lambda_expressions;

public class MathDemo {
    public static void main(String[] args) {
        int[] ownrandom = {22, 33, 44, 55, 66, 77, 88, 99, 13, 14, 15, 26, 37, 47, 96, 99, 99};
        System.out.println(MathStat.quantityOfZero(ownrandom));
        System.out.println(MathStat.makeRandomValues(10, 20));
        System.out.println(MathStat.quantityOfEven(ownrandom));
        System.out.println(MathStat.quantityOfOdd(ownrandom));
        System.out.println(MathStat.quantityOfSelect(ownrandom, 99));

    }
}
