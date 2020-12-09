package com.rakovets.course.javabasics.practice.lambdaexpressions.streams;

import java.util.Objects;

public class TV {
    private String nameProducer;
    private String nameModel;
    private int year;
    private int diagonal;
    private int cost;

    public TV(String nameProducer, String nameModel, int year, int diagonal, int cost) {
        this.nameProducer = nameProducer;
        this.nameModel = nameModel;
        this.year = year;
        this.diagonal = diagonal;
        this.cost = cost;
    }

    public String getNameProducer() {
        return nameProducer;
    }

    public void setNameProducer(String nameProducer) {
        this.nameProducer = nameProducer;
    }

    public String getNameModel() {
        return nameModel;
    }

    public void setNameModel(String nameModel) {
        this.nameModel = nameModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TV)) return false;
        TV tv = (TV) o;
        return year == tv.year &&
                diagonal == tv.diagonal &&
                cost == tv.cost &&
                Objects.equals(nameProducer, tv.nameProducer) &&
                Objects.equals(nameModel, tv.nameModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameProducer, nameModel, year, diagonal, cost);
    }

    @Override
    public String toString() {
        return "TV{" +
                "nameProducer='" + nameProducer + '\'' +
                ", nameModel='" + nameModel + '\'' +
                ", year=" + year +
                ", diagonal=" + diagonal +
                ", cost=" + cost +
                '}';
    }
}
