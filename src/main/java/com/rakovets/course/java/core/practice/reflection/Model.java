package com.rakovets.course.java.core.practice.reflection;

public class Model {
    private String name;

    public Model(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printName(){
        System.out.println(name);
    }
}
