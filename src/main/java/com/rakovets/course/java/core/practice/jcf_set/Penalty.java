package com.rakovets.course.java.core.practice.jcf_set;

import java.util.Objects;

public class Penalty {
    private final String typePenalty;
    private final String city;

    public Penalty(String typePenalty, String city) {
        this.typePenalty = typePenalty;
        this.city = city;
    }

    public String getTypePenalty() {
        return typePenalty;
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Penalty penalty = (Penalty) o;
        return Objects.equals(typePenalty, penalty.typePenalty) && Objects.equals(city, penalty.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typePenalty, city);
    }

    @Override
    public String toString() {
        return "Penalty{" +
                "typePenalty='" + typePenalty + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
