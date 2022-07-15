package com.rakovets.course.java.core.practice.generics;

public class PairDemo {
    public static void main(String[] args) {
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_RESET = "\u001B[0m";

        Pair<Integer, String> givenPair = new Pair<>(10, "Vadim");

        Pair<Integer, String> newPair = givenPair.getSwapped();

        Pair<String, Integer> thenPair = Pair.swap(givenPair);

        System.out.printf(ANSI_PURPLE + "\ngetSwapped: FirstField + SecondField  = %s + %s;\n " + ANSI_RESET, givenPair.getFirstField(), givenPair.getSecondField());
        System.out.printf(ANSI_PURPLE + "\nThey are the same objects? = %s;\n " + ANSI_RESET, givenPair.equals(newPair));
        System.out.printf(ANSI_PURPLE + "\nswap: FirstField + SecondField  = %s + %s;\n " + ANSI_RESET, thenPair.getFirstField(), thenPair.getSecondField());
        System.out.printf(ANSI_PURPLE + "\nThey are the same objects? = %s;\n " + ANSI_RESET, thenPair.equals(newPair));
    }
}
