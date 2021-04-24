package com.rakovets.course.java.core.practice.jcf_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Garage {
    private final Map<String, List<Car>> garage = new HashMap<>();

    public void leave(Car car) {
        String key = car.getBrand() + car.getModel();
        if (garage.containsKey(key)) {
            List<Car> cars = garage.get(key);
            cars.remove(car);
            if (cars.isEmpty())
                garage.remove(key);
            else
                garage.put(key, cars);
        }
    }

    public void park(Car car) {
        String key = car.getBrand() + car.getModel();
        List<Car> cars = new ArrayList<>();
        if (garage.containsKey(key))
            cars = garage.get(key);
        cars.add(car);
        garage.put(key, cars);
    }

    public boolean isExist(String registrationNumber) {
        for (List<Car> cars : garage.values()) {
            for (Car car : cars) {
                if (car.getRegistrationNumber().equals(registrationNumber)) {
                    return true;
                }
            }

        }
        return false;
    }

    public int getCount(String brand, String model) {
        String key = brand + model;
        return garage.get(key).size();
    }

    public boolean isExist(String brand, String model, String registrationNumber) {
        for (List<Car> cars : garage.values()) {
            for (Car car : cars) {
                if (car.getRegistrationNumber().equals(registrationNumber)
                        && car.getBrand().equals(brand)
                        && car.getModel().equals(model)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Car getByRegistrationNumber(String registrationNumber) {
        for (List<Car> cars : garage.values()) {
            for (Car car : cars) {
                if (car.getRegistrationNumber().equals(registrationNumber)) {
                    return car;
                }
            }
        }
        return null;
    }
}
