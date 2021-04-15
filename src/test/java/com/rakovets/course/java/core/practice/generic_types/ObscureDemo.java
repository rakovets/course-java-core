package com.rakovets.course.java.core.practice.generic_types;

public class ObscureDemo {
    public static void main(String[] args) {
        Obscure obscure = new Obscure<>(20);

        System.out.printf("%s \n", obscure.getField());
        System.out.printf("%s \n", obscure.isPresent());
        System.out.printf("%s \n", obscure.isEmpty());
        System.out.printf("%s \n", obscure.orElse(10));
        try {
            obscure.orElseThrow(NullPointerException) {
            }
        }
        System.out.printf("%s \n", obscure.orElseThrow());
    }
}
