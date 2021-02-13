package com.rakovets.course.java.core.practice.jcf.map.project_garage;

import java.util.*;

public class Garage {
    private final HashMap<String, List<Car>> garageMap = new HashMap<>();

    public HashMap<String, List<Car>> park(Car car) {
        List<Car> parkList = new ArrayList<>();
        if (garageMap.get(car.getBrand() + car.getModel()) != null) {
            parkList = garageMap.get(car.getBrand() + car.getModel());
        }
        parkList.add(car);
        garageMap.put(car.getBrand() + car.getModel(), parkList);
        return garageMap;
    }

    public HashMap<String, List<Car>> leave(Car car) {
        List<Car> parkList;
        try {
            parkList = garageMap.get(car.getBrand() + car.getModel());
            parkList.remove(car);
            return garageMap;
        } catch (NullPointerException ex) {
            throw new NoSuchCarException("No such car in garage");
        }
    }

    public int getCount(String brand, String model) {
        try {
            List<Car> garageList = garageMap.get(brand + model);
            return garageList.size();
        } catch (NullPointerException ex) {
            throw new NoSuchCarException("No such car in garage");
        }
    }

    public boolean isExist(String registrationNumber) {
        for (Map.Entry<String, List<Car>> entry : garageMap.entrySet()) {
            for (Car car : entry.getValue()) {
                if (car.getRegistrationNumber().equals(registrationNumber)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isExist(String brand, String model, String registrationNumber) {
        for (Map.Entry<String, List<Car>> entry : garageMap.entrySet()) {
            for (Car car : entry.getValue()) {
                if (car.getBrand().equals(brand)) {
                    if (car.getModel().equals(model)) {
                        return car.getRegistrationNumber().equals(registrationNumber);
                    }
                }
            }
        }
        return false;
    }

    public Car getByRegistrationNumber(String registrationNumber) {
        for (Map.Entry<String, List<Car>> entry : garageMap.entrySet()) {
            for (Car car : entry.getValue()) {
                if (car.getRegistrationNumber().equals(registrationNumber)) {
                    return car;
                }
            }
        }
        return null;
    }

    public HashMap<String, List<Car>> getGarageMap() {
        return garageMap;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "garageMap=" + garageMap +
                '}';
    }
}
