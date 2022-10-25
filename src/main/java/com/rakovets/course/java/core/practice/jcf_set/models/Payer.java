package com.rakovets.course.java.core.practice.jcf_set.models;

import com.rakovets.course.java.core.practice.jcf_set.enums.CityName;

import java.util.Objects;
import java.util.Set;

public class Payer {
    private String payerId;
    private String name_Surname;
    private CityName cityName;
    private Set<Fine> fines;

    public Payer(String payerId,String name_Surname, CityName cityName, Set<Fine> fines) {
        this.payerId = payerId;
        this.name_Surname = name_Surname;
        this.cityName = cityName;
        this.fines = fines;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payer payer = (Payer) o;
        return Objects.equals(payerId, payer.payerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payerId);
    }

    @Override
    public String toString() {
        return "\nПлательщик: " + name_Surname +", инд. код: " + payerId + ", город, (регион): " + cityName.getCityName() + ", штрафы:" + fines + "\n";
    }

    public String getPayerId() {
        return payerId;
    }

    public void setPayerId(String payerId) {
        this.payerId = payerId;
    }

    public String getName_Surname() {
        return name_Surname;
    }

    public void setName_Surname(String name_Surname) {
        this.name_Surname = name_Surname;
    }

    public CityName getCityName() {
        return cityName;
    }

    public void setCityName(CityName cityName) {
        this.cityName = cityName;
    }

    public Set<Fine> getFines() {
        return fines;
    }

    public void setFines(Set<Fine> fines) {
        this.fines = fines;
    }
}
