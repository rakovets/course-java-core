package com.rakovets.course.java.core.example.class_object;

import com.rakovets.course.java.core.example.class_object.model.Person;

public class Example1ToString {
    public static void main(String[] args) {
        Person rakovets = new Person("Dmitry", "Rakovets");
        System.out.println(rakovets.toString()); // 'Dmitry Rakovets'
    }
}
