package com.rakovets.course.java.core.practice.exception_handling.Task04;

import java.util.ArrayList;

class CarNotAvailable {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Volvo");
        arrayList.add("BMW");
        arrayList.add("Ford");
        arrayList.add("Porsche");

        String car = "Mazda";

        if (!arrayList.contains(car))
            try {
                throw new CarNotAvailableException(car);
            } catch (CarNotAvailableException e) {
                e.printStackTrace();
        }
        else System.out.println(car);
    }
}

class CarNotAvailableException extends RuntimeException {
    private String car;

    public CarNotAvailableException(String car) {
        this.car = car;
    }

    public String toString() {
        return "Car " + car + " is not available";
    }
}
