package com.rakovets.java.task.collections.list.garage;

public class MainGarage {
    public static void main(String[] args) {
        Car car1 = new Bmw("Bmw", "M3", "Brown", 2017, 84337, "2 liters");
        Car car2 = new Audi("Audi", "A4", "Black", 2018, 84447, "10 liters");
        Car car3 = new Bmw("Bmw", "M3", "Brown", 2016, 84337, "2 liters");
        Car car4 = new Volkswagen("Huita", "A4", "Black", 2015, 8172, "6 liters");


        Garage garage = new Garage();
        garage.park(car1);
        garage.park(car2);
        garage.park(car2);
        garage.park(car1);
        garage.park(car3);
        garage.park(car4);
        garage.showInfo();


        garage.leave(car1);
        garage.leave(car1);

        int count = garage.getCount(car2);
        System.out.println("\ncount = " + count);

        int count2 = garage.getCount("A4");
        System.out.println("count2 = " + count2);
    }
}
