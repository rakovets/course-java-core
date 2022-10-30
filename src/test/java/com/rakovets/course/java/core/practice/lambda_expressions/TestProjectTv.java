package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.project_tv.Manufacturer;
import com.rakovets.course.java.core.practice.lambda_expressions.project_tv.ProjectTv;
import com.rakovets.course.java.core.practice.lambda_expressions.project_tv.Television;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestProjectTv {
    ProjectTv projectTv = new ProjectTv();
    List<Television> televisionList = new ArrayList<>(List.of(
            new Television(Manufacturer.SONY, "114l", 2020, 15, 2500),
            new Television(Manufacturer.SAMSUNG, "15l", 2019, 17, 3500),
            new Television(Manufacturer.SONY, "163ol", 2022, 20, 6500),
            new Television(Manufacturer.LG, "178o", 2019, 19, 1500),
            new Television(Manufacturer.PHILIPS, "1u4kl", 2020, 18, 2000),
            new Television(Manufacturer.SAMSUNG, "1ikl", 2018, 18, 2500)));

    @Test
    void testGetTvWithSpecialDiagonal() {
        int diagonal = 18;

        List<Television> actual = projectTv.getTvWithSpecialDiagonal(televisionList, diagonal);
        List<Television> expected = new ArrayList<>(List.of(
                new Television(Manufacturer.PHILIPS, "1u4kl", 2020, 18, 2000),
                new Television(Manufacturer.SAMSUNG, "1ikl", 2018, 18, 2500)));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetTvOfSpecialManufacturer() {
        Manufacturer manufacturer = Manufacturer.SONY;

        List<Television> actual = projectTv.getTvOfSpecialManufacturer(televisionList, manufacturer);
        List<Television> expected = new ArrayList<>(List.of(
                new Television(Manufacturer.SONY, "114l", 2020, 15, 2500),
                new Television(Manufacturer.SONY, "163ol", 2022, 20, 6500)));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetTvUnderYear() {
        int year = 2020;

        List<Television> actual = projectTv.getTvUnderYear(televisionList, year);
        List<Television> expected = new ArrayList<>(List.of(
                new Television(Manufacturer.SONY, "114l", 2020, 15, 2500),
                new Television(Manufacturer.SONY, "163ol", 2022, 20, 6500),
                new Television(Manufacturer.PHILIPS, "1u4kl", 2020, 18, 2000)));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetTvInDiapasonPrice() {
        int lowerPrice = 2000;
        int higherPrice = 4000;

        List<Television> actual = projectTv.getTvInDiapasonPrice(televisionList, lowerPrice, higherPrice);
        List<Television> expected = new ArrayList<>(List.of(
                new Television(Manufacturer.SONY, "114l", 2020, 15, 2500),
                new Television(Manufacturer.SAMSUNG, "15l", 2019, 17, 3500),
                new Television(Manufacturer.PHILIPS, "1u4kl", 2020, 18, 2000),
                new Television(Manufacturer.SAMSUNG, "1ikl", 2018, 18, 2500)));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetTvSortByPriceAscending() {
        List<Television> actual = projectTv.getTvSortByPriceAscending(televisionList);
        List<Television> expected = new ArrayList<>(List.of(
                new Television(Manufacturer.LG, "178o", 2019, 19, 1500),
                new Television(Manufacturer.PHILIPS, "1u4kl", 2020, 18, 2000),
                new Television(Manufacturer.SONY, "114l", 2020, 15, 2500),
                new Television(Manufacturer.SAMSUNG, "1ikl", 2018, 18, 2500),
                new Television(Manufacturer.SAMSUNG, "15l", 2019, 17, 3500),
                new Television(Manufacturer.SONY, "163ol", 2022, 20, 6500)));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetTvSortByPriceDescending() {
        List<Television> actual = projectTv.getTvSortByPriceDescending(televisionList);
        List<Television> expected = new ArrayList<>(List.of(
                new Television(Manufacturer.SONY, "163ol", 2022, 20, 6500),
                new Television(Manufacturer.SAMSUNG, "15l", 2019, 17, 3500),
                new Television(Manufacturer.SONY, "114l", 2020, 15, 2500),
                new Television(Manufacturer.SAMSUNG, "1ikl", 2018, 18, 2500),
                new Television(Manufacturer.PHILIPS, "1u4kl", 2020, 18, 2000),
                new Television(Manufacturer.LG, "178o", 2019, 19, 1500)));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetTvSortByDiagonalAscending() {
        List<Television> actual = projectTv.getTvSortByDiagonalAscending(televisionList);
        List<Television> expected = new ArrayList<>(List.of(
                new Television(Manufacturer.SONY, "114l", 2020, 15, 2500),
                new Television(Manufacturer.SAMSUNG, "15l", 2019, 17, 3500),
                new Television(Manufacturer.PHILIPS, "1u4kl", 2020, 18, 2000),
                new Television(Manufacturer.SAMSUNG, "1ikl", 2018, 18, 2500),
                new Television(Manufacturer.LG, "178o", 2019, 19, 1500),
                new Television(Manufacturer.SONY, "163ol", 2022, 20, 6500)));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetTvSortByDiagonalDescending() {
        List<Television> actual = projectTv.getTvSortByDiagonalDescending(televisionList);
        List<Television> expected = new ArrayList<>(List.of(
                new Television(Manufacturer.SONY, "163ol", 2022, 20, 6500),
                new Television(Manufacturer.LG, "178o", 2019, 19, 1500),
                new Television(Manufacturer.PHILIPS, "1u4kl", 2020, 18, 2000),
                new Television(Manufacturer.SAMSUNG, "1ikl", 2018, 18, 2500),
                new Television(Manufacturer.SAMSUNG, "15l", 2019, 17, 3500),
                new Television(Manufacturer.SONY, "114l", 2020, 15, 2500)));

        Assertions.assertEquals(expected, actual);
    }
}

