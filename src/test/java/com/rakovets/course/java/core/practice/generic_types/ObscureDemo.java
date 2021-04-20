package com.rakovets.course.java.core.practice.generic_types;

import static com.rakovets.course.java.core.practice.generic_types.Obscure.*;

public class ObscureDemo {
    public static void main(String[] args) {
        Obscure <Integer> obscure = new Obscure<>(null);

        System.out.printf("%s \n", obscure.getField());
        System.out.printf("%s \n", obscure.isPresent());
        System.out.printf("%s \n", obscure.isEmpty());
        System.out.printf("%s \n", obscure.orElse(10));
        try {
            obscure.orElseThrow();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(of(obscure).toString());
        System.out.println(empty().toString());
    }
}
