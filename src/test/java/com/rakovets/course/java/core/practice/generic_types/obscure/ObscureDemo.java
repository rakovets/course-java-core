package com.rakovets.course.java.core.practice.generic_types.obscure;

public class ObscureDemo {
    public static void main(String[] args) throws Exception {
        Obscure<Integer> obscure = new Obscure<>(34445);
        Obscure<Integer> obs = new Obscure<>(null);
        System.out.println(obscure.orElse(455));
       // System.out.println(obs.orElse(455));
        try {
            System.out.println(obscure.orElseThrow(new MyException()));
        }
        catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }
        try {
            System.out.println(obs.orElseThrow(new MyException()));
        }
        catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }
        Obscure.empty();
        Obscure.of(obs);

    }


}
