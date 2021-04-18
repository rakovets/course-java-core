package com.rakovets.course.java.core.practice.generic_types;

public class ObscureDemo {
    public static void main(String[] args) {
        Obscure <Integer> obscure = new Obscure<>(null);

        System.out.printf("%s \n", obscure.getField());
        System.out.printf("%s \n", obscure.isPresent());
        System.out.printf("%s \n", obscure.isEmpty());
        System.out.printf("%s \n", obscure.orElse(10));
        try {
            obscure.orElseThrow();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
