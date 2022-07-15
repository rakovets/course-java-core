package com.rakovets.course.java.core.practice.generics;

public class ObscureDemo {
    public static void main(String[] args) {
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        String actualString = "";
        String test1 = "String";

        Obscure<Integer> obscureInt = new Obscure<>(10);

        Obscure<String> obscureStr = new Obscure<>("Vadim");

        Obscure<Integer> obscureStrNull = new Obscure<>(null);

        Obscure<Integer> actualObscureNull = Obscure.empty();

        Obscure<Integer> obscureFilled = Obscure.of(20);

        NullPointerException ex = new NullPointerException("Object doesn't exist");

        System.out.printf(ANSI_PURPLE + "\n Obscure.of - %s;\n " + ANSI_RESET, obscureFilled.get());
        System.out.printf(ANSI_PURPLE + "\n Obscure.empty - %s;\n " + ANSI_RESET, actualObscureNull.get());
        System.out.printf(ANSI_PURPLE + "\n object this is = %s;\n " + ANSI_RESET, obscureInt.get());
        System.out.printf(ANSI_PURPLE + "\n Is Present ?= %s;\n " + ANSI_RESET, obscureInt.isPresent());
        System.out.printf(ANSI_PURPLE + "\n Is Empty ? = %s;\n " + ANSI_RESET, obscureInt.isEmpty());
        System.out.printf(ANSI_PURPLE + "\n Else  = %s;\n " + ANSI_RESET, obscureInt.orElse(5));
        System.out.printf(ANSI_PURPLE + "\n object this is = %s;\n " + ANSI_RESET, obscureStr.get());
        System.out.printf(ANSI_PURPLE + "\n Is Present ?= %s;\n " + ANSI_RESET, obscureStr.isPresent());
        System.out.printf(ANSI_PURPLE + "\n Is Empty ? = %s;\n " + ANSI_RESET, obscureStr.isEmpty());
        System.out.printf(ANSI_PURPLE + "\n Else  = %s;\n " + ANSI_RESET, obscureStr.orElse("5"));
        System.out.printf(ANSI_PURPLE + "\n object this is = %s;\n " + ANSI_RESET, obscureStrNull.get());
        System.out.printf(ANSI_PURPLE + "\n Is Present ?= %s;\n " + ANSI_RESET, obscureStrNull.isPresent());
        System.out.printf(ANSI_PURPLE + "\n Is Empty ? = %s;\n " + ANSI_RESET, obscureStrNull.isEmpty());
        System.out.printf(ANSI_PURPLE + "\n orElse  = %s;\n " + ANSI_RESET, obscureStrNull.orElse(5));
        System.out.printf(ANSI_PURPLE + "\n orElse  = %s;\n " + ANSI_RESET, obscureStrNull.get());

        try {
            actualString = obscureStrNull.orElseThrow(ex).toString();
            System.out.printf(ANSI_RED + "\n Object exists = %s\n " + ANSI_RESET, actualString);
        } catch (Exception actual) {
            System.out.printf(ANSI_RED + "\n %s;\n " + ANSI_RESET, actualString = actual.getMessage());
        }

        try {
            actualString = obscureInt.orElseThrow(ex).toString();
            System.out.printf(ANSI_RED + "\n Object exists = %s\n " + ANSI_RESET, actualString);
        } catch (Exception actual) {
            System.out.printf(ANSI_RED + "\n %s;\n " + ANSI_RESET, actualString = actual.getMessage());
        }
    }
}
