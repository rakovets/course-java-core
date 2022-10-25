package com.rakovets.course.java.core.practice.jcf_set;

import java.util.Set;

public class Taxman {
    private int id;
    private int tax;
    private Set<TypeOfTax> typeOfTax;

    public Taxman(int id, int tax, Set<TypeOfTax> typeOfTax) {
        this.id = id;
        this.tax = tax;
        this.typeOfTax = typeOfTax;
    }

    public void newTypeOfTax(TypeOfTax typeOfTax1) {
        typeOfTax.add(typeOfTax1);
    }

    @Override
    public String toString() {
        return id + "\n" + tax + "\n" + typeOfTax;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public Set<TypeOfTax> getTypeOfTax() {
        return typeOfTax;
    }

    public void setTypeOfTax(Set<TypeOfTax> typeOfTax) {
        this.typeOfTax = typeOfTax;
    }
}
