package com.rakovets.course.java.core.practice.jcf_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Garage {
    List<Car> cars = new ArrayList<>();
    Map<Car, List<Car>> carListMap = new HashMap<>();

    public void park(Car car) {
        if (carListMap.containsKey(car)) {
            cars.add(car);
            carListMap.put(car, this.cars);
        } else {
            carListMap.put(car, cars);
        }
    }

    public static void showInfo(Garage garage) {
        for (Map.Entry<Car, List<Car>> entry : garage.carListMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
