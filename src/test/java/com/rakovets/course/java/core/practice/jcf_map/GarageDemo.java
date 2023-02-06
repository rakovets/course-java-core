package com.rakovets.course.java.core.practice.jcf_map;

public class GarageDemo {
    public static void main(String[] args) {
        Car car1 = new Mercedes("Mercedes", "S-class", "red", 2020,"2195-NM7");
        Car car2 = new Volvo("Volvo", "v60", "blue", 2021,"2295-NM7");

        Garage garage = new Garage();
        garage.park(car1);
        garage.park(car2);
        garage.park(new Mazeratti("Mazeratti", "veron", "burgundi", 2016, "0000-7TT"));

        Garage.showInfo(garage);

    }
}
