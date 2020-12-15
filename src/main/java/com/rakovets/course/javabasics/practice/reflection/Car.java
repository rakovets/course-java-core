package com.rakovets.course.javabasics.practice.reflection;

public class Car {
    private String brand;
    private String model;
    private int yearofissue;

    public Car(String brand, String model, int yearofissue) {
        this.brand = brand;
        this.model = model;
        this.yearofissue = yearofissue;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearofissue() {
        return yearofissue;
    }

    public void setYearofissue(int yearofissue) {
        this.yearofissue = yearofissue;
    }
}
