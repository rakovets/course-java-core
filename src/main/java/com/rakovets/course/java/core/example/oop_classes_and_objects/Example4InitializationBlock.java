package com.rakovets.course.java.core.example.oop_classes_and_objects;

import com.rakovets.course.java.core.example.oop_classes_and_objects.model.Init;

public class Example4InitializationBlock {
    public static void main(String[] args) {
        Init obj = new Init(7);
        System.out.println("Object state: id=" + obj.id);
    }
}
