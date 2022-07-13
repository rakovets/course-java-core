package com.rakovets.course.java.core.practice.generics;

public class ObscureApplication {
    public static void main(String[] args) {
        Obscure obs = new Obscure<>(null);
        Obscure o = new Obscure<>(1);
        Exception ex1 = new Exception("Object is empty");

        System.out.println("Obscure obs isEmpty: " + obs.isEmpty());
        System.out.println("Obscure o isPresent: " +o.isPresent());

        System.out.println(obs.orElse(o));
        System.out.println(o.orElse(obs));

        try {
            obs.orElseThrow(ex1);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            obs.isPresent();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println(Obscure.empty().getObject());
        System.out.println(Obscure.of("test").getObject());
    }
}
