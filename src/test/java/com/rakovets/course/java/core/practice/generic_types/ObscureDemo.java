package com.rakovets.course.java.core.practice.generic_types;

public class ObscureDemo {
    public static void main(String[] args) {
        Obscure<String> obscure = new Obscure<>("Summer!");
        Obscure<String> obscure1 = new Obscure<>(null);

        System.out.println(obscure.getElement());
        System.out.println(obscure1.getElement());

        System.out.println(obscure.isPresent());
        System.out.println(obscure1.isPresent());

        System.out.println(obscure.isEmpty());
        System.out.println(obscure1.isEmpty());

        System.out.println(obscure.orElse("Hello Java!"));
        System.out.println(obscure1.orElse("Hello Java!"));

        try {
            System.out.println(obscure.orElseThrow());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(obscure1.orElseThrow());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        Obscure<Integer> obscure3 = Obscure.of(123);
        Obscure<String> obscure4 = Obscure.empty();
    }
}
