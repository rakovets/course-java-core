package com.rakovets.course.java.core.practice.lambda_expressions;

public class Task2Demo {

    public static void main(String[] args) {
        format(5).printTable();
    }

    public static Operation format(int row) {
        switch (row) {
            case 1:
                return () -> {
                    for (int i = 1; i < 10; i++) {
                        for (int j = 1; j < 10; j++) {
                            System.out.println(i + " * " + j + " = " + i * j);
                        }
                        System.out.println();
                    }
                };
            case 5:
                return () -> {
                    for (int i = 1; i <= 10; i++) {
                        for (int j = 1; j < 10; j++) {
                            if (j > 5) {
                                System.out.println();
                                break;
                            }
                            System.out.printf("%-15s", i + " * " + j + " = " + i * j + "    ");
                        }
                    }
                    System.out.println();
                    for (int i = 1; i <= 10; i++) {
                        for (int j = 6; j <= 11; j++) {
                            if (j == 11) {
                                System.out.println();
                                break;
                            }
                            System.out.printf("%-15s", i + " * " + j + " = " + i * j + "    ");
                        }
                    }
                };
            default:
                return () -> System.out.println("There is no code for this number");
        }
    }
}
