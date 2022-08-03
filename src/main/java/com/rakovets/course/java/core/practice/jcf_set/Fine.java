package com.rakovets.course.java.core.practice.jcf_set;

public class Fine implements Comparable<Fine> {
    private final int fineId;
    private final int personId;

    private double articleNumber;
    private String reason;
    private double fineAmount;

    public Fine(double articleNumber, String reason, double fineAmount, int personId, int fineId) {
        this.articleNumber = articleNumber;
        this.reason = reason;
        this.fineAmount = fineAmount;
        this.personId = personId;
        this.fineId = fineId;
    }

    public double getArticle() {
        return articleNumber;
    }

    public String getReason() {
        return reason;
    }

    public double getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(double fineAmount) {
        this.fineAmount = fineAmount;
    }

    public int getPersonId() {
        return personId;
    }

    public int getFineId() {
        return fineId;
    }

    @Override
    public int compareTo(Fine o) {
        return fineId - o.getFineId();
    }

    @Override
    public String toString() {
        return '\n' + "Fine{" +
                "Number = " + articleNumber +
                ", reason = '" + reason + '\'' +
                ", amount = " + fineAmount +
                ", Person Id = " + personId +
                ", Fine Id = " + fineId +
                '}';
    }
}
