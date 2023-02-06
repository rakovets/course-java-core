package com.rakovets.course.java.core.practice.jcf_set.tax_service;

public class Fine {
    private final int hashCode;
    private final Fines type;
    private final String fineDetails;
    private final Integer sum;

    public Fine(String fineName, Integer sum, Fines type) {
        this.fineDetails = fineName;
        this.sum = sum;
        this.type = type;
        this.hashCode = hashCode();
    }

    public int getHashCode() {
        return hashCode;
    }

    public Fines getType() {
        return type;
    }

    public String getFineDetails() {
        return fineDetails;
    }

    public String getFineName() {
        return fineDetails;
    }

    public Integer getSum() {
        return sum;
    }
}
