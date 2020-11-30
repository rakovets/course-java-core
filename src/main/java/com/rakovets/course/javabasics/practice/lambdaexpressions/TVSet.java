package com.rakovets.course.javabasics.practice.lambdaexpressions;

public class TVSet {
    private String manufacturer;
    private String model;
    private String yearOfManufacture;
    private int diagonal;
    private int price;
    public TVSet(String manufacturer, String model, String yearOfManufacture, int diagonal, int price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.diagonal = diagonal;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(String yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return manufacturer + " " + model + " " + yearOfManufacture +" diagonal " + diagonal + " price " + price + " BYN";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        TVSet tvSet = (TVSet) obj;
        return this.manufacturer.equals(tvSet.manufacturer) && this.model.equals(tvSet.model) && this.yearOfManufacture.equals(tvSet.yearOfManufacture)
                && this.diagonal == tvSet.diagonal && this.price == tvSet.price;
    }
}
