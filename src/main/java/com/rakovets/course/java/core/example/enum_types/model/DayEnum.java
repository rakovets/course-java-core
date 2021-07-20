package com.rakovets.course.java.core.example.enum_types.model;

public enum DayEnum {
    MONDAY("Monday"), SATURDAY("Saturday"), SUNDAY("Sunday");

    private final String name;

    DayEnum(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }
}
