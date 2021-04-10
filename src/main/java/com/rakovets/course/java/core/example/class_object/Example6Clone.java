package com.rakovets.course.java.core.example.class_object;

import com.rakovets.course.java.core.example.class_object.model.Person;

public class Example6Clone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person rakovets = new Person("Dmitry", "Rakovets");
        Object clone = rakovets.clone();
        System.out.println(clone.toString()); // 'Dmitry Rakovets'
        System.out.println(clone.equals(rakovets)); // true
    }
}
