package com.rakovets.course.java.core.practice.generics;

public class ObscureDemo {
    public static void main(String[] args) {
        Obscure<Integer> obscureFull = Obscure.of(20);
        Obscure<Integer> obscureNull = Obscure.empty();

        System.out.println(obscureFull.isPresent());
        System.out.println(obscureNull.isPresent());

        System.out.println(obscureFull.isEmpty());
        System.out.println(obscureNull.isEmpty());

        System.out.println(obscureFull.orElse(10));
        System.out.println(obscureNull.orElse(10));

        try {
            System.out.println(obscureFull.orElseThrow(new NullPointerException("Exception thrown")));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(obscureNull.orElseThrow(new NullPointerException("Exception thrown")));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
