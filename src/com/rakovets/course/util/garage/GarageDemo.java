package com.rakovets.course.util.garage;

import java.util.ArrayList;

public class GarageDemo {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Volkswagen Polo", 1999, "grey", 3621, 1.2));
        cars.add(new Car("Renault Arkana", 2019, "red", 15983, 1.6));
        cars.add(new Car("BMW X7", 2018, "black", 74984, 2.9));
        cars.add(new Car("Mercedes S 350", 2009, "brown", 17006, 3.5));
        cars.add(new Car("Volkswagen Polo", 1999, "red", 3620, 1.2));
        cars.add(new Car("BMW X7", 2019, "black", 7500, 2.9));
        Garage garage = new Garage(cars);

        System.out.println("All cars;\n");
        garage.viewAllCars();
        System.out.println("Enter color:");
        garage.viewCarsGivenColor();
        System.out.println("Enter engine capacity:");
        garage.viewCarsGivenEngineCapacity();
        System.out.println("Enter the cost:");
        garage.carsAreMoreExpensiveThanTheSetCost();
        System.out.println("Enter limits of year of Car Manufacture:");
        garage.carsWhoseYearOfManufactureIsInTheRangeOf();


    }
}
