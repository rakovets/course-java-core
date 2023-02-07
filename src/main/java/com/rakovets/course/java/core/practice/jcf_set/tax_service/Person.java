package com.rakovets.course.java.core.practice.jcf_set.tax_service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Person {
    private String name;
    private String lastName;
    private String city;
    private Integer fineCounter;
    private HashSet<Fine> fines = new HashSet<>();

    public Person(String name, String lastName, String city) {
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getFineCounter() {
        return fineCounter;
    }

    public void setFineCounter(Integer fineCounter) {
        this.fineCounter = fineCounter;
    }

    public HashSet<Fine> getFines() {
        return fines;
    }
}
