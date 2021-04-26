package com.rakovets.course.java.core.practice.generic_types;

import static com.rakovets.course.java.core.practice.generic_types.Obscure.*;

public class ObscureDemo {
    public static void main(String[] args) {
        Obscure <Integer> obscure = new Obscure<>(12);

        System.out.printf("%s \n", obscure.getField());
        System.out.printf("%s \n", obscure.isPresent());
        System.out.printf("%s \n", obscure.isEmpty());
        System.out.printf("%s \n", obscure.orElse(14));
        try {
            System.out.println(obscure.orElseThrow(null));
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(of(obscure).toString());
        System.out.println(empty().toString());
    }
}
