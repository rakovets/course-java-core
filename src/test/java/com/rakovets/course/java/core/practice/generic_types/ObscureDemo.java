package com.rakovets.course.java.core.practice.generic_types;

public class ObscureDemo {
    public static void main(String[] args) {
        Obscure<String> obscure = new Obscure("Hello");
        Obscure<String> obscure1 = new Obscure(null);
        System.out.println(obscure.isPresent());
        System.out.println(obscure.isEmpty());
        System.out.println(obscure.orElse("Bb"));
        try {
            System.out.println(obscure.orElseThrow());
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        } try {
            System.out.println(obscure1.orElseThrow());
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }
        Obscure.of(obscure);
        Obscure.empty();
    }
}
