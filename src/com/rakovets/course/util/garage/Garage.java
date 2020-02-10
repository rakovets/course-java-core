package com.rakovets.course.util.garage;

import java.util.ArrayList;
import java.util.Scanner;

public class Garage {
    ArrayList<Car> cars;

    public Garage(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public void viewAllCars() {
        cars.stream()
                .forEach(c -> System.out.println(c.toString() + "\n"));
    }

    public void viewCarsGivenColor() {
        Scanner scanner = new Scanner(System.in);
        String givenColor = scanner.next();
        cars.stream()
                .filter(c -> c.getColor().equals(givenColor))
                .forEach(c -> System.out.println(c.toString()));

    }

    public void viewCarsGivenEngineCapacity() {
        Scanner scanner = new Scanner(System.in);
        double givenEngineCapacity = scanner.nextDouble();
        cars.stream()
                .filter(c -> c.getEngineCapacity() == givenEngineCapacity)
                .forEach(c -> System.out.println(c.toString()));
    }

    public void carsAreMoreExpensiveThanTheSetCost() {
        Scanner scanner = new Scanner(System.in);
        double givenCost = scanner.nextDouble();
        cars.stream()
                .filter(c -> c.getCost() > givenCost)
                .forEach(c -> System.out.println(c.toString()));
    }

    public void carsWhoseYearOfManufactureIsInTheRangeOf() {
        Scanner scanner = new Scanner(System.in);
        int lowerYearLimit = scanner.nextInt();
        int upperYearLimit = scanner.nextInt();
        cars.stream()
                .filter(c -> c.getYearOfCarManufacture() >= lowerYearLimit && c.getYearOfCarManufacture() <= upperYearLimit)
                .forEach(c -> System.out.println(c.toString()));
    }

}
