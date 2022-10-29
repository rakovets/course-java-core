package com.rakovets.course.java.core.practice.jcf_set;

import com.rakovets.course.java.core.practice.jcf_set.Enum.FineType;

import java.util.Objects;

public class Fine {
    private final FineType fineType;
    private final int fineId;

    public Fine(FineType fineType, int fineId) {
        this.fineType = fineType;
        this.fineId = fineId;
    }

    @Override
    public String toString() {
        return "Fine{" + "type: " + fineType + "id: " + fineId + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fine fine = (Fine) o;
        return fineId == fine.fineId && fineType == fine.fineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fineType, fineId);
    }

    public FineType getFineType() {
        return fineType;
    }
}
