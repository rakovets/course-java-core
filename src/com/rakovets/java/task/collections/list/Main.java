package com.rakovets.java.task.collections.list;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        garage.park(new Bmw("Bmw", "M3", "Brown", 2017, 84337, "2 liters"));
        garage.park(new Audi("Audi", "A4", "Black", 2018, 84447, "10 liters"));
        garage.park(new Bmw("Bmw", "M3", "Brown", 2017, 84337, "2 liters"));
        garage.park(new Bmw("Bmw", "M3", "Brown", 2016, 84337, "2 liters"));
    }
}
