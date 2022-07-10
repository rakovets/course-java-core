package com.rakovets.course.java.core.practice.generics;

public class ObscureDemo {
    public static void main(String[] args) {
        Obscure <Integer> obscureFilled = Obscure.of(10);
        Obscure <Integer> obscureNull = Obscure.empty();

        System.out.println("Is present? " + obscureFilled.isPresent());
        System.out.println("Is present? " + obscureNull.isPresent());

        System.out.println("Is empty? " + obscureFilled.isEmpty());
        System.out.println("Is empty? " + obscureNull.isEmpty());

        System.out.println(obscureFilled.orElse(15));
        System.out.println(obscureNull.orElse(15));

        try {
            System.out.println(obscureFilled.orElseThrow(new NullPointerException("Null pointer exception")));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(obscureNull.orElseThrow(new NullPointerException("Null pointer exception")));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
