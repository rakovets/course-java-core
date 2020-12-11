package com.rakovets.course.javabasics.practice.lambdaexpressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CityHelperTest {
    private List<String> listOfCountry;
    private List<String> listOfUniqueCountry;
    private List<String> listOfWordsLongerThanSixCharacters;
    private List<String> listOfWordsStartingWithD;
    private int countOfRepetitionOfWordKawasaki;

    @BeforeEach
    void init() {
        listOfCountry = List.of("Baku", "Minsk", "Delhi", "Lagos", "Baku", "Dakar", "Kawasaki", "Delhi");
        listOfUniqueCountry = List.of("Baku", "Minsk", "Delhi", "Lagos", "Dakar", "Kawasaki");
        listOfWordsLongerThanSixCharacters = List.of("Kawasaki");
        listOfWordsStartingWithD = List.of("Delhi", "Dakar");
        countOfRepetitionOfWordKawasaki = 1;
    }

    @Test
    void getListOfUniqueCountryTest() {
        assertEquals(listOfUniqueCountry, CityHelper.getListOfUniqueCountry(listOfCountry));
    }

    @Test
    void getListOfWordsLongerThanSixCharactersTest() {
        assertEquals(listOfWordsLongerThanSixCharacters, CityHelper.getListOfWordsLongerThanSixCharacters(listOfCountry));
    }

    @Test
    void getListOfWordsStartingWithASpecificLetterTest() {
        assertEquals(listOfWordsStartingWithD, CityHelper.getListOfWordsStartingWithASpecificLetter(listOfCountry, 'D'));
    }

    @Test
    void getCountOfRepetitionOfWordTest() {
        assertEquals(countOfRepetitionOfWordKawasaki, CityHelper.getCountOfRepetitionOfWord(listOfCountry, "Kawasaki"));
    }

}
