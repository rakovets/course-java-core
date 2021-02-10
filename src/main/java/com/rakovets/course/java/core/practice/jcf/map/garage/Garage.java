package com.rakovets.course.java.core.practice.jcf.map.garage;

import java.util.*;

public class Garage {
    private final Map<String, List<Car>>  garage = new HashMap<>();

    public void park(Car car) {
        if (!isExist(car.getBrand(),car.getModel(), car.getRegistrationNumber())) {
            List<Car> parking = new ArrayList<>();
            if (garage.get(car.getBrand() + car.getModel()) != null) {
                parking = garage.get(car.getBrand() + car.getModel());
            }
            parking.add(car);
            garage.put(car.getBrand() + car.getModel(), parking);
        }
    }

    public void leave(Car car) {
        List<Car> parking = new ArrayList<>();
        if (garage.get(car.getBrand() + car.getModel()) != null) {
            parking = garage.get(car.getBrand() + car.getModel());
        }
        parking.remove(car);

        if (parking.isEmpty()) {
            garage.remove(car.getBrand() + car.getModel());
        } else {
            garage.put(car.getBrand() + car.getModel(), parking);
        }
    }

    public int getCount(String brand, String model) {
        if (garage.get(brand + model) == null) {
            return 0;
        } else {
            List<Car> parking = garage.get(brand + model);
            return parking.size();
        }
    }

    public boolean isExist(int registrationNumber) {
        Collection<List<Car>> allCars = garage.values();
        for (List<Car> cars : allCars) {
            for (Car car : cars) {
                if (car.getRegistrationNumber() == registrationNumber) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isExist(String brand, String model, int registrationNumber) {
        if (garage.get(brand + model) == null) {
            return false;
        } else {
            List<Car> parking = garage.get(brand + model);
            for (Car car : parking) {
                if (car.getRegistrationNumber() == registrationNumber) {
                    return true;
                }
            }
        }
        return false;
    }

    public Car getByRegistrationNumber(int registrationNumber) throws CarNotExistException {
        if (isExist(registrationNumber)) {
            Collection<List<Car>> allCars = garage.values();
            for (List<Car> cars : allCars) {
                for (Car car : cars) {
                    if (car.getRegistrationNumber() == registrationNumber) {
                        return car;
                    }
                }
            }
        }
        throw new CarNotExistException ("there isn't car with this registration number in the garage");
    }

    @Override
    public String toString() {
        return "Garage: " + garage;
    }

    public Map<String, List<Car>> getGarage() {
        return garage;
    }
}
