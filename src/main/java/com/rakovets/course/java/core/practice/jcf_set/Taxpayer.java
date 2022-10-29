package com.rakovets.course.java.core.practice.jcf_set;

import com.rakovets.course.java.core.practice.jcf_set.Enum.City;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Taxpayer {
    private final String fullName;
    private int id;
    private final HashSet<Fine> fineSet;
    private City city;

    public Taxpayer(String fullName, int id, HashSet<Fine> fineSet, City city) {
        this.fullName = fullName;
        this.id = id;
        this.fineSet = fineSet;
        this.city = city;
    }

    public void addFine(Fine fine, HashSet<Taxpayer>taxpayerDataBase) {
        for (Taxpayer taxpayer : taxpayerDataBase) {
            if (taxpayer.getId() == id) {
                taxpayer.getFine().add(fine);
            }
        }
    }

    public void updateTaxPayerInf(HashSet<Taxpayer> taxpayerDataBase, City city, int id) {
        for (Taxpayer taxpayer : taxpayerDataBase) {
            if (taxpayer.getId() == id) {
                taxpayer.setCity(city);
            }
        }
    }

    public void updateTaxPayerFine(HashSet<Taxpayer> taxpayerDataBase, Fine fine, int id) {
        for (Taxpayer taxpayer : taxpayerDataBase) {
            if (taxpayer.getId() == id) {
                taxpayer.getFine().add(fine);
            }
        }
    }

    public void removeFine(Fine fine, HashSet<Taxpayer>taxpayerDataBase) {
        for (Taxpayer taxpayer : taxpayerDataBase) {
            if (taxpayer.getId() == id) {
                taxpayer.getFine().remove(fine);
            }
        }
    }

    @Override
    public String toString() {
        return "Taxpayer{" + "full name: " + fullName
                + "/ " + "city: " + city + "/ "
                + "id: " + id + "/ "
                + "fine(s): " + fineSet + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Taxpayer taxpayer = (Taxpayer) o;
        return id == taxpayer.id && Objects.equals(fullName, taxpayer.fullName) && Objects.equals(fineSet, taxpayer.fineSet) && city == taxpayer.city;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, id, fineSet, city);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Fine> getFine() {
        return fineSet;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
