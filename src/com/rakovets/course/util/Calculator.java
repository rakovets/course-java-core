package com.rakovets.course.util;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean operation = true;
        while (operation) {
            System.out.println("\n Chosee operations:\n1 Addition:\n2 Subtraction:\n3 Division:\n4 Multiplication:\n5 Exit!!");
            int opetation1 = scanner.nextInt();
            switch (opetation1) {
                case 1:
                    System.out.println("Enter two numbers \n number 1: \n number 2:");
                    int num1 = scanner.nextInt();
                    int num2 = scanner.nextInt();
                    Operation op1 = Integer::sum;
                    Operation operation2 = new Operation() {
                        @Override
                        public int operate(int num1, int num2) {
                            return num1 + num2;
                        }
                    };
                    System.out.println("Your resolt is : " + operation2.operate(num1, num2));
                    break;
                case 2:
                    System.out.println("Enter two numbers \n number 1: \n number 2:");
                    int num3 = scanner.nextInt();
                    int num4 = scanner.nextInt();
                    Operation op2 = (x, y) -> x - y;
                    Operation ope = new Operation() {
                        @Override
                        public int operate(int num3, int num4) {
                            return num3 - num4;
                        }
                    };
                    System.out.println("Your resolt is : " + ope.operate(num3, num4));
                    break;
                case 3:
                    System.out.println("Enter two numbers \n number 1: \n number 2:");
                    int num5 = scanner.nextInt();
                    int num6 = scanner.nextInt();
                    Operation op3 = (x, y) -> x / y;
                    Operation ope1 = new Operation() {
                        @Override
                        public int operate(int num5, int num6) {
                            return num5 / num6;
                        }
                    };
                    System.out.println("Your resolt is : " + op3.operate(num5, num6));
                    break;
                case 4:
                    System.out.println("Enter two numbers \n number 1: \n number 2:");
                    int num7 = scanner.nextInt();
                    int num8 = scanner.nextInt();
                    Operation ope4 = (x, y) -> x * y;
                    Operation ope2 = new Operation() {
                        @Override
                        public int operate(int num7, int num8) {
                            return num7 * num8;
                        }
                    };
                    System.out.println("Your resolt is : " + ope4.operate(num7, num8));
                    break;
                case 5:
                    operation = false;
                    System.out.println("Calculator successfully worked !!");
                    break;
            }
        }
    }

    @FunctionalInterface
    interface Operation {
        int operate(int number1, int number2);
    }

    @Override
    public String toString() {
        return "Calculator{}";
    }
}


