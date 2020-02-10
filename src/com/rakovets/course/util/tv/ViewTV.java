package com.rakovets.course.util.tv;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

public class ViewTV {
    ArrayList<TV> tVs;
    private Object DiagonalComparatorToBigger;

    public ViewTV(ArrayList<TV> tVs) {
        this.tVs = tVs;
    }

    public void viewAllTVs() {
        tVs.stream()
                .forEach(t -> System.out.println(t.toString()));
    }

    public void viewTVsGivenDiagonal() {
        Scanner scanner = new Scanner(System.in);
        double givenDiagonal = scanner.nextDouble();
        tVs.stream()
                .filter(t -> t.getDiagonal() == givenDiagonal)
                .forEach(c -> System.out.println(c.toString()));
    }

    public void viewTVGivenManufacturer() {
        Scanner scanner = new Scanner(System.in);
        String givenManufacturer = scanner.next();
        tVs.stream()
                .filter(t -> t.getManufacturer().equals(givenManufacturer))
                .forEach(t -> System.out.println(t.toString()));
    }

    public void viewTVGivenYearOfManufacture() {
        Scanner scanner = new Scanner(System.in);
        int giveYear = scanner.nextInt();
        tVs.stream()
                .filter(t -> t.getYearOfManufacture() == giveYear)
                .forEach(t -> System.out.println(t.toString()));
    }

    public void viewTVsAreMoreExpensiveThanTheSetCost() {
        Scanner scanner = new Scanner(System.in);
        double givenCost = scanner.nextDouble();
        tVs.stream()
                .filter(t -> t.getCost() > givenCost)
                .forEach(t -> System.out.println(t.toString()));
    }

    public void tVsSortedByCostAscending() {

    }

}
