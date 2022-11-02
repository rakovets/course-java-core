package com.rakovets.course.java.core.practice.jcf_set;

import java.util.List;
import java.util.Objects;

public class Person {
    private final String fullName;
    private City city;
    private final List<FineType> fineType;
    private final int id;

    public Person(String fullName, City city, List<FineType> fineType, int id) {
        this.fullName = fullName;
        this.city = city;
        this.fineType = fineType;
        this.id = id;
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

    public void setCity(City city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", name: " + fullName + ", City: " + city + ", Fine type: " + fineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
