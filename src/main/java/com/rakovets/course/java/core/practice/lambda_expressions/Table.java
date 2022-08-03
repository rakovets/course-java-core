package com.rakovets.course.java.core.practice.lambda_expressions;

public class Table {
    public void printTableInOneColumn() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + "x" + j + "=" + (i * j) + "\n");
            }
            System.out.println();
        }
    }

    public void printTableInFiveColumns() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + "x" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
        System.out.println("\t");
        for (int i = 1; i <= 10; i++) {
            for (int j = 6; j <= 10; j++) {
                System.out.print(i + "x" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
