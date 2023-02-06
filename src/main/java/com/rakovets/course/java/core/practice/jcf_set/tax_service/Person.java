package com.rakovets.course.java.core.practice.jcf_set.tax_service;

import java.util.HashSet;

public class Person {
    private final String name;
    private final String lastName;
    private final String city;
    private final HashSet<Fine> fines = new HashSet<>();

    public Person(String name, String lastName, String city) {
        this.name = name;
        this.lastName = lastName;
        this.city = city;
    }

    public void addFine(Fine fine) {
        fines.add(fine);
    }

    public void removeFine(Integer id) {
        fines.removeIf(fine -> fine.getHashCode() == id);
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public HashSet<Fine> getFines() {
        return fines;
    }
}
