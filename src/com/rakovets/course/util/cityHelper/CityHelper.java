package com.rakovets.course.util.cityHelper;


import java.util.ArrayList;
import java.util.Scanner;

public class CityHelper {
    ArrayList<String> sities;

    public CityHelper(ArrayList<String> sities) {
        this.sities = sities;
    }

    public void allCities() {
        sities.stream()
                .forEach(c -> System.out.println(c));
    }

    public void allCitiesWithNameLongerThanSixCharacters() {
        sities.stream()
                .filter(c -> c.length() > 6)
                .forEach(c -> System.out.println(c));
    }

    public void allCitiesWithNameStartingWithAGivenLetter() {
        Scanner scanner = new Scanner(System.in);
        String letterFromUserInput = scanner.next();
        sities.stream()
                .forEach(s -> {
                    char charFromString = s.charAt(0);
                    String firstLetterFromCitiesName = "";
                    firstLetterFromCitiesName += charFromString;
                    if (letterFromUserInput.equals(firstLetterFromCitiesName)) {
                        System.out.println(s);
                    }
                });
    }

    public long numberOfRepetitionsOfCityNames() {
        Scanner scanner = new Scanner(System.in);
        String NameOfTheCity = scanner.next();
        long countOfRepetitionsCityNames = sities.stream()
                .filter(c -> NameOfTheCity.equals(c))
                .count();
        return countOfRepetitionsCityNames;
    }
}

