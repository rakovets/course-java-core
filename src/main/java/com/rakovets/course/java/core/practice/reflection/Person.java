package com.rakovets.course.java.core.practice.reflection;

public class Person {
    public int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void print(){
        System.out.println(name +" "+ age);
    }
}
