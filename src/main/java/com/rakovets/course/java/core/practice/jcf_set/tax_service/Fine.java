package com.rakovets.course.java.core.practice.jcf_set.tax_service;

public class Fine {
    private final int hashCode;
    private final String fineDetails;
    private final Integer sum;

    public Fine(String fineName, Integer sum) {
        this.fineDetails = fineName;
        this.sum = sum;
        this.hashCode = hashCode();
    }

    public int getHashCode() {
        return hashCode;
    }

    public String getFineName() {
        return fineDetails;
    }

    public Integer getSum() {
        return sum;
    }
}
