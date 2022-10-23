package com.rakovets.course.java.core.practice.jcf_set;

public class Fine {
    private FineTypes type;
    private int fineNumber;

    public Fine(FineTypes type, int fineNumber) {
        this.type = type;
        this.fineNumber = fineNumber;
    }

    public FineTypes getType() {
        return type;
    }

    public void setType(FineTypes type) {
        this.type = type;
    }

    public int getFineNumber() {
        return fineNumber;
    }

    public void setFineNumber(int fineNumber) {
        this.fineNumber = fineNumber;
    }

    @Override
    public String toString() {
        return "Fine{" +
                "Type='" + type + '\'' +
                ", number=" + fineNumber +
                '}';
    }
}
