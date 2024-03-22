package com.rakovets.course.java.core.example.operators;

public class Example1Arithmetic {
    public static void main(String[] args) {
        operators();
        operatorsWithChar();
    }

    static void operators() {
        System.out.println("\nArithmetic operators");

        int a = 19;
        int b = 5;

        int result1 = a + b;
        int result2 = a - b;
        int result3 = a * b;
        int result4 = a / b;
        int result5 = a % b;

        System.out.printf("%d + %d = %d\n", a, b, result1);
        System.out.printf("%d - %d = %d\n", a, b, result2);
        System.out.printf("%d * %d = %d\n", a, b, result3);
        System.out.printf("%d / %d = %d\n", a, b, result4);
        System.out.printf("%d %% %d = %d\n", a, b, result5);
    }

    static void operatorsWithChar() {
        System.out.println("\nOperators with 'char':");
        char a = 65;
        double b = 10.4;
        short s = 5;
        int c = a;

        double result1 = a - b;
        double result2 = a + b;
        double result3 = a * b;
        double result4 = a / b;
        double result5 = a % b;

        int i = a / s;

        System.out.println(a);
        System.out.println(c);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}
