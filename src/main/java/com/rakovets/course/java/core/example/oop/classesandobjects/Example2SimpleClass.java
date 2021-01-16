package com.rakovets.course.java.core.example.oop.classesandobjects;

import com.rakovets.course.java.core.example.oop.classesandobjects.model.User;

public class Example2SimpleClass {
    public static void main(String[] args) {
        User dmitry = new User();
        dmitry.name = "Dmitry";
        dmitry.age = 21;
        dmitry.tellAboutYourself();
    }
}
