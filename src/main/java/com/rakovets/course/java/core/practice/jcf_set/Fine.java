package com.rakovets.course.java.core.practice.jcf_set;

import com.rakovets.course.java.core.practice.jcf_set.enum_set.FineTypeEnum;

import java.util.Objects;

public class Fine {
    private int idFine;
    private FineTypeEnum typeFine;
    private double sumFine;

    public int getIdFine() {
        return idFine;
    }

    public Fine(int idFine, FineTypeEnum typeFine, double sumFine) {
        this.idFine = idFine;
        this.typeFine = typeFine;
        this.sumFine = sumFine;
    }

    @Override
    public String toString() {
        return "Fine{" +
                "idFine=" + idFine +
                ", typeFine=" + typeFine +
                ", sumFine=" + sumFine +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fine fine = (Fine) o;
        return idFine == fine.idFine;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFine);
    }

    public void setIdFine(int idFine) {
        this.idFine = idFine;
    }

    public FineTypeEnum getTypeFine() {
        return typeFine;
    }

    public void setTypeFine(FineTypeEnum typeFine) {
        this.typeFine = typeFine;
    }

    public double getSumFine() {
        return sumFine;
    }

    public void setSumFine(double sumFine) {
        this.sumFine = sumFine;
    }
}
