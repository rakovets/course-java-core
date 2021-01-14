package com.rakovets.course.java.core.example.oop.classesandobjects;

import com.rakovets.course.java.core.example.oop.classesandobjects.model.Init;

public class Example1InitializationBlock {
    public static void main(String[] args) {
        Init obj = new Init(7);
        System.out.println("value for id=" + obj.getId());
    }
}
