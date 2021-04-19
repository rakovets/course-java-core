package com.rakovets.course.java.core.example.oop_classes_and_objects;

import com.rakovets.course.java.core.example.oop_classes_and_objects.model.Person;

public class Example3Constructor {
    public static void main(String[] args) {
        Person guest = new Person();
        guest.tellAboutYourself();
        Person tom = new Person("Tom");
        tom.tellAboutYourself();
        Person dmitry = new Person("Dmitry", 21);
        dmitry.tellAboutYourself();
    }
}
