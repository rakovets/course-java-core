package com.rakovets.course.java.core.practice.generic_types;

public class ObscureDemo {
    public static void main(String[] args) {
        Obscure<Integer> obscure = new Obscure(123);
        Obscure<Integer> obscureEmpty = new Obscure(null);

        System.out.println(obscure.isPresent());
        System.out.println(obscure.isEmpty());
        System.out.println(obscure.orElse(321));


        try {
            int result = obscureEmpty.orElseThrow(new MyException());
            System.out.println(result);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        Obscure<String> obscure1 = Obscure.of("Hello");
        System.out.println("The method created an object with a field - " + obscure1.getField());

        Obscure<String> obscure2 = Obscure.empty();
        System.out.println("Did this method create an object with an empty object? - " + obscure2.isEmpty());
    }
}
