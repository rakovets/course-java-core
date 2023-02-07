package com.rakovets.course.java.core.practice.jcf_set.tax_service;

import java.util.HashSet;
import java.util.Objects;

public class Person {
    private String name;
    private String lastName;
    private Cities city;
    private Integer fineCounter;
    private HashSet<Fine> fines = new HashSet<>();

    public Person(String name, String lastName, Cities city) {
        this.name = name;
        this.lastName = lastName;
        this.city = city;
        fineCounter = 0;
    }

    protected void addFine(Fines type, Integer sum, String fineDetails) {
        Fine fine = new Fine(type, sum, fineDetails);
        fine.setId(this.getName() + this.getLastName() + "@" + fineCounter);
        fineCounter++;
        fines.add(fine);
    }

    protected void removeFine(String id) {
        HashSet<Fine> fineHashSet = new HashSet<>();

        for (Fine fine : this.getFines()) {
            if (!Objects.equals(fine.getId(), id)) {
                fineHashSet.add(fine);
            }
        }

        this.fines = fineHashSet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Cities getCity() {
        return city;
    }

    public void setCity(Cities city) {
        this.city = city;
    }

    public HashSet<Fine> getFines() {
        return fines;
    }
}
