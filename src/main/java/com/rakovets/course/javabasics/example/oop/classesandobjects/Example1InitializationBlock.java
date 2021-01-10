package com.rakovets.course.javabasics.example.oop.classesandobjects;

import com.rakovets.course.javabasics.example.oop.classesandobjects.model.Init;

public class Example1InitializationBlock {
    public static void main(String[] args) {
        Init obj = new Init(7);
        System.out.println("value for id=" + obj.getId());
    }
}
