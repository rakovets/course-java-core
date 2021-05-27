package com.rakovets.course.java.core.practice.reflection.model;

public class Car {
    public String brand;
    public String model;

    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public void rideAhead(int meters){
        System.out.println("Rolled " + meters + " meters ahead");
    }

    public void rideBack(String meters){
        System.out.println("Rolled " + meters + " ahead" );
    }

    public String getBrand() {
        return brand;
    }
}
