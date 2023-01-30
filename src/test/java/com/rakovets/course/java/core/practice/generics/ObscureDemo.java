package com.rakovets.course.java.core.practice.generics;

public class ObscureDemo {

    public static void main(String[] args) {
        Obscure<String> obs = new Obscure<>("Hello");
        Obscure<Integer> obs2 = new Obscure<>(15);

        System.out.println(obs2.isEmpty());



    }
}
