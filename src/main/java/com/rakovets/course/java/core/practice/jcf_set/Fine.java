package com.rakovets.course.java.core.practice.jcf_set;

public class Fine {
    private int fineId;
    private int fineAmount;
    private String typeFine;
    private String city;

    public Fine(int fineId, int fineAmount, String typeFine, String city) {
        this.fineId = fineId;
        this.fineAmount = fineAmount;
        this.typeFine = typeFine;
        this.city = city;
    }

    public Fine(String typeFine) {
        this.typeFine = typeFine;
    }

    public int getFineId() {
        return fineId;
    }

    public int getFineAmount() {
        return fineAmount;
    }

    public String getTypeFine() {
        return typeFine;
    }

    public String getCity() {
        return city;
    }

    public void setFineAmount(int fineAmount) {
        this.fineAmount = fineAmount;
    }

    @Override
    public String toString() {
        return '\n' + "Fine{" +
                "Fine ID=" + fineId +
                ", City='" + city + '\'' +
                ", Type fine='" + typeFine + '\'' +
                ", Fine amount=" + fineAmount +
                '}';
    }
}
