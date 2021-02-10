package com.rakovets.course.java.core.practice.jcf.collection.TaxService;

public class Person {
    private final String name;
    private final String penaltyType;
    private final String city;

    public Person(String name, String penaltyType, String city) {
        this.name = name;
        this.penaltyType = penaltyType;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getPenaltyType() {
        return penaltyType;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Penalty Type: " + penaltyType + ", City: " + city;
    }
}
