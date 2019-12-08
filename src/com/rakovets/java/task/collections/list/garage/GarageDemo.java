package com.rakovets.java.task.collections.list.garage;

import java.util.HashMap;
import java.util.Map;

public class GarageDemo {
    public static void main(String[] args) {
        Car car1 = new Bmw("BMW", "X5", "Black", 2014, 1203);
        Car car2 = new Skoda("Skoda", "Rapid", "Blue", 2011, 1324);
        Car car3 = new Lada("Lada", "Vesta", "Orange", 2015, 8634);
        Car car4 = new Jeep("Jeep", "Adventure", "Red", 2018, 2889);

        Garage garage = new Garage();
        garage.park(car1);
        garage.park(car2);
        garage.park(car3);
        garage.park(car4);
        garage.printGarage();
        System.out.println();
        garage.park(car1);
        garage.printGarage();
        System.out.println();
        garage.leave(car3);
        garage.printGarage();
        System.out.println();
        garage.leave(car3);
        garage.printGarage();
        System.out.println("Count of BMW: " + garage.getCountByBrand("BMW"));
        System.out.println("Count of Rapid: " + garage.getCountByModel("Rapid"));
        System.out.println("Count of Lada Vesta: " + garage.getCountBuBrandAndModel("Lada", "Vesta"));
    }
}
