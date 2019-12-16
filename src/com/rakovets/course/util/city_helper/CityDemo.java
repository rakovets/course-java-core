package com.rakovets.course.util.city_helper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CityDemo {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        Collections.addAll(cities, "Berlin", "Minsk", "Gamburg", "Rostov", "Gomel", "Rome");

        System.out.println("All cities:");
        cities.stream()
                .forEach(s -> System.out.println(s));

        System.out.println("\nTitles that longer 6:");
        cities.stream()
                .filter(s -> s.length() > 6)
                .forEach(s -> System.out.println(s));

        System.out.println("\nEnter Char:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println("\nCities that start on current letter:");
        cities.stream()
                .forEach(s -> {
                    char charFromString = s.charAt(0);
                    String str2 = "";
                    str2 += charFromString;
                    if (str.equals(str2)) {
                        System.out.println(s);
                    }
                });

        System.out.println("\nEnter city:");
        String strWithChoosingCity = scanner.next();
        System.out.println("\nCount of this cities: ");
        cities.stream()
                .filter(s -> strWithChoosingCity.equals(s))
                .forEach(s -> System.out.println(s));
    }
}
