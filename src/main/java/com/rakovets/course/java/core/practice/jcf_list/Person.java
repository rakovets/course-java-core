package com.rakovets.course.java.core.practice.jcf_list;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Person {
    private final String fullName;
    private final City city;
    private final List<FineType> fineType;

    private final int id;

    public Person(String fullName, City city, List<FineType> fineType, int id){
        this.fullName = fullName;
        this.city = city;
        this.fineType = fineType;
        this.id = id;
    }

    public void addFineType(FineType newFine, LinkedHashSet<Person> taxPayer) {
        for (Person pers : taxPayer) {
            if (pers.getId() == id) {
                fineType.add(newFine);
            }
        }
    }

    public void deleteFineType(FineType oldFine, Set<Person> allPayers) {
        for (Person taxPayer : allPayers) {
            if (taxPayer.getFineType() != null) {
                for (FineType fine : taxPayer.getFineType()) {
                    if (fine == (oldFine)) {
                        taxPayer.getFineType().remove(oldFine);
                    }
                }
            }
        }
    }

    public List<FineType> getFineType() {
        return fineType;
    }

    public String getFullName() {
        return fullName;
    }

    public City getCity() {
        return city;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", name: " + fullName + ", City: " + city + ", Fine type: " + fineType;
    }
}
