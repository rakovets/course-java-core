package com.rakovets.course.java.core.practice.jcf_set;

import java.util.Set;

public class Taxpayer {
    private int id;
    private City city;
    private Set<Fine> fineSet;

    public Taxpayer(int id, City city, Set<Fine> fineSet) {
        this.id = id;
        this.city = city;
        this.fineSet = fineSet;
    }

    public void addToFineSet(Fine fine) {
        fineSet.add(fine);
    }

    public int getId() {
        return id;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Set<Fine> getFineSet() {
        return fineSet;
    }

    public void setFineSet(Set<Fine> fineSet) {
        this.fineSet = fineSet;
    }

    @Override
    public String toString() {
        return "Taxpayer{" +
                "id='" + id + '\'' +
                ", city=" + city +
                '}';
    }
}
