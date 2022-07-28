package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TvSellerTest {
    private TvSeller tvSeller = new TvSeller();
    private Tv tvSamsung1 = new Tv("Samsung", "23A", 2022, 55, 1005.00F);
    private Tv tvSamsung2 = new Tv("Samsung", "25A", 2022, 50, 905.00F);
    private Tv tvSony1 = new Tv("Sony", "XX", 2021, 50, 1300.00F);
    private Tv tvLG1 = new Tv("LG", "R15", 2022, 49, 1100.00F);
    private Tv tvLG2 = new Tv("LG", "R20", 2020, 35, 600.00F);
    private List<Tv> tvs = new ArrayList<>(Arrays.asList(tvSamsung1, tvSamsung2, tvLG1, tvLG2, tvSony1, tvSamsung2));

    @Test
    public void testGetTvsOfSpecificDiagonal() {
        List<Tv> expected = List.of(tvSamsung2, tvSony1, tvSamsung2);

        List<Tv> actual = tvSeller.getTvsOfSpecificDiagonal(tvs, 50);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetTvsOfSpecificManufacturer() {
        List<Tv> expected = List.of(tvSamsung1, tvSamsung2, tvSamsung2);

        List<Tv> actual = tvSeller.getTvsOfSpecificManufacturer(tvs, "samsung");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetTvsNotOlderThanSpecificYearOfProduction() {
        List<Tv> expected = List.of(tvSamsung1, tvSamsung2, tvLG1, tvSamsung2);

        List<Tv> actual = tvSeller.getTvsNotOlderThanSpecificYearOfProduction(tvs, 2022);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetTvsOfPriceRange() {
        List<Tv> expected = List.of(tvSamsung1, tvSamsung2, tvSamsung2);

        List<Tv> actual = tvSeller.getTvsOfPriceRange(tvs, 900, 1050);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetSortedByPriceAscending() {
        List<Tv> expected = List.of(tvLG2, tvSamsung2, tvSamsung2, tvSamsung1, tvLG1, tvSony1);

        List<Tv> actual = tvSeller.getSortedByPrice(tvs, true);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetSortedByPriceNotAscending() {
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
    public void testGetSortedBDiagonalNotAscending() {
        List<Tv> expected = List.of(tvSamsung1, tvSamsung2, tvSony1, tvSamsung2, tvLG1, tvLG2);

        List<Tv> actual = tvSeller.getSortedByDiagonal(tvs, false);

        Assertions.assertEquals(expected, actual);
    }
}
