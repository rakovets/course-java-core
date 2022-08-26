package com.rakovets.course.java.core.practice.lambda_expressions.tv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class TvStoreTest {
    private static TvStore tvStore;
    private static Tv tv1;
    private static Tv tv2;
    private static Tv tv3;
    private static Tv tv4;
    private static Tv tv5;

    @BeforeAll
    static void setUp() {
        tv1 = new Tv("Samsung", "U855", 2022, 55, 1300);
        tv2 = new Tv("Samsung", "U950", 2022, 50, 1010);
        tv3 = new Tv("Sony", "S2150", 2021, 50, 980);
        tv4 = new Tv("LG", "L4922", 2022, 42, 850);
        tv5 = new Tv("LG", "L3520", 2020, 28, 545);
        List<Tv> tvDb = new ArrayList<>(Arrays.asList(tv1, tv2, tv3, tv4, tv5));
        tvStore = new TvStore(tvDb);
    }

    @Test
    void testGetTvByDiagonal() {
        List<Tv> expected = List.of(tv2, tv3);

        List<Tv> actual = tvStore.getTvByDiagonal(50);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetTvByDiagonalNoDiagonal() {
        List<Tv> expected = Collections.emptyList();

        List<Tv> actual = tvStore.getTvByDiagonal(65);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetTvByManufacturer() {
        List<Tv> expected = List.of(tv4, tv5);

        List<Tv> actual = tvStore.getTvByManufacturer("LG");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetTvByManufacturerIgnoreCase() {
        List<Tv> expected = List.of(tv4, tv5);

        List<Tv> actual = tvStore.getTvByManufacturer("lg");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetTvByManufacturerNoManufacturer() {
        List<Tv> expected = Collections.emptyList();

        List<Tv> actual = tvStore.getTvByManufacturer("TLC");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetTvNotOlderYear() {
        List<Tv> expected = List.of(tv1, tv2, tv4);

        List<Tv> actual = tvStore.getTvNotOlderYear(2022);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetTvNotOlderYearNoYear() {
        List<Tv> expected = Collections.emptyList();

        List<Tv> actual = tvStore.getTvNotOlderYear(2025);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetTvByPriceRange() {
        List<Tv> expected = List.of(tv4, tv5);

        List<Tv> actual = tvStore.getTvByPriceRange(500, 900);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetTvByPriceRangeNoTvInRange() {
        List<Tv> expected = Collections.emptyList();

        List<Tv> actual = tvStore.getTvByPriceRange(10, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetSortedTvByPriceAsc() {
        List<Tv> expected = List.of(tv5, tv4, tv3, tv2, tv1);

        List<Tv> actual = tvStore.getSortedTvByPriceAsc();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetSortedTvByPriceDesc() {
        List<Tv> expected = List.of(tv1, tv2, tv3, tv4, tv5);

        List<Tv> actual = tvStore.getSortedTvByPriceDesc();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetSortedTvByDiagonalAsc() {
        List<Tv> expected = List.of(tv5, tv4, tv2, tv3, tv1);

        List<Tv> actual = tvStore.getSortedTvByDiagonalAsc();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetSortedTvByDiagonalDesc() {
        List<Tv> expected = List.of(tv1, tv2, tv3, tv4, tv5);

        List<Tv> actual = tvStore.getSortedTvByDiagonalDesc();

        Assertions.assertEquals(expected, actual);
    }
}
