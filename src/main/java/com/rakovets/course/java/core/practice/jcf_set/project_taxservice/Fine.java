package com.rakovets.course.java.core.practice.jcf_set.project_taxservice;

public class Fine {
    private FineTypes fineType;
    private final int fineId;

    public Fine(FineTypes fineType, int fineId) {
        this.fineType = fineType;
        this.fineId = fineId;
    }

    public FineTypes getFineType() {
        return fineType;
    }

    public void setFineType(FineTypes fineType) {
        this.fineType = fineType;
    }

    public int getFineId() {
        return fineId;
    }

    @Override
    public String toString() {
        return "Fine{" +
                "fineType=" + fineType +
                ", fineId=" + fineId +
                '}';
    }
}
