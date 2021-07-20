package com.rakovets.course.java.core.example.enum_types.model;

public class Monday extends DayParentClass {
    public Monday(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("Monday");
    }
}
