package com.rakovets.course.java.core.practice.jcf_set;

import java.util.Objects;

public class Fine {
    private int amountTheFine;
    private String nameFine;
    private int idFine;

    public Fine(int amountTheFine, String nameFine, int idFine) {
        this.amountTheFine = amountTheFine;
        this.nameFine = nameFine;
        this.idFine = idFine;
    }

    public int getAmountTheFine() {
        return amountTheFine;
    }

    public String getNameFine() {
        return nameFine;
    }

    public int getIdFine() {
        return idFine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Fine fine = (Fine) o;
        return amountTheFine == fine.amountTheFine && nameFine.equals(fine.nameFine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountTheFine, nameFine);
    }

    @Override
    public String toString() {
        return "Fine{" +
                "amountTheFine=" + amountTheFine +
                ", nameFine='" + nameFine + '\'' +
                '}';
    }
}
