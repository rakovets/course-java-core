package com.rakovets.java.practice.io;

import java.io.Serializable;

public class Computer implements Serializable {
    private Integer breed;
    private String name;
    private Integer value;

    public Computer(Integer breed, String name, Integer value) {
        this.breed = breed;
        this.name = name;
        this.value = value;
    }

    public Integer getBreed() {
        return breed;
    }


    public String getName() {
        return name;
    }


    public Integer getValue() {
        return value;
    }


    @Override
    public String toString() {
        return "Computer{" +
                "breed=" + breed +
                ", name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
