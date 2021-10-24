package com.rakovets.course.java.core.example.enum_types.model;

public abstract class DayParentClass {
    public static final DayParentClass MONDAY = new Monday("MONDAY");
    public static final DayParentClass SUNDAY = new Sunday("SUNDAY");
    public static final DayParentClass SATURDAY = new Saturday("SATURDAY");

    private String name;

    protected DayParentClass(String name) {
        this.name = name;
    }

    public abstract void print();
}
