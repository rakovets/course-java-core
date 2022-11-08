package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.project_tv.Manufacturer;
import com.rakovets.course.java.core.practice.lambda_expressions.project_tv.ProjectTv;
import com.rakovets.course.java.core.practice.lambda_expressions.project_tv.Television;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestProjectTv {
    ProjectTv projectTv = new ProjectTv();
    List<Television> televisionList;
    Television sony20;
    Television samsung19;
    Television sony22;
    Television lg;
    Television philips;
    Television samsung18;

    @BeforeEach
    void setUp() {
        sony20 = new Television(Manufacturer.SONY, "114l", 2020, 15, 2500);
        samsung19 = new Television(Manufacturer.SAMSUNG, "15l", 2019, 17, 3500);
        sony22 = new Television(Manufacturer.SONY, "163ol", 2022, 20, 6500);
        lg = new Television(Manufacturer.LG, "178o", 2019, 19, 1500);
        philips = new Television(Manufacturer.PHILIPS, "1u4kl", 2020, 18, 2000);
        samsung18 = new Television(Manufacturer.SAMSUNG, "1ikl", 2018, 18, 2500);
        televisionList = new ArrayList<>(Arrays.asList(sony20, samsung19, sony22, lg, philips, samsung18));
    }

    @Test
    void testGetTvWithSpecialDiagonal() {
        int diagonal = 18;

        List<Television> actual = projectTv.getTvWithSpecialDiagonal(televisionList, diagonal);
        List<Television> expected = new ArrayList<>(Arrays.asList(philips, samsung18));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetTvOfSpecialManufacturer() {
        Manufacturer manufacturer = Manufacturer.SONY;

        List<Television> actual = projectTv.getTvOfSpecialManufacturer(televisionList, manufacturer);
        List<Television> expected = new ArrayList<>(Arrays.asList(sony20, sony22));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetTvUnderYear() {
        int year = 2020;

        List<Television> actual = projectTv.getTvUnderYear(televisionList, year);
        List<Television> expected = new ArrayList<>(Arrays.asList(sony20, sony22, philips));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetTvInDiapasonPrice() {
        int lowerPrice = 2000;
        int higherPrice = 4000;

        List<Television> actual = projectTv.getTvInDiapasonPrice(televisionList, lowerPrice, higherPrice);
        List<Television> expected = new ArrayList<>(Arrays.asList(sony20, samsung19, philips, samsung18));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetTvSortByPriceAscending() {
        List<Television> actual = projectTv.getTvSortByPriceAscending(televisionList);
        List<Television> expected = new ArrayList<>(Arrays.asList(lg, philips, sony20, samsung18, samsung19, sony22));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetTvSortByPriceDescending() {
        List<Television> actual = projectTv.getTvSortByPriceDescending(televisionList);
        List<Television> expected = new ArrayList<>(Arrays.asList(sony22, samsung19, sony20, samsung18, philips, lg));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetTvSortByDiagonalAscending() {
        List<Television> actual = projectTv.getTvSortByDiagonalAscending(televisionList);
        List<Television> expected = new ArrayList<>(Arrays.asList(sony20, samsung19, philips, samsung18, lg, sony22));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetTvSortByDiagonalDescending() {
        List<Television> actual = projectTv.getTvSortByDiagonalDescending(televisionList);
        List<Television> expected = new ArrayList<>(Arrays.asList(sony22, lg, philips, samsung18, samsung19, sony20));

        Assertions.assertEquals(expected, actual);
    }
}

