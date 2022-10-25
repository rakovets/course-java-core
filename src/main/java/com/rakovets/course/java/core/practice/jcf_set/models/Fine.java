package com.rakovets.course.java.core.practice.jcf_set.models;

import com.rakovets.course.java.core.practice.jcf_set.enums.FineType;

import java.util.Objects;

public class Fine {
    private String protocolId;
    private FineType fineType;

    public Fine(String protocolId, FineType fineType) {
        this.protocolId = protocolId;
        this.fineType = fineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fine f = (Fine) o;
        return Objects.equals(protocolId, f.protocolId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protocolId);
    }

    @Override
    public String toString() {
        return "\nПротокол №" + protocolId + ", сумма штрафа: " + fineType.getAmount() + " рублей";
    }

    public String getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(String protocolId) {
        this.protocolId = protocolId;
    }

    public FineType getFineType() {
        return fineType;
    }

    public void setFineType(FineType fineType) {
        this.fineType = fineType;
    }
}
