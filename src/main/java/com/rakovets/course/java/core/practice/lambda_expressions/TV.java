package com.rakovets.course.java.core.practice.lambda_expressions;

public class TV {
    private String manufacturer;
    private String model;
    private int productionYear;
    private double diagonal;
    private double cost;

    public TV(String manufacturer, String model, int productionYear, double diagonal, double cost) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.productionYear = productionYear;
        this.diagonal = diagonal;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "TV{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", diagonal=" + diagonal +
                ", cost=" + cost +
                '}';
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

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
