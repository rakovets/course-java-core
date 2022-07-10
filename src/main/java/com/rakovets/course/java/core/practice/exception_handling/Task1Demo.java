package com.rakovets.course.java.core.practice.exception_handling;

public class Task1Demo {
    public static void main(String[] args) {
        String firstString = null;
        String symbol;

        try {
            symbol = String.valueOf(Task1.getSymbol(firstString));
        } catch (NullPointerException e) {
            e.printStackTrace();
            symbol = e.getMessage();
        }
        System.out.println(symbol);
    }
}

