package com.rakovets.course.java.core.practice.generic_types.obscure;

public class ObscureDemo {
    public static void main(String[] args) {
        Obscure <Integer> object = new Obscure(null);
        System.out.println(object.getObject());
        Obscure <Integer> notNullObject = new Obscure(2);
        System.out.println("Object exist? " + object.isPresent());
        System.out.println("NotNullObject exist? " + notNullObject.isPresent());
        System.out.println("Object empty? "+ object.isEmpty());
        System.out.println("NotNullObject empty? "+ notNullObject.isEmpty());
        System.out.println("If the object is empty,return 1: " + object.orElse(1));
        System.out.println("If the notNullObject is empty,return 1: " + notNullObject.orElse(1));

        try {
            System.out.println(object.orElseThrow());
        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
