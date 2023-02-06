package com.rakovets.course.java.core.practice.jcf_set.tax_service;

public class Fine {
    private final String fineName;
    private final String sum;
    private final String date;

    public Fine(String fineName, String sum, String date) {
        this.fineName = fineName;
        this.sum = sum;
        this.date = date;
    }

    public String getFineName() {
        return fineName;
    }

    public String getSum() {
        return sum;
    }

    public String getDate() {
        return date;
    }
}
