package com.rakovets.course.java.core.practice.jcf_map.garage;

import java.util.*;

public class Garage {
    Map<String, Integer> machine = new LinkedHashMap<>();
    List<String> listRegistrationNumber = new ArrayList<>();

    public Garage(Map<String, Integer> machine, List<String> listRegistrationNumber) {
        this.machine = machine;
        this.listRegistrationNumber = listRegistrationNumber;
    }

    public Integer leave(Car car) {
        return car.getYearManufacture();
    }

    public Integer getCount(String brand,String model) {
        return machine.get(brand + " " + model);
    }

    public boolean isExist(String registrationNumber) {
        return listRegistrationNumber.contains(registrationNumber);
    }

    public boolean isExist(String brand, String model, String registrationNumber) {
        return machine.containsKey(brand + " " + model) && listRegistrationNumber.contains(registrationNumber);
    }

}
