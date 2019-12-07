package com.rakovets.java.task.collections.list.garage;

import java.util.HashMap;
import java.util.Map;

public class Garage {

    private Map<Car, Integer> map = new HashMap<>();


    public void park(Car car) {
        if (map.containsKey(car)) {
            int currentCount = map.get(car);
            map.put(car, currentCount + 1);
        } else {
            map.put(car, 1);
        }
    }

    public void leave(Car car) {
        if (map.containsKey(car)) {
            int currentCount = map.get(car);
            if (currentCount > 1) {
                map.put(car, currentCount - 1);
            } else {
                map.remove(car);
            }
        }
    }

    public int getCount(Car car) {
        return map.getOrDefault(car, 0);
    }


    public int getCount(String model) {
        int count = map.keySet().stream()
                .filter(car -> car.getModel().equals(model))
                .mapToInt(car -> map.get(car))
                .sum();
        return count;
    }

    public int getCount1(String brand) {
        int count = map.keySet().stream().filter(car -> car.getBrand().equals(brand)).mapToInt(car -> map.get(car)).sum();
        return count;
    }

    public void showInfo() {
        for (Map.Entry<Car, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }

}