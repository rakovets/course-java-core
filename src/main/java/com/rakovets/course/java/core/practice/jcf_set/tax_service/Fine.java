package com.rakovets.course.java.core.practice.jcf_set.tax_service;

public class Fine {
    private final String fineDetails;
    private final String sum;

    public Fine(String fineName, String sum) {
        this.fineDetails = fineName;
        this.sum = sum;
    }

    public String getFineName() {
        return fineDetails;
    }

    public String getSum() {
        return sum;
    }
}
