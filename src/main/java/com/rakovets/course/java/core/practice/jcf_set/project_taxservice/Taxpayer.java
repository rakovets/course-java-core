package com.rakovets.course.java.core.practice.jcf_set.project_taxservice;

import java.util.Set;

public class Taxpayer {
    private final int IDENTIFICATION_CODE;
    private TaxpayerCity city;
    private Set<Fine> listFines;

    public Taxpayer(int IDENTIFICATION_CODE, TaxpayerCity city, Set<Fine> listFines) {
        this.IDENTIFICATION_CODE = IDENTIFICATION_CODE;
        this.city = city;
        this.listFines = listFines;
    }

    public void addTaxpayerFine(Fine fine) {
        this.listFines.add(fine);
    }

    @Override
    public String toString() {
        return "Taxpayer{" +
                "IDENTIFICATION_CODE=" + IDENTIFICATION_CODE +
                ", city=" + city +
                ", listFines=" + listFines +
                '}';
    }

    public int getIDENTIFICATION_CODE() {
        return IDENTIFICATION_CODE;
    }

    public Set<Fine> getListFines() {
        return listFines;
    }

    public void setListFines(Set<Fine> listFines) {
        this.listFines = listFines;
    }

    public TaxpayerCity getCity() {
        return city;
    }

    public void setCity(TaxpayerCity city) {
        this.city = city;
    }
}
