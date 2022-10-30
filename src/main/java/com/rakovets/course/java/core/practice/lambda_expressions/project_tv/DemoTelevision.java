package com.rakovets.course.java.core.practice.lambda_expressions.project_tv;

import java.util.ArrayList;
import java.util.List;

public class DemoTelevision {
    public static void main(String[] args) {
        List<Television> televisionList = new ArrayList<>(List.of(
                new Television("Samsung", "111", 2020, 50, 1105.5),
                new Television("Samsung", "112", 2021, 55, 1505.0),
                new Television("Samsung", "113", 2022, 55, 1805.2),
                new Television("Samsung", "114", 2019, 60, 1550.8),
                new Television("LG", "211", 2020, 40, 750.9),
                new Television("LG", "212", 2020, 50, 1225.0),
                new Television("LG", "213", 2021, 60, 1505.0),
                new Television("LG", "214", 2019, 60, 1705.0),
                new Television("LG", "215", 2022, 70, 2205.0),
                new Television("Philips", "311", 2019, 40, 605.0),
                new Television("Philips", "312", 2020, 50, 1255.0),
                new Television("Philips", "313", 2022, 80, 2205.0),
                new Television("Sony", "411", 2022, 80, 3205.0)
        ));
        televisionList.stream()
                //.filter(x -> x.getDiagonalSize() == 50)
                //.filter(x -> x.getProducerCompany() == "Sony")
                //.filter(x -> x.getYearOfProduction() >= 2022)
                //.filter(x -> x.getPrice() > 1500 && x.getPrice() < 2000)
                //.sorted((a, b) -> (int) (a.getPrice() - b.getPrice()))
                //.sorted((a, b) -> (int) (b.getPrice() - a.getPrice()))
                //.sorted((a, b) -> (int) (a.getDiagonalSize() - b.getDiagonalSize()))
                //.sorted((a, b) -> (int) (b.getDiagonalSize() - a.getDiagonalSize()))
                //.sorted((a, b) -> a.getProducerCompany().compareTo(b.getProducerCompany()))
                .sorted((a, b) -> b.getProducerCompany().compareTo(a.getProducerCompany()))
                .forEach(System.out::println);
    }
}
