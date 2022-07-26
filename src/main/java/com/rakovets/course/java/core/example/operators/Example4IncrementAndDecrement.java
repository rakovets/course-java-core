package com.rakovets.course.java.core.example.operators;

public class Example4IncrementAndDecrement {
    public static void main(String[] args) {
        postfixIncrement();
        prefixIncrement();
        postfixDecrement();
        prefixDecrement();
    }

    private static void postfixIncrement() {
        System.out.println("\nIncrement :: Postfix form");
        int a1 = 8;
        int b1;

        b1 = a1++; // постфиксный инкремент
        System.out.printf("a=%d, b=%d\n", a1, b1);

        int a2 = 8;
        int b2;

        b2 = a2; // аналог постфиксного инкремента
        a2 = a2 + 1;
        System.out.printf("a=%d, b=%d\n", a2, b2);
    }

    private static void prefixIncrement() {
        System.out.println("\nIncrement :: Prefix form");
        int a1 = 8;
        int b1;

        b1 = ++a1; // постфиксный инкремент
        System.out.printf("a=%d, b=%d\n", a1, b1);

        int a2 = 8;
        int b2;

        a2 = a2 + 1; // аналог постфиксного инкремента
        b2 = a2;
        System.out.printf("a=%d, b=%d\n", a2, b2);
    }

    private static void postfixDecrement() {
        System.out.println("\nDecrement :: Postfix form");
        int a1 = 8;
        int b1;

        b1 = a1--; // постфиксный декремент
        System.out.printf("a=%d, b=%d\n", a1, b1);

        int a2 = 8;
        int b2;

        b2 = a2; // аналог постфиксного декремента
        a2 = a2 - 1;
        System.out.printf("a=%d, b=%d\n", a2, b2);
    }

    private static void prefixDecrement() {
        System.out.println("\nDecrement :: Prefix form");
        int a1 = 8;
        int b1;

        b1 = --a1; // постфиксный декремент
        System.out.printf("a=%d, b=%d\n", a1, b1);

        int a2 = 8;
        int b2;

        a2 = a2 - 1; // аналог постфиксного декремента
        b2 = a2;
        System.out.printf("a=%d, b=%d\n", a2, b2);
    }
}
