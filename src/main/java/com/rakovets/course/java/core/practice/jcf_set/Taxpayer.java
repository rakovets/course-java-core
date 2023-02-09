package com.rakovets.course.java.core.practice.jcf_set;

import java.util.HashSet;

public class Taxpayer {
    private String id;
    private String firstName;
    private String lastName;
    private Cities city;
    private HashSet<Fine> fine;

    public Taxpayer(String firstName, String lastName, Cities city, String id) {
        this.id =id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
    }

    public Taxpayer() {
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public HashSet<Fine> getFine() {
        return fine;
    }

    public Cities getCity() {
        return city;
    }

    public void setCity(Cities city) {
        this.city = city;
    }

    public void setFine(HashSet<Fine> fine) {
        this.fine = fine;
    }
}
