package com.rakovets.java.task.collections.list;

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


//    leave()
//    getCount(String )
//    getCount(brand)
//    getCount(brand, model)
}