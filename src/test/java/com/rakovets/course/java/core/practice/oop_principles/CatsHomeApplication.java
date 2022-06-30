package com.rakovets.course.java.core.practice.oop_principles;

public class CatsHomeApplication {
    public static void main(String[] args) {
        Cat marl = new Siamese("Marl");
        Person tom = new Person(-500);

        System.out.println(tom.getHappiness());

    }
}
