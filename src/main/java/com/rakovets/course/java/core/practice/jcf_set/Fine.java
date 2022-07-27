package com.rakovets.course.java.core.practice.jcf_set;

public class Fine implements Comparable<Fine>{
    private final int fineId;
    private String fineType;
    private final int relatedPersonId;
    private boolean isPaid;

    public Fine(int fineId, String fineType, int relatedPersonId, boolean isPaid) {
        this.fineId = fineId;
        this.fineType = fineType;
        this.relatedPersonId = relatedPersonId;
        this.isPaid = isPaid;
    }

    public String getFineType() {
        return fineType;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public int getRelatedPersonId() {
        return relatedPersonId;
    }

    public int getFineId() {
        return fineId;
    }

    public void setFineType(String fineType) {
        this.fineType = fineType;
    }

    public void setIsPaid(boolean paid) {
        isPaid = paid;
    }

    @Override
    public String toString() {
        return "Fine{" +
                "fineId=" + fineId +
                ", fineType='" + fineType + '\'' +
                ", relatedPersonId=" + relatedPersonId +
                ", isPaid=" + isPaid +
                '}';
    }

    @Override
    public int compareTo(Fine o) {
        return fineId - o.getFineId();
    }
}
