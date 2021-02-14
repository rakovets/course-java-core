package com.rakovets.course.java.core.practice.lambda_expressions.TV;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TVTest {

    List<TV> tv = Arrays.asList(
            new TV("Sony", "1A", 2017, 20, 500.0),
            new TV("LG", "2B", 2018, 30, 700.0),
            new TV("Samsung", "3C", 2019, 40, 1000.0),
            new TV("Panasonic", "4D", 2020, 50, 200.0),
            new TV("Philips", "5E", 2021, 40, 400.0),
            new TV("Sony", "6F", 2017, 30, 500.0),
            new TV("LG", "7G", 2018, 20, 100.0),
            new TV("Sony", "8H", 2019, 50, 300.0));

    TVUtilityClass tvUtilityClass = new TVUtilityClass(tv);

    @Test
    void specificDiagonal() {
        assertEquals(
                "[[TV{manufacturer='Samsung', model='3C', year=2019, diagonal=40, price=1000.0}, " +
                        "TV{manufacturer='Philips', model='5E', year=2021, diagonal=40, price=400.0}]]",
                Collections.singletonList(tvUtilityClass.specificDiagonal(40)).toString());
    }

    @Test
    void specificManufacturer() {
        assertEquals(
                "[[TV{manufacturer='Sony', model='1A', year=2017, diagonal=20, price=500.0}, " +
                        "TV{manufacturer='Sony', model='6F', year=2017, diagonal=30, price=500.0}, " +
                        "TV{manufacturer='Sony', model='8H', year=2019, diagonal=50, price=300.0}]]",
                Collections.singletonList(tvUtilityClass.specificManufacturer("Sony")).toString());
    }

    @Test
    void specificYear() {
        assertEquals(
                "[[TV{manufacturer='Samsung', model='3C', year=2019, diagonal=40, price=1000.0}, " +
                        "TV{manufacturer='Panasonic', model='4D', year=2020, diagonal=50, price=200.0}, " +
                        "TV{manufacturer='Philips', model='5E', year=2021, diagonal=40, price=400.0}, " +
                        "TV{manufacturer='Sony', model='8H', year=2019, diagonal=50, price=300.0}]]",
                Collections.singletonList(tvUtilityClass.specificYear(2019)).toString());
    }

    @Test
    void specificPrice() {
        assertEquals(
                "[[TV{manufacturer='Sony', model='1A', year=2017, diagonal=20, price=500.0}, " +
                        "TV{manufacturer='LG', model='2B', year=2018, diagonal=30, price=700.0}, " +
                        "TV{manufacturer='Sony', model='6F', year=2017, diagonal=30, price=500.0}]]",
                Collections.singletonList(tvUtilityClass.specificPrice(500.0, 800.0)).toString());
    }

    @Test
    void sortedByPriceAscending() {
        assertEquals(
                "[[TV{manufacturer='LG', model='7G', year=2018, diagonal=20, price=100.0}, " +
                        "TV{manufacturer='Panasonic', model='4D', year=2020, diagonal=50, price=200.0}, " +
                        "TV{manufacturer='Sony', model='8H', year=2019, diagonal=50, price=300.0}, " +
                        "TV{manufacturer='Philips', model='5E', year=2021, diagonal=40, price=400.0}, " +
                        "TV{manufacturer='Sony', model='1A', year=2017, diagonal=20, price=500.0}, " +
                        "TV{manufacturer='Sony', model='6F', year=2017, diagonal=30, price=500.0}, " +
                        "TV{manufacturer='LG', model='2B', year=2018, diagonal=30, price=700.0}, " +
                        "TV{manufacturer='Samsung', model='3C', year=2019, diagonal=40, price=1000.0}]]",
                Collections.singletonList(tvUtilityClass.sortedByPriceAscending()).toString());
    }

    @Test
    void sortedByPriceDescending() {
        assertEquals(
                "[[TV{manufacturer='Samsung', model='3C', year=2019, diagonal=40, price=1000.0}, " +
                        "TV{manufacturer='LG', model='2B', year=2018, diagonal=30, price=700.0}, " +
                        "TV{manufacturer='Sony', model='1A', year=2017, diagonal=20, price=500.0}, " +
                        "TV{manufacturer='Sony', model='6F', year=2017, diagonal=30, price=500.0}, " +
                        "TV{manufacturer='Philips', model='5E', year=2021, diagonal=40, price=400.0}, " +
                        "TV{manufacturer='Sony', model='8H', year=2019, diagonal=50, price=300.0}, " +
                        "TV{manufacturer='Panasonic', model='4D', year=2020, diagonal=50, price=200.0}, " +
                        "TV{manufacturer='LG', model='7G', year=2018, diagonal=20, price=100.0}]]",
                Collections.singletonList(tvUtilityClass.sortedByPriceDescending()).toString());
    }

    @Test
    void sortedByDiagonalAscending() {
        assertEquals(
                "[[TV{manufacturer='Sony', model='1A', year=2017, diagonal=20, price=500.0}, " +
                        "TV{manufacturer='LG', model='7G', year=2018, diagonal=20, price=100.0}, " +
                        "TV{manufacturer='LG', model='2B', year=2018, diagonal=30, price=700.0}, " +
                        "TV{manufacturer='Sony', model='6F', year=2017, diagonal=30, price=500.0}, " +
                        "TV{manufacturer='Samsung', model='3C', year=2019, diagonal=40, price=1000.0}, " +
                        "TV{manufacturer='Philips', model='5E', year=2021, diagonal=40, price=400.0}, " +
                        "TV{manufacturer='Panasonic', model='4D', year=2020, diagonal=50, price=200.0}, " +
                        "TV{manufacturer='Sony', model='8H', year=2019, diagonal=50, price=300.0}]]",
                Collections.singletonList(tvUtilityClass.sortedByDiagonalAscending()).toString());
    }

    @Test
    void sortedByDiagonalDescending() {
        assertEquals(
                "[[TV{manufacturer='Panasonic', model='4D', year=2020, diagonal=50, price=200.0}, " +
                        "TV{manufacturer='Sony', model='8H', year=2019, diagonal=50, price=300.0}, " +
                        "TV{manufacturer='Samsung', model='3C', year=2019, diagonal=40, price=1000.0}, " +
                        "TV{manufacturer='Philips', model='5E', year=2021, diagonal=40, price=400.0}, " +
                        "TV{manufacturer='LG', model='2B', year=2018, diagonal=30, price=700.0}, " +
                        "TV{manufacturer='Sony', model='6F', year=2017, diagonal=30, price=500.0}, " +
                        "TV{manufacturer='Sony', model='1A', year=2017, diagonal=20, price=500.0}, " +
                        "TV{manufacturer='LG', model='7G', year=2018, diagonal=20, price=100.0}]]",
                Collections.singletonList(tvUtilityClass.sortedByDiagonalDescending()).toString());
    }
}
