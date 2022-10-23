package com.rakovets.course.java.core.practice.jcf_list;

import java.util.List;
import java.util.Set;

public class Person {
    private final String fullName;
    private final City city;
    private final Set<FineType> fineType;

    private final int id;

    public Person(String fullName, City city, Set<FineType> fineType, int id){
        this.fullName = fullName;
        this.city = city;
        this.fineType = fineType;
        this.id = id;
    }

    public void addFineType(FineType newFine) {
        fineType.add(newFine);
    }

    public void deleteFineType(FineType oldFine) {
        getFineType().remove(oldFine);
    }

    public Set<FineType> getFineType() {
        return fineType;
    }

    public String getFullName() {
        return fullName;
    }

    public City getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Name: " + fullName + ", City: " + city + ", Fine type: " + fineType;
    }

    public int getId() {
        return id;
    }
}
