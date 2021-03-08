package com.rakovets.course.java.core.practice.reflection;

public class Bike {
    private final String brand;
    private final String model;
    private final int engineVolume;

    public Bike(String brand, String model, int engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    private String getBikeCountry() {
        switch (brand) {
            case "Kawasaki":
            case "Suzuki":
                return "Japan";
            case "Ducati":
            case "Aprilia":
                return "Italy";
            case "Minsk":
            case "IZH":
                return "USSR";
        }
        return "";
    }

    private String getNumberPlate(String numberPlate) {
        return String.format("%s %s %d %s", brand, model, engineVolume, numberPlate);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
