package com.rakovets.java.task.collections.list.garage;

import java.util.HashMap;
import java.util.Map;

public class Garage {
    Map<Car, Integer> carsInGarage = new HashMap<>();

    public Map<Car, Integer> park(Car car) {
        if (carsInGarage.containsKey(car)) {
            int countOfCarInGarage = carsInGarage.get(car);
            carsInGarage.put(car, countOfCarInGarage + 1);
        } else {
            carsInGarage.put(car, 1);
        }
        return carsInGarage;
    }

    public Map<Car, Integer> leave(Car car) {
        if (carsInGarage.containsKey(car)) {
            int countOfCarInGarage = carsInGarage.get(car);
            if (countOfCarInGarage <= 0) {
                System.out.println("This car is absent: " + car.toString());
            } else {
                carsInGarage.put(car, countOfCarInGarage - 1);
            }
        } else {
            System.out.println("This car is absent.");
        }
        return carsInGarage;
    }

    public void printGarage() {
        for (Map.Entry<Car, Integer> car : carsInGarage.entrySet()) {
            System.out.println(car);
        }
    }

    public int getCountByBrand(String brand) {
        for (Map.Entry<Car, Integer> car : carsInGarage.entrySet()) {
            if (car.getKey().getBrand().equals(brand)) {
                return car.getValue();
            }
        }
        return 0;
    }

    public int getCountByModel(String model) {
        for (Map.Entry<Car, Integer> car : carsInGarage.entrySet()) {
            if (car.getKey().getModel().equals(model)) {
                return car.getValue();
            }
        }
        return 0;
    }

    public int getCountBuBrandAndModel(String brand, String model) {
        for (Map.Entry<Car, Integer> car : carsInGarage.entrySet()) {
            if (car.getKey().getBrand().equals(brand) && car.getKey().getModel().equals(model)) {
                return car.getValue();
            }
        }
        return 0;
    }
}
