package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TVUtilityTest {
    List<TV> tvList = Arrays.asList(
            new TV("Sony", "1A", 2017, 20.3, 500.0),
            new TV("LG", "2B", 2018, 30.6, 700.0),
            new TV("Samsung", "3C", 2019, 40.0, 1000.0),
            new TV("Panasonic", "4D", 2020, 50.0, 200.0),
            new TV("Philips", "5E", 2021, 40.0, 400.0),
            new TV("Sony", "6F", 2017, 30.9, 500.0),
            new TV("LG", "7G", 2018, 20.8, 100.0),
            new TV("Sony", "8H", 2019, 50.4, 300.0));

    TVUtility tvUtility = new TVUtility(tvList);

    @Test
    void getDiagonal() {
        assertEquals(
                "[[TV{production='Samsung', modelName='3C', year=2019, diagonal=40.0, price=1000.0}, " +
                        "TV{production='Philips', modelName='5E', year=2021, diagonal=40.0, price=400.0}]]",
                Collections.singletonList(tvUtility.getDiagonal(40.0)).toString());
    }

    @Test
    void getProducer() {
        assertEquals(
                "[[TV{production='Sony', modelName='1A', year=2017, diagonal=20.3, price=500.0}, " +
                        "TV{production='Sony', modelName='6F', year=2017, diagonal=30.9, price=500.0}, " +
                        "TV{production='Sony', modelName='8H', year=2019, diagonal=50.4, price=300.0}]]",
                Collections.singletonList(tvUtility.getProducer("Sony")).toString());
    }

    @Test
    void getYear() {
        assertEquals(
                "[[TV{production='Samsung', modelName='3C', year=2019, diagonal=40.0, price=1000.0}, " +
                        "TV{production='Panasonic', modelName='4D', year=2020, diagonal=50.0, price=200.0}, " +
                        "TV{production='Philips', modelName='5E', year=2021, diagonal=40.0, price=400.0}, " +
                        "TV{production='Sony', modelName='8H', year=2019, diagonal=50.4, price=300.0}]]",
                Collections.singletonList(tvUtility.getYear(2019)).toString());
    }

    @Test
    void specificPrice() {
        assertEquals(
                "[[TV{production='Sony', modelName='1A', year=2017, diagonal=20.3, price=500.0}, " +
                        "TV{production='LG', modelName='2B', year=2018, diagonal=30.6, price=700.0}, " +
                        "TV{production='Sony', modelName='6F', year=2017, diagonal=30.9, price=500.0}]]",
                Collections.singletonList(tvUtility.specificPrice(500.0, 800.0)).toString());
    }

    @Test
    void sortedByPriceAscending() {
        assertEquals(
                "[[TV{production='LG', modelName='7G', year=2018, diagonal=20.8, price=100.0}, " +
                        "TV{production='Panasonic', modelName='4D', year=2020, diagonal=50.0, price=200.0}, " +
                        "TV{production='Sony', modelName='8H', year=2019, diagonal=50.4, price=300.0}, " +
                        "TV{production='Philips', modelName='5E', year=2021, diagonal=40.0, price=400.0}, " +
                        "TV{production='Sony', modelName='1A', year=2017, diagonal=20.3, price=500.0}, " +
                        "TV{production='Sony', modelName='6F', year=2017, diagonal=30.9, price=500.0}, " +
                        "TV{production='LG', modelName='2B', year=2018, diagonal=30.6, price=700.0}, " +
                        "TV{production='Samsung', modelName='3C', year=2019, diagonal=40.0, price=1000.0}]]",
                Collections.singletonList(tvUtility.sortedByPriceAscending()).toString());
    }

    @Test
    void sortedByPriceDescending() {
        assertEquals(
                "[[TV{production='Samsung', modelName='3C', year=2019, diagonal=40.0, price=1000.0}, " +
                        "TV{production='LG', modelName='2B', year=2018, diagonal=30.6, price=700.0}, " +
                        "TV{production='Sony', modelName='1A', year=2017, diagonal=20.3, price=500.0}, " +
                        "TV{production='Sony', modelName='6F', year=2017, diagonal=30.9, price=500.0}, " +
                        "TV{production='Philips', modelName='5E', year=2021, diagonal=40.0, price=400.0}, " +
                        "TV{production='Sony', modelName='8H', year=2019, diagonal=50.4, price=300.0}, " +
                        "TV{production='Panasonic', modelName='4D', year=2020, diagonal=50.0, price=200.0}, " +
                        "TV{production='LG', modelName='7G', year=2018, diagonal=20.8, price=100.0}]]",
                Collections.singletonList(tvUtility.sortedByPriceDescending()).toString());
    }

    @Test
    void sortedByDiagonalAscending() {
        assertEquals(
                "[[TV{production='Sony', modelName='1A', year=2017, diagonal=20.3, price=500.0}, " +
                        "TV{production='LG', modelName='7G', year=2018, diagonal=20.8, price=100.0}, " +
                        "TV{production='LG', modelName='2B', year=2018, diagonal=30.6, price=700.0}, " +
                        "TV{production='Sony', modelName='6F', year=2017, diagonal=30.9, price=500.0}, " +
                        "TV{production='Samsung', modelName='3C', year=2019, diagonal=40.0, price=1000.0}, " +
                        "TV{production='Philips', modelName='5E', year=2021, diagonal=40.0, price=400.0}, " +
                        "TV{production='Panasonic', modelName='4D', year=2020, diagonal=50.0, price=200.0}, " +
                        "TV{production='Sony', modelName='8H', year=2019, diagonal=50.4, price=300.0}]]",
                Collections.singletonList(tvUtility.sortedByDiagonalAscending()).toString());
    }

    @Test
    void sortedByDiagonalDescending() {
        assertEquals(
                "[[TV{production='Sony', modelName='8H', year=2019, diagonal=50.4, price=300.0}, " +
                        "TV{production='Panasonic', modelName='4D', year=2020, diagonal=50.0, price=200.0}, " +
                        "TV{production='Samsung', modelName='3C', year=2019, diagonal=40.0, price=1000.0}, " +
                        "TV{production='Philips', modelName='5E', year=2021, diagonal=40.0, price=400.0}, " +
                        "TV{production='Sony', modelName='6F', year=2017, diagonal=30.9, price=500.0}, " +
                        "TV{production='LG', modelName='2B', year=2018, diagonal=30.6, price=700.0}, " +
                        "TV{production='LG', modelName='7G', year=2018, diagonal=20.8, price=100.0}, " +
                        "TV{production='Sony', modelName='1A', year=2017, diagonal=20.3, price=500.0}]]",
                Collections.singletonList(tvUtility.sortedByDiagonalDescending()).toString());
    }
}
