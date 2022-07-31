package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TvSellerTest {
    private static TvSeller tvSeller;
    private static Tv tvSamsung1;
    private static Tv tvSamsung2;
    private static Tv tvSony1;
    private static Tv tvLG1;
    private static Tv tvLG2;
    private static List<Tv> tvs;

    @BeforeAll
    static void setUp() {
        tvSeller = new TvSeller();
        tvSamsung1 = new Tv("Samsung", "23A", 2022, 55, 1005);
        tvSamsung2 = new Tv("Samsung", "25A", 2022, 50, 905);
        tvSony1 = new Tv("Sony", "XX", 2021, 50, 1300);
        tvLG1 = new Tv("LG", "R15", 2022, 49, 1100);
        tvLG2 = new Tv("LG", "R20", 2020, 35, 600);
        tvs = new ArrayList<>(Arrays.asList(tvSamsung1, tvSamsung2, tvLG1, tvLG2, tvSony1, tvSamsung2));
    }

    @Test
    public void testGetTvsOfSpecificDiagonal() {
        List<Tv> expected = List.of(tvSamsung2, tvSony1, tvSamsung2);

        List<Tv> actual = tvSeller.getTvsOfSpecificDiagonal(tvs, 50);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetTvsOfSpecificDiagonalNoDiagonal() {
        List<Tv> expected = Collections.emptyList();

        List<Tv> actual = tvSeller.getTvsOfSpecificDiagonal(tvs, 1);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetTvsOfSpecificManufacturer() {
        List<Tv> expected = List.of(tvSamsung1, tvSamsung2, tvSamsung2);

        List<Tv> actual = tvSeller.getTvsOfSpecificManufacturerIgnoreCase(tvs, "samsung");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetTvsOfSpecificManufacturerCapitalLetter() {
        List<Tv> expected = List.of(tvSamsung1, tvSamsung2, tvSamsung2);

        List<Tv> actual = tvSeller.getTvsOfSpecificManufacturerIgnoreCase(tvs, "Samsung");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetTvsOfSpecificManufacturerNoManufacturer() {
        List<Tv> expected = Collections.emptyList();

        List<Tv> actual = tvSeller.getTvsOfSpecificManufacturerIgnoreCase(tvs, "aeg");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetTvsNotOlderThanSpecificYearOfProduction() {
        List<Tv> expected = List.of(tvSamsung1, tvSamsung2, tvLG1, tvSamsung2);

        List<Tv> actual = tvSeller.getTvsNotOlderThanSpecificYearOfProduction(tvs, 2022);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetTvsNotOlderThanSpecificYearOfProductionNoYear() {
        List<Tv> expected = Collections.emptyList();

        List<Tv> actual = tvSeller.getTvsNotOlderThanSpecificYearOfProduction(tvs, 2100);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetTvsOfPriceRange() {
        List<Tv> expected = List.of(tvSamsung1, tvSamsung2, tvSamsung2);

        List<Tv> actual = tvSeller.getTvsOfPriceRange(tvs, 900, 1050);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetTvsOfPriceRangeNoTvInThisRange() {
        List<Tv> expected = Collections.emptyList();

        List<Tv> actual = tvSeller.getTvsOfPriceRange(tvs, 300, 500);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetSortedByPriceAscending() {
        List<Tv> expected = List.of(tvLG2, tvSamsung2, tvSamsung2, tvSamsung1, tvLG1, tvSony1);

        List<Tv> actual = tvSeller.getSortedByPrice(tvs, true);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetSortedByPriceDescending() {
        List<Tv> expected = List.of(tvSony1, tvLG1, tvSamsung1, tvSamsung2, tvSamsung2, tvLG2);

        List<Tv> actual = tvSeller.getSortedByPrice(tvs, false);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetSortedByDiagonalAscending() {
        List<Tv> expected = List.of(tvLG2, tvLG1, tvSamsung2, tvSony1, tvSamsung2, tvSamsung1);

        List<Tv> actual = tvSeller.getSortedByDiagonal(tvs, true);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetSortedBDiagonalDescending() {
        List<Tv> expected = List.of(tvSamsung1, tvSamsung2, tvSony1, tvSamsung2, tvLG1, tvLG2);

        List<Tv> actual = tvSeller.getSortedByDiagonal(tvs, false);

        Assertions.assertEquals(expected, actual);
    }
}
