package com.rakovets.course.java.core.practice.generic_types.obscureTest;

import com.rakovets.course.java.core.practice.generic_types.Obscure;

public class ObscureDemo {
    public static void main(String[] args)  {


        Obscure<String> obscure = new Obscure<>("adb");
        Obscure<Integer> obscure1 = new Obscure<>(null);
        System.out.println(obscure.isPresent());
        System.out.println(obscure.orElse("good"));
        System.out.println(obscure.isEmpty());
       // System.out.println(obscure.orElseThrow());


        System.out.println(" ");

        System.out.println(obscure1.isPresent());
        System.out.println(obscure1.orElse(458));
        System.out.println(obscure1.isEmpty());





    }
}
