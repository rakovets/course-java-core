package com.rakovets.course.java.core.practice.jcf_set.tax_service;

public class Fine {
    private final String fineName;
    private final String sum;
    private final Integer id;

    public Fine(String fineName, String sum, Integer id) {
        this.fineName = fineName;
        this.sum = sum;
        this.id = id;
    }

    public String getFineName() {
        return fineName;
    }

    public String getSum() {
        return sum;
    }

    public Integer getId() {
        return id;
    }
}
