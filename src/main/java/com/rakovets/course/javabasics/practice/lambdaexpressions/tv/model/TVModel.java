package com.rakovets.course.javabasics.practice.lambdaexpressions.tv.model;

public class TVModel {
    private String manufacturer;
    private String model;
    private int year;
    private int diagonal;
    private int price;

    public TVModel(String manufacturer, String model, int year, int diagonal, int price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.diagonal = diagonal;
        this.price = price;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }


}
