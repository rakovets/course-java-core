package com.rakovets.course.java.core.practice.jcf_set;

public class Fine {
    private String uniqueNumber;
    private Fines typeOfFine;

    public Fine(Fines typeOfFine) {
        this.typeOfFine = typeOfFine;
    }

    public Integer getSumFine() {
        return typeOfFine.getSum();
    }

    public void setTypeOfFine(Fines typeOfFine) {
        this.typeOfFine = typeOfFine;
    }

    public String getUniqueNumber() {
        return uniqueNumber;
    }

    public void setUniqueNumber(String uniqueNumber) {
        this.uniqueNumber = uniqueNumber;
    }

    public Fines getTypeOfFine() {
        return typeOfFine;
    }

}
