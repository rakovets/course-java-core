package com.rakovets.course.javabasics.practice.lambdaexpressions;

import java.util.List;
import java.util.stream.Collectors;

public class CityHelper {
    public static List<String> getListOfUniqueCountry(List<String> listOfCountry) {
        return listOfCountry.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<String> getListOfWordsLongerThanSixCharacters(List<String> listOfCountry) {
        int countOfLetters = 6;
        return listOfCountry.stream()
                .filter(s-> s.length() > countOfLetters)
                .collect(Collectors.toList());
    }

    public static List<String> getListOfWordsStartingWithASpecificLetter(List<String> listOfCountry, char letter) {
        return listOfCountry
                .stream().distinct().filter(s-> s.charAt(0) == letter)
                . collect(Collectors.toList());
    }

    public static int getCountOfRepetitionOfWord(List<String> listOfCountry, String word) {
        return (int) listOfCountry.stream()
                .filter(s-> s.equals(word))
                .count();
    }
}
