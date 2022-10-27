package com.rakovets.course.java.core.practice.jcf_set.tax_service;

import java.util.LinkedHashSet;
import java.util.Set;

public class Taxpayer {
    private int codId;
    private Set<String> fines = new LinkedHashSet<>();
    private String city;

    public Taxpayer(int codId, String fine, String city) {
        this.codId = codId;
        this.fines.add(fine);
        this.city = city;
    }

    public int getCodId() {
        return codId;
    }

    public Set<String> getFines() {
        return this.fines;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "{Cod ID taxpayer: " + getCodId() +
                ", fines: " + getFines() +
                ", city: " + getCity() + "}";
    }
}
