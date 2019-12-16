package com.rakovets.course.util.tv;

import java.util.ArrayList;
import java.util.List;

public class TvDemo {
    public static void main(String[] args) {
        List<Television> listWithTelevision = new ArrayList<>();
        listWithTelevision.add(new Television("x-100", 2014, 500, 40.5, "Sony"));
        listWithTelevision.add(new Television("100500", 2015, 600, 50.0, "Philips"));
        listWithTelevision.add(new Television("x-150", 2019, 750, 75.5, "Sony"));
        listWithTelevision.add(new Television("Bright", 2014, 300, 39.9, "Vitaz"));
        listWithTelevision.add(new Television("Omega", 2018, 700, 75.0, "Panasonic"));
        listWithTelevision.add(new Television("N-123", 2013, 630, 40.0, "LG"));

        listWithTelevision.stream()
                .forEach(television -> System.out.println(television.toString()));

        System.out.println("\nTv with diagonal 75.5:");
        listWithTelevision.stream()
                .filter(television -> television.getDiagonal() == 75.5)
                .forEach(television -> System.out.println(television.toString()));

        System.out.println("\nTv that made Sony:");
        listWithTelevision.stream()
                .filter(television -> television.getProducer().equals("Sony"))
                .forEach(television -> System.out.println(television.toString()));

        System.out.println("\nCurrent year:");
        listWithTelevision.stream()
                .filter(television -> television.getYearOfProduction() == 2019)
                .forEach(television -> System.out.println(television.toString()));

        System.out.println("\nExpensively then 700:");
        listWithTelevision.stream()
                .filter(television -> television.getCost() > 700)
                .forEach(television -> System.out.println(television.toString()));

        CostComparator costComparator = new CostComparator();
        System.out.println("\nSorted by cost to the biggest:");
        listWithTelevision.stream()
                .sorted(costComparator)
                .forEach(television -> System.out.println(television.toString()));

        CostComparatorToLower costComparatorToLower = new CostComparatorToLower();
        System.out.println("\nSorted by cost to the Least:");
        listWithTelevision.stream()
                .sorted(costComparatorToLower)
                .forEach(television -> System.out.println(television.toString()));

        DiagonalComparatorToBigger diagonalComparatorToBigger = new DiagonalComparatorToBigger();
        System.out.println("\nSorted by diagonal to the biggest:");
        listWithTelevision.stream()
                .sorted(diagonalComparatorToBigger)
                .forEach(television -> System.out.println(television.toString()));

        DiagonalComparatorToLower diagonalComparatorToLower = new DiagonalComparatorToLower();
        System.out.println("\nSorted by diagonal to the Least:");
        listWithTelevision.stream()
                .sorted(diagonalComparatorToLower)
                .forEach(television -> System.out.println(television.toString()));
    }
}
