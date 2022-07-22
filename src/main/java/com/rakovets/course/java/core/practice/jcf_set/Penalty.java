package com.rakovets.course.java.core.practice.jcf_set;

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
    public String toString() {
        return "Penalty{" +
                "typePenalty='" + typePenalty + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
