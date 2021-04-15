package com.rakovets.course.java.core.practice.generic_types;

import java.lang.reflect.Type;

public class ObscureDemo {
    public static void main(String[] args) {
        Obscure obscure = new Obscure<>(10);
        System.out.printf("%s\n", obscure.getField());
        System.out.printf("%s\n", obscure.isEmpty());
        System.out.printf("%s\n", obscure.isPresent());
        System.out.printf("%s\n", obscure.orElse(20));

    }
}
