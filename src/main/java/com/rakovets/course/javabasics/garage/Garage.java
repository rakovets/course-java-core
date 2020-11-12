package com.rakovets.course.javabasics.garage;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


public class Garage {

    private Collection<Car> cars;
    private HashMap<String, Collection<Car>> carsMap = new HashMap<String, Collection<Car>>();

    public Garage(Collection<Car> cars) {
        this.cars = cars;
        fillCarsList();
    }

    public void park(Car car) {
        this.cars.add(car);
        addCarToMap(car);
    }

    public void leave(Car car) {
        removeCarFromMap(car);
        this.cars.remove(car);
    }

    public int getCount(String brand, String model) {
        String brandName = brand + " " + model;
        int result = 0;
        for (Car item : cars) {
            if (item.getModelName().equals(brandName)) {
                result++;
            }
        }
        return result;
    }

    public boolean isExist(int regNumber) {

        for (Car item : cars) {
            if (item.getRegistrationNumber() == regNumber) {
                return true;
            }
        }
        return false;
    }

    public boolean isExist(String brand, String model, int registrationNumber) {

        for (Car item : cars) {
            if (item.getRegistrationNumber() == registrationNumber && item.getBrand() == brand && item.getModel() == model) {
                return true;
            }
        }
        return false;
    }

    public Car getByRegistrationNumber(int registrationNumber) {
        for (Car item : cars) {
            if (item.getRegistrationNumber() == registrationNumber) {
                return item;
            }
        }
        return null;
    }


    private void addCarToMap(Car car) {

        if (carsMap.containsKey(car.getModelName())) {
            carsMap.get(car.getModelName()).add(car);
        } else {
            LinkedList<Car> temp = new LinkedList<>();
            temp.add(car);
            carsMap.put(car.getModelName(), temp);
        }
    }

    private void removeCarFromMap(Car car) {

        String name = car.getModelName();
        if (carsMap.containsKey(name)) {
            carsMap.get(name).remove(car);
            if (carsMap.get(name).isEmpty()) {
                carsMap.remove(name);
            }
        }
    }

    public void fillCarsList() {

        for (Car items : cars) {
            addCarToMap(items);
        }
    }

}
