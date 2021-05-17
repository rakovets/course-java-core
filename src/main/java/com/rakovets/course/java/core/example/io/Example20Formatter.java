package com.rakovets.course.java.core.example.io;

import java.util.Formatter;

public class Example20Formatter {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        Formatter simpleFormatter = fmt.format("Formatting %s is easy %d %f", "with Java.", 42, 33.3);
        System.out.println(simpleFormatter);

        Formatter decimalFormatter = new Formatter();
        for (double i = 1000.0; i < 1.0e+10; i *= 100) {
            decimalFormatter.format("%g ", i);
            System.out.println(decimalFormatter);
        }

        Formatter anotherSystemFormatter = new Formatter();
        anotherSystemFormatter.format("Hex: %x. Octal:  %o",  42, 42);
        System.out.println(anotherSystemFormatter);

        Formatter alignmentFormatter = new Formatter();
        alignmentFormatter.format("|%8.2f|", 123.456);
        System.out.println(alignmentFormatter);

        alignmentFormatter = new Formatter();
        alignmentFormatter.format("|%-8.2f|", 123.456);
        System.out.println(alignmentFormatter);

        Formatter orderFormatter = new Formatter();
        orderFormatter.format("%3$d  %1$d %2$d", 1, 22, 333);
        System.out.println(orderFormatter);
    }
}
