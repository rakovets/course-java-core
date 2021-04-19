package com.rakovets.course.java.core.example.oop_classes_and_objects.model;

public class Person {
    public String name;
    public int age;

    public Person() {
        this("Guest", 18);
        this.tellAboutYourself();
    }

    public Person(String n) {
        name = n;
        age = 18;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void tellAboutYourself() {
        System.out.printf("My name is %s. I am %d years old.\n", name, age);
    }
}
