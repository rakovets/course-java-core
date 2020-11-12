package com.rakovets.course.javabasics.garage;

public abstract class Car {
    private String brand;
    private String model;
    private String color;
    private int yearManufacture;
    private int registrationNumber;

    public Car(String brand, String model, String color, int yearManufacture, int registrationNumber) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearManufacture = yearManufacture;
        this.registrationNumber = registrationNumber;
    }

    @Override

    public String toString() {
        return  brand
                + ", Model " + model
                + ", Color " + color
                + ", Manufacture Date " + yearManufacture
                + ", RegNumber " + registrationNumber + "\n";
    }

    public String getModelName() {
        return getBrand() + " " + getModel();
    }

    @Override
    public int hashCode() {
        return brand.hashCode()
                + color.hashCode()
                + model.hashCode()
                + yearManufacture
                + registrationNumber
                + super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (obj instanceof Car) {
            Car c = (Car) obj;
            return (this.registrationNumber == c.registrationNumber);
        }
        return false;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYearManufacture() {
        return yearManufacture;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

}
