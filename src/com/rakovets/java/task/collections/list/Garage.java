package com.rakovets.java.task.collections.list;

import java.util.HashMap;
import java.util.Map;

public class Garage {

    private Map<Car, Integer> map = new HashMap<>();


    public void park(Car car) {
        if (map.containsKey(car)) {
            int cuurentCount = map.get(car);
            map.put(car, cuurentCount + 1);
        } else {
            map.put(car, 1);
        }
    }

}