package com.rakovets.course.util.garage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GarageDemo {
    public static void main(String[] args) {
        List<Car> listWithCars = new ArrayList<>();
        listWithCars.add(new Car("Pejo", 1999,3000, "Blue", 1.5));
        listWithCars.add(new Car("BMW", 2005,7000, "Black", 2.6));
        listWithCars.add(new Car("Lada", 2007,9000, "orange", 1.3));
        listWithCars.add(new Car("Mazda", 2012,12000, "Red", 3.7));
        listWithCars.add(new Car("BMW", 2019,16000, "Black", 2.5));

        listWithCars.stream()
                .forEach(car -> System.out.println(car.toString()));

        System.out.println("\nCars with black color:");
        listWithCars.stream()
                .filter(car -> car.getColor().equals("Black"))
                .forEach(car -> System.out.println(car.toString()));

        System.out.println("\nCars with 1.5 engineVolume:");
        listWithCars.stream()
                .filter(car -> car.getEngineVolume() == 1.5)
                .forEach(car -> System.out.println(car.toString()));

        System.out.println("\nExpensively 5000:");
        listWithCars.stream()
                .filter(car -> car.getCost() > 5000)
                .forEach(car -> System.out.println(car.toString()));

        System.out.println("\nYear of production from 2005 to 2010");
        listWithCars.stream()
                .filter(car -> car.getYearOfProduce() >= 2005 && car.getYearOfProduce() <= 2010)
                .forEach(car -> System.out.println(car.toString()));
    }
}
