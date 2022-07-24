package com.rakovets.course.java.core.practice.jcf_set;

public class Fine implements Comparable<Fine> {
    private double articleNumber;
    private String description;
    private double fineAmount;
    private boolean isPaid;
    private final int citizenId;
    private final int fineId;

    public Fine(double articleNumber, String description, double fineAmount, boolean isPaid, int citizenId, int fineId) {
        this.articleNumber = articleNumber;
        this.description = description;
        this.fineAmount = fineAmount;
        this.isPaid = isPaid;
        this.citizenId = citizenId;
        this.fineId = fineId;
    }

    public double getArticle() {
        return articleNumber;
    }

    public String getDescription() {
        return description;
    }

    public double getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(double fineAmount) {
        this.fineAmount = fineAmount;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setIsPaid(boolean paid) {
        isPaid = paid;
    }

    public int getCitizenId() {
        return citizenId;
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
                "articleNumber=" + articleNumber +
                ", description='" + description + '\'' +
                ", fineAmount=" + fineAmount +
                ", isPaid=" + isPaid +
                ", citizenId=" + citizenId +
                ", fineId=" + fineId +
                '}';
    }
}
