package com.rakovets.course.java.core.practice.lambda_expressions;

public class MultiplicationTableDemo {
    public static void main(String[] args) {
        MultiplicationTable multiplicationTable = new MultiplicationTable();

        System.out.println("Multiplication table in a column.");
        multiplicationTable.tableFirst();

        System.out.println("\nMultiplication table in 5 columns.");
        multiplicationTable.tableSecond();
    }
}
