package com.rakovets.course.java.core.example.enum_types.model;

public class Saturday extends DayParentClass {
    public Saturday(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("Saturday");
    }
}
