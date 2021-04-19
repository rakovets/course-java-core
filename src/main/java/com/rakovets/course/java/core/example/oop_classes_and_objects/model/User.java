package com.rakovets.course.java.core.example.oop_classes_and_objects.model;

public class User {
    public String name;
    public int age;

    public void tellAboutYourself() {
        System.out.printf("My name is %s. I am %d years old.\n", name, age);
    }
}
