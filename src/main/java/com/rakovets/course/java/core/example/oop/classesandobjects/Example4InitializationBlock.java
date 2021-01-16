package com.rakovets.course.java.core.example.oop.classesandobjects;

import com.rakovets.course.java.core.example.oop.classesandobjects.model.Init;

public class Example4InitializationBlock {
    public static void main(String[] args) {
        Init obj = new Init(7);
        System.out.println("Object state: id=" + obj.id);
    }
}
