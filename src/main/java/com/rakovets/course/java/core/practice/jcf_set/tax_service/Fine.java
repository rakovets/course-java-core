package com.rakovets.course.java.core.practice.jcf_set.tax_service;

public class Fine {
    private final String fineName;
    private final String sum;

    public Fine(String fineName, String sum) {
        this.fineName = fineName;
        this.sum = sum;
    }

    public String getFineName() {
        return fineName;
    }

    public String getSum() {
        return sum;
    }
}
