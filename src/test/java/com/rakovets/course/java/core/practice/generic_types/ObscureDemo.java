package com.rakovets.course.java.core.practice.generic_types;

public class ObscureDemo {
    public static void main(String[] args) {
        Obscure<Integer> obscure = new Obscure<>(13);
        Obscure<Integer> obscure1 = new Obscure<>(null);
        System.out.printf("\n%d", obscure.get());
        System.out.printf("\n%b", obscure.isPresent());
        System.out.printf("\n%b", obscure.isEmpty());
        System.out.printf("\n%d", obscure.orElse(50));
        System.out.printf("\n%d", obscure1.orElse(50));
        try {
            System.out.printf("\n%s", obscure.orElseThrow(null));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        try {
            System.out.printf("\n%s", obscure1.orElseThrow(null));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        System.out.println("\n" + Obscure.of(obscure));
        System.out.println("\n" + Obscure.empty());
    }
}
