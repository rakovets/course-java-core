package com.rakovets.course.java.core.practice.generics;

import java.util.concurrent.ExecutionException;

public class ObscureApplication {
    public static void main(String[] args) {
        Obscure obs = new Obscure<>(null);
        Obscure o = new Obscure<>(1);

//        System.out.println(obs.getObject());
//        System.out.println(obs.isEmpty());

        System.out.println(obs.orElse(o));

        Exception ex1 = new Exception("Object is empty");

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

        System.out.println(Obscure.empty());


        System.out.println(Obscure.of("test"));




    }
}
