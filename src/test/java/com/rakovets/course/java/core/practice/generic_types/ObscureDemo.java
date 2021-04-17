package com.rakovets.course.java.core.practice.generic_types;

import com.rakovets.course.java.core.exception.MyException;

public class ObscureDemo {
    public static void main(String[] args) {
        Obscure<String> obscure = new Obscure<>();
        try {
            System.out.println(obscure.orElseThrow(null));
        } catch (MyException ex) {
            System.out.println(ex.getMessage());
        }
        Obscure<Integer> obscure1 = Obscure.empty();


    }
}
