package com.rakovets.course.java.core.practice.generic_types;

public class ObscureDemo {
    public static void main(String[] args) {
        Obscure<Integer> obscure = new Obscure(123);

        System.out.println(obscure.isPresent());
        System.out.println(obscure.isEmpty());
        System.out.println(obscure.orElse(321));

        try {
            int result = obscure.orElseThrow();
            System.out.println(result);
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }

        Obscure<String> obscure1 = Obscure.of("Hello");
        Obscure<String> obscure2 = Obscure.empty();
    }
}
