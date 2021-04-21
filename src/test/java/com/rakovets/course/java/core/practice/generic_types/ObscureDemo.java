package com.rakovets.course.java.core.practice.generic_types;

import java.lang.reflect.Type;

import static com.rakovets.course.java.core.practice.generic_types.Obscure.empty;
import static com.rakovets.course.java.core.practice.generic_types.Obscure.of;

public class ObscureDemo {
    public static void main(String[] args) {
        Obscure obscure = new Obscure<>(null);
        System.out.printf("%s\n", obscure.getField());
        System.out.printf("%s\n", obscure.isEmpty());
        System.out.printf("%s\n", obscure.isPresent());
        System.out.printf("%s\n", obscure.orElse(20));
        try{
            obscure.orElseThrow();
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        System.out.println(of(obscure).toString());
        System.out.println(empty().toString());


    }
}
