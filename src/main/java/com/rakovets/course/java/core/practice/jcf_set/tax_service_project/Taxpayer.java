package com.rakovets.course.java.core.practice.jcf_set.tax_service_project;

import java.util.HashSet;

public class Taxpayer {
    private int identificationNumber;
    private String city;
    private int fineCounter;
    private HashSet<String> finesType;

    public Taxpayer(int identificationNumber, int fineCounter, HashSet<String> fines) {
        this.identificationNumber = identificationNumber;
        this.fineCounter = fineCounter;
        this.finesType = fines;
    }

    @Override
    public String toString() {
        return String.format("Taxpayer info:\nIdentification number: %s\nCity: %s\nFines: %s\nFines type: %s",
                identificationNumber, city, fineCounter, finesType);
    }

    public int getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(int identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getFineCounter() {
        return fineCounter;
    }

    public void setFineCounter(int fineCounter) {
        this.fineCounter = fineCounter;
    }

    public HashSet<String> getFinesType() {
        return finesType;
    }

    public void setFinesType(HashSet<String> finesType) {
        this.finesType = finesType;
    }
}
