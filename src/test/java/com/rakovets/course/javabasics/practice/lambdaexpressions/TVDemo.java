package com.rakovets.course.javabasics.practice.lambdaexpressions;

import com.rakovets.course.javabasics.example.lambdaexpressions.streamapi.model.Student;
import com.rakovets.course.javabasics.util.AnsiColorCode;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TVDemo {

    public static void main(String[] args) {

        List<Television> catalog = List.of(
                new Television("Philips", "PL9265", 2001, 42, 1200),
                new Television("Thomson", "TH9055/43", 2011, 43, 1000),
                new Television("Sony", "KDL55MC54", 2019, 55, 1900),
                new Television("Toshiba", "TBX32FSD", 2004, 32, 800),
                new Television("Panasonic", "PL9265", 2009, 42, 1500),
                new Television("Sharp", "PL9265", 1998, 21, 2200),
                new Television("Grundic", "GR92VD-x3", 2001, 37, 670)
        );

        int size = 42;
        System.out.print(AnsiColorCode.FG_MAGENTA_UNDERLINED +
                "\n\nFilter by size:  " + size + AnsiColorCode.RESET);
        catalog.stream().filter(model -> model.getSize() == size)
                        .forEach(System.out::println);

        String brand = "Sony";
        System.out.print(AnsiColorCode.FG_MAGENTA_UNDERLINED +
                "\n\nFilter by brand:  " + brand + AnsiColorCode.RESET);
        catalog.stream().filter(model -> model.getBrand().equals(brand))
                        .forEach(System.out::println);

        int year = 2005;
        System.out.print(AnsiColorCode.FG_MAGENTA_UNDERLINED +
                "\n\nFilter by Year: " + year + AnsiColorCode.RESET);
        catalog.stream().filter(model -> model.getYear() > year)
                        .forEach(System.out::println);

        int priceStart = 100;
        int priceEnd = 800;
        System.out.print(AnsiColorCode.FG_MAGENTA_UNDERLINED +
                "\n\nFilter by Price from: " + priceStart + "$ to " + priceEnd + "$" + AnsiColorCode.RESET);
        catalog.stream().filter(model -> model.getPrice() >= priceStart && model.getPrice() <= priceEnd)
                        .forEach(System.out::println);

        System.out.print(AnsiColorCode.FG_MAGENTA_UNDERLINED +
                "\n\nSorted by Price: " + AnsiColorCode.RESET);
        catalog.stream().sorted(Comparator.comparingInt(Television::getPrice))
                        .forEach(System.out::println);

        System.out.print(AnsiColorCode.FG_MAGENTA_UNDERLINED +
                "\n\nSorted by Price desc: " + AnsiColorCode.RESET);
        catalog.stream().sorted((t1,t2) -> Integer.compare(t2.getPrice(), t1.getPrice()))
                        .forEach(System.out::println);

        System.out.print(AnsiColorCode.FG_MAGENTA_UNDERLINED +
                "\n\nSorted by Size: " + AnsiColorCode.RESET);
        catalog.stream().sorted(Comparator.comparingInt(Television::getSize))
                .forEach(System.out::println);

        System.out.print(AnsiColorCode.FG_MAGENTA_UNDERLINED +
                "\n\nSorted by Size desc: " + AnsiColorCode.RESET);
        catalog.stream().sorted((t1,t2) -> Integer.compare(t2.getSize(), t1.getSize()))
               .forEach(System.out::println);
    }
}
