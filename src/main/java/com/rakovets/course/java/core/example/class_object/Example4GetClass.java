package com.rakovets.course.java.core.example.class_object;

import com.rakovets.course.java.core.example.class_object.model.Person;

public class Example4GetClass {
    public static void main(String[] args) {
        String string = "This is String";
        Class stringClass = string.getClass();
        System.out.println(stringClass.getName());
        // java.lang.String
        Person person = new Person("Dmitry", "Rakovets");
        Class personClass = person.getClass();
        System.out.println(personClass.getName());
        // Person
    }
}
