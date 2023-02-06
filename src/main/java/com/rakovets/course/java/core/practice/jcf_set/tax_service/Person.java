package com.rakovets.course.java.core.practice.jcf_set.tax_service;

public class Person {
    private final String name;
    private final String lastName;
    private final String dateOfBirth;
    private final String id;

    public Person(String name, String lastName, String dateOfBirth, String id) {
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getId() {
        return id;
    }
}
