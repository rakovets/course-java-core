package com.rakovets.java.task.collections.list;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Bmw("Bmw", "M3", "Brown", 2017, 84337, "2 liters");
        Car car2 = new Audi("Audi", "A4", "Black", 2018, 84447, "10 liters");
        Car car3 = new Bmw("Bmw", "M3", "Brown", 2016, 84337, "2 liters");


        Garage garage = new Garage();
        garage.park(car1);
        garage.park(car2);
        garage.park(car1);
        garage.park(car3);


        garage.leave(car1);
        garage.leave(car1);
    }
}
