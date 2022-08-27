package com.rakovets.course.java.core.practice.reflection;

public class Person {
    private String name;
    public int age;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    private void addOneYear() {
        set(age + 1);
    }

    public void addTwoYears() {
        set(age + 2);
    }

    public void set(int age) {
        this.age = age;
    }

    public void set(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
