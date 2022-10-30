package com.rakovets.course.java.core.practice.lambda_expressions.project_tv;

public class Television {
    private String producerCompany;
    private String modelName;
    private int yearOfProduction;
    private int diagonalSize;
    private double price;
    Television(String producerCompany, String modelName, int yearOfProduction, int diagonalSize, double price) {
        this.producerCompany = producerCompany;
        this.modelName = modelName;
        this.yearOfProduction = yearOfProduction;
        this.diagonalSize = diagonalSize;
        this.price = price;
    }
    @Override
    public String toString() {
        return this.producerCompany + "\t\t" + this.modelName + "\t\t" + this.yearOfProduction + "\t\t" + this.diagonalSize + "\t\t"+  this.price;
    }

    public String getProducerCompany() {
        return producerCompany;
    }

    public String getModelName() {
        return modelName;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public int getDiagonalSize() {
        return diagonalSize;
    }

    public double getPrice() {
        return price;
    }
}
