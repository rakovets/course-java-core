package com.rakovets.course.java.core.example.class_object;

import com.rakovets.course.java.core.example.class_object.model.Person;

public class Example3HashCode {
    public static void main(String[] args) {
        Person rakovets = new Person("Dmitry", "Rakovets");
        Person anonymous = new Person("Dmitry", "Rakovets");
        System.out.println(rakovets.toString()); // 'Dmitry Rakovets'
        System.out.println(anonymous.toString()); // 'Dmitry Rakovets'
        System.out.println(rakovets.hashCode()); // -613626266
        System.out.println(anonymous.hashCode()); // -613626266
    }
}
