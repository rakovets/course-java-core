package com.rakovets.course.java.core.practice.reflection;

public class Person {
    public int age;
    private String name;

    public Person(String name,int age) {
        this.age = age;
        this.name = name;
    }

    public void print(){
        System.out.println(name +" "+ age);
    }

    public void set(int age) {
        this.age= age;
    }

    public void set(String name) {
        this.name=name;
    }
}
