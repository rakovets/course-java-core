package com.rakovets.course.javabasics.practice.lambdaexpressions;

import java.util.ArrayList;

import static com.rakovets.course.javabasics.practice.lambdaexpressions.CitiesFilterUtil.*;

public class CityFilterUtilDemo {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>() {{
            add("Belgrade");
            add("Minsk");
            add("Moscow");
            add("Kiev");
            add("London");
            add("New York");
            add("Sydney");
            add("St.Petersburg");
            add("Dresden");
            add("Hamburg");
            add("Berlin");
            add("Potsdam");
            add("Essen");
            add("Leipzig");
            add("Stuttgart");
            add("Konigsberg");
            add("Minsk");
        }};

        System.out.println(getDistinctCitiesInList(list));
        System.out.println(getCitiesLessThan6LettersNames(list));
        System.out.println(getCitiesNamesStartedWithLetter(list, 'S'));
        System.out.println(countDistinctCity(list, "Minsk"));
    }
}
