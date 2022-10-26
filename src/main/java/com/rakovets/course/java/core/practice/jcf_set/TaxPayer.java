package com.rakovets.course.java.core.practice.jcf_set;

import java.util.Set;

public class TaxPayer {
    private String name;
    private String city;
    private int idTaxPayer;
    private Set<Fine> finesTaxPayer;

    public TaxPayer(String name, String city, int idTaxPayer, Set<Fine> finesTaxPayer) {
        this.name = name;
        this.city = city;
        this.idTaxPayer = idTaxPayer;
        this.finesTaxPayer = finesTaxPayer;
    }

    public void addNewFine(Fine fine) {

    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getIdTaxPayer() {
        return idTaxPayer;
    }

    public Set<Fine> getFinesTaxPayer() {
        return finesTaxPayer;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return '\n' + "TaxPayer{" +
                "Name='" + name + '\'' +
                ", City='" + city + '\'' +
                ", ID TaxPayer=" + idTaxPayer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaxPayer taxPayer = (TaxPayer) o;
        return idTaxPayer == taxPayer.idTaxPayer;
    }

    @Override
    public int hashCode() {
        return idTaxPayer;
    }
}
