package com.rakovets.course.util.practik;

public class Person {
    int phoneNumber;
    String name;
    String surName;

    public Person(int phoneNumber, String name, String surName) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.surName = surName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "phoneNumber=" + phoneNumber +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}
