package com.rakovets.course.util.cityHelper;

import java.util.ArrayList;

public class CityHelperDemo {
    public static void main(String[] args) {


        ArrayList<String> sities = new ArrayList<String>();
        sities.add("Minsk");
        sities.add("Grodno");
        sities.add("Vitebsk");
        sities.add("Amsterdam");
        sities.add("Beijing");
        sities.add("Belgrade");
        sities.add("Berlin");
        sities.add("Brussels");
        sities.add("Chicago");
        sities.add("Luxembourg");
        sities.add("Moscow");
        sities.add("Oslo");
        sities.add("Paris");
        sities.add("Riga");
        sities.add("Rome");
        sities.add("Sofia");
        sities.add("Tokyo");
        sities.add("Warsaw");
        sities.add("Amsterdam");
        sities.add("Beijing");
        sities.add("Belgrade");
        sities.add("Berlin");
        sities.add("Brussels");
        sities.add("Rome");
        sities.add("Sofia");
        sities.add("Tokyo");
        sities.add("Warsaw");
        sities.add("Amsterdam");
        sities.add("Beijing");
        sities.add("Belgrade");
        sities.add("Grodno");
        sities.add("Vitebsk");
        sities.add("Amsterdam");
        sities.add("Beijing");
        sities.add("Belgrade");
        sities.add("Berlin");

        CityHelper cityHelper = new CityHelper(sities);

        System.out.println("All cities at list are:\n");
        cityHelper.AllCities();

        System.out.println("All cities at list with name longer than six characters are:\n");
        cityHelper.AllCitiesWithNameLongerThanSixCharacters();

        System.out.println("Enter the letter");
        cityHelper.AllCitiesWithNameStartingWithAGivenLetter();

        System.out.println("Enter name of the city:");
        System.out.println("Number of repetitions: " + cityHelper.NumberOfRepetitionsOfCityNames());
    }
}

