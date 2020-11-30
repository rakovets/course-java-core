package com.rakovets.course.javabasics.practice.lambdaexpressions;

import com.rakovets.course.javabasics.util.AnsiColorCode;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Stream;

public class CityDemo {
    public static void main(String[] args) {

        LinkedList<String> cityList = new LinkedList<>();
        cityList.add("Minsk");
        cityList.add("Moscow");
        cityList.add("Pekin");
        cityList.add("Tokyo");
        cityList.add("Minsk");
        cityList.add("Sevastopol");
        cityList.add("Odessa");
        cityList.add("Vladivostok");
        cityList.add("Homel");
        cityList.add("Homel");

        System.out.print(AnsiColorCode.FG_MAGENTA_UNDERLINED + "\n\nThe list of Cities:\n" + AnsiColorCode.RESET);
        cityList.forEach((String city) -> System.out.print(AnsiColorCode.FG_YELLOW
                                                           + city + " " + AnsiColorCode.RESET + " "));

        Stream<String> listStream = cityList.stream();

        System.out.println(AnsiColorCode.FG_MAGENTA_UNDERLINED + "\n\nUnique Cities:" + AnsiColorCode.RESET);
        listStream.distinct()
                .forEach((String city) -> System.out.print(AnsiColorCode.FG_YELLOW
                                                           + city + " " + AnsiColorCode.RESET + " "));

        System.out.println(AnsiColorCode.FG_MAGENTA_UNDERLINED + "\n\nCities with long names > 6:" + AnsiColorCode.RESET);
        cityList.stream().filter((String city) -> !(city.length() <= 6))
                         .forEach(System.out::println);

        String simb = "M";
        System.out.println(AnsiColorCode.FG_MAGENTA_UNDERLINED + "\nCities from simbol: " + simb + AnsiColorCode.RESET);
        cityList.stream().filter((String city) -> city.startsWith(simb))
                         .distinct().forEach(System.out::println);

        String theCity = "Tokyo";
        System.out.println(AnsiColorCode.FG_MAGENTA_UNDERLINED + "\nCount of the City: " + theCity + AnsiColorCode.RESET);
        int count = (int)cityList.stream()
                                 .filter((String city) -> city.equals(theCity))
                                 .count();
        System.out.println(AnsiColorCode.FG_YELLOW  + "The City of " + theCity + " meets = " + count + AnsiColorCode.RESET);
        System.out.println("--------------------------------------");

    }
}
