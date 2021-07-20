package com.rakovets.course.java.core.example.enum_types.model;

public class Sunday extends DayParentClass {
    public Sunday(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("Sunday");
    }
}
