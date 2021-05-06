package com.rakovets.course.java.core.practice.lambda_expressions.tv;

import java.util.ArrayList;
import java.util.List;

public class TVDemo {
    public static void main(String[] args) {
        List<Television> televisions = new ArrayList<>();
        televisions.add(new Television("Samsung", "UE43TU7090UXRU", 2021, 109, 1339));
        televisions.add(new Television("Samsung", "UE24N4500AU", 2017, 61, 549));
        televisions.add(new Television("Samsung", "UE50TU7560UXRU", 2019, 127, 1290));
        televisions.add(new Television("Philips", "43PFS6825/60", 2017, 109, 882));
        televisions.add(new Television("Philips", "50PUS6704/60", 2021, 127, 1183));
        televisions.add(new Television("Philips", "50PUS7605/60", 2021, 127, 1235));
        televisions.add(new Television("Horizont", "32LE5511D", 2017, 81, 365));
        televisions.add(new Television("Sony", "KDL-32WD603", 2019, 80, 899));
        televisions.add(new Television("Sony", " KDL-43WF665B", 2021, 109, 1377));

        System.out.println("\nList of televisions with a certain diagonal:");
        List<Television> televisionsWithSameDiagonal;
        int diagonal = 127;
        televisionsWithSameDiagonal = TV.getTelevisionWithCertainDiagonal(televisions, diagonal);
        print(televisionsWithSameDiagonal);

        System.out.println("\nList of televisions of a certain company:");
        List<Television> televisionsOfCertainCompany;
        String company = "Philips";
        televisionsOfCertainCompany = TV.getTelevisionOfCertainCompany(televisions, company);
        print(televisionsOfCertainCompany);

        System.out.println("\nList of televisions of a certain year:");
        List<Television> televisionsOfCertainYear;
        int year = 2019;
        televisionsOfCertainYear = TV.getTelevisionOfCertainYear(televisions, year);
        print(televisionsOfCertainYear);

        System.out.println("\nList of televisions of a certain price:");
        List<Television> televisionsOfCertainPrice;
        int minPrice = 599;
        int maxPrice = 1100;
        televisionsOfCertainPrice = TV.getTelevisionOfCertainPrice(televisions, minPrice, maxPrice);
        print(televisionsOfCertainPrice);

        System.out.println("\nTV list sorted by price (ascending):");
        List<Television> televisionsSortedByPriceAscending;
        televisionsSortedByPriceAscending = TV.sortedByPriceAscending(televisions);
        print(televisionsSortedByPriceAscending);

        System.out.println("\nTV list sorted by price (descending):");
        List<Television> televisionsSortedByPriceDescending;
        televisionsSortedByPriceDescending = TV.sortedByPriceDescending(televisions);
        print(televisionsSortedByPriceDescending);

        System.out.println("\nTV list sorted by diagonal (ascending):");
        List<Television> televisionsSortedByDiagonalAscending;
        televisionsSortedByDiagonalAscending = TV.sortedByDiagonalAscending(televisions);
        print(televisionsSortedByDiagonalAscending);

        System.out.println("\nTV list sorted by diagonal (descending):");
        List<Television> televisionsSortedByDiagonalDescending;
        televisionsSortedByDiagonalDescending = TV.sortedByDiagonalDescending(televisions);
        print(televisionsSortedByDiagonalDescending);
    }

    public static void print(List<Television> list) {
        list.stream().forEach(x -> System.out.println(x.getCompany() + " - " + x.getModel() + "  " + x.getYear() + " / " + x.getDiagonal() + " / " + x.getPrice()));
    }
}
