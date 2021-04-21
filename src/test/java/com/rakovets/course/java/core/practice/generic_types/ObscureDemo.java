package com.rakovets.course.java.core.practice.generic_types;

public class ObscureDemo {
    public static void main(String[] args) {
        Obscure <Integer> object = new Obscure(null);
        System.out.println(object.getObject());
        Obscure <Integer> notNullObject = new Obscure(100500);
        System.out.println("Does the object exist? " + object.isPresent());
        System.out.println("Does the notNullObject exist? " + notNullObject.isPresent());
        System.out.println("Is the object empty? "+ object.isEmpty());
        System.out.println("Is the notNullObject empty? "+ notNullObject.isEmpty());
        System.out.println("If the object is empty,return number 10: " + object.orElse(10));
        System.out.println("If the notNullObject is empty,return number 10: " + notNullObject.orElse(10));

        try {
            System.out.println(object.orElseThrow());
        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        Obscure.empty();
        Obscure.of(object);



    }
}
