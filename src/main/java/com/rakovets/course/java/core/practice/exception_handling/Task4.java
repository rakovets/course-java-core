package com.rakovets.course.java.core.practice.exception_handling;

class CarIsNotReadyException extends Exception {

    public CarIsNotReadyException(String message) {
        super(message);
    }
}

class Car {
    String name;
    boolean isWheelsChecked;
    boolean isGasolineChecked;
    boolean isMirrorsChecked;

    public Car(String name) {
        this.name = name;
    }

    public void checkWheels() {

        System.out.println("Wheels checked!");
        this.isWheelsChecked = true;
    }

    public void checkGasoline() {

        System.out.println("Gasoline checked!");
        this.isGasolineChecked = true;
    }

    public void checkMirrors() {
        System.out.println("Mirrors checked!");
        this.isMirrorsChecked = true;
    }

    public void drive() throws CarIsNotReadyException {

        System.out.println("Going for a ride!");
        if (isMirrorsChecked && isGasolineChecked && isWheelsChecked) {
            System.out.println("Ready for the ride");
        } else {
            throw new CarIsNotReadyException("Car " + name + " not ready for the ride! Check your car");
        }
    }

    public static void main(String[] args) {

        Car car = new Car("Mazda");
        car.checkGasoline();
        car.checkMirrors();
        car.checkWheels();
    }
}



