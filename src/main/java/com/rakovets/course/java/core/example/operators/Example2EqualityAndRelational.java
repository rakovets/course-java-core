package com.rakovets.course.java.core.example.operators;

public class Example2EqualityAndRelational {
    public static void main(String[] args) {
        operatorsWithChar();
    }

    static void operatorsWithChar() {
        System.out.println("Operators with 'char':");
        char a = 65;
        double b = 10.4;
        byte c = 10;
        c += 1000000000;

        boolean result1 = a == b;
        boolean result2 = a != b;
        boolean result3 = a < b;
        boolean result4 = a <= b;
        boolean result5 = a > b;
        boolean result6 = a >= b;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
    }
}
