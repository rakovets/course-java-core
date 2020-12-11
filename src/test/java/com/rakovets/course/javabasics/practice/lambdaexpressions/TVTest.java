package com.rakovets.course.javabasics.practice.lambdaexpressions;

import com.rakovets.course.javabasics.practice.lambdaexpressions.tv.TV;
import com.rakovets.course.javabasics.practice.lambdaexpressions.tv.model.TVModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TVTest {
    private List<TVModel> listOfTV;
    private List<TVModel> listOfTVWith55Diagonal;
    private List<TVModel> listOfTVWithSonyManufacturer;
    private List<TVModel> listOfTVOver2014YearTest;
    private List<TVModel> listOfTV500550PriceTest;
    private List<TVModel> firstListOfSortedListOfTVByPrice;
    private List<TVModel> secondListOfSortedListOfTVByPrice;
    private TVModel firstTV;
    private TVModel secondTV;
    private TVModel thirdTV;
    private TVModel fourthTV;
    private TVModel fifthTV;


    @BeforeEach
    void init() {
        firstTV = new TVModel("Sony", "55N", 2010, 60, 500);
        secondTV = new TVModel("Samsung", "32U", 2012, 40, 300);
        thirdTV = new TVModel("Sony", "65H", 2015, 45, 520);
        fourthTV = new TVModel("Intel", "54G", 2014, 55, 544);
        fifthTV = new TVModel("Sequent", "25R", 2014, 30, 220);
        listOfTV = List.of(firstTV, secondTV, thirdTV, fourthTV, fifthTV);
        listOfTVWith55Diagonal = List.of(fourthTV);
        listOfTVWithSonyManufacturer = List.of(firstTV, thirdTV);
        listOfTVOver2014YearTest = List.of(thirdTV, fourthTV, fifthTV);
        listOfTV500550PriceTest = List.of(firstTV, thirdTV, fourthTV);
        firstListOfSortedListOfTVByPrice = List.of(fifthTV, secondTV, firstTV, thirdTV, fourthTV);
        secondListOfSortedListOfTVByPrice = List.of(fourthTV, thirdTV, firstTV, secondTV, fifthTV);
    }

    @Test
    void getListOfTVWithGivenDiagonalTest() {
       assertEquals(listOfTVWith55Diagonal, TV.getListOfTVWithGivenDiagonal(listOfTV, 55));
    }

    @Test
    void getListOfTVWithGivenManufacturerTest() {
        assertEquals(listOfTVWithSonyManufacturer, TV.getListOfTVWithGivenManufacturer(listOfTV, "Sony"));
    }

    @Test
    void getListOfTVOverGivenYearTest() {
        assertEquals(listOfTVOver2014YearTest, TV.getListOfTVOverGivenYear(listOfTV, 2014));
    }

    @Test
    void getListOfTVWithGivenPriceRangeTest() {
        assertEquals(listOfTV500550PriceTest, TV.getListOfTVWithGivenPriceRange(listOfTV, 500, 550));
    }

    @Test
    void getListOfSortedTVByPriceTest() {
        assertEquals(firstListOfSortedListOfTVByPrice, TV.getListOfSortedTVByPrice(listOfTV, false));
        assertEquals(secondListOfSortedListOfTVByPrice, TV.getListOfSortedTVByPrice(listOfTV, true));
    }
}
