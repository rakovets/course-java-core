package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TVutilityTest {

    @Test
    void getListOfDiagonal() {
        TV tv1 = new TV("Samsung", "DXZ", 2020, 45, 1100.0);
        TV tv2 = new TV("Philips", "mcf", 2015, 36, 560.0);
        TV tv3 = new TV("LG", "bhj", 2019, 52, 930.5);
        TV tv4 = new TV("Samsung", "DXZ", 2020, 36, 1100.0);
        List<TV> tvList = new LinkedList<>();
        tvList.add(tv1);
        tvList.add(tv2);
        tvList.add(tv3);
        tvList.add(tv4);
        TVutility tv = new TVutility(tvList);
        List<TV> expected = new LinkedList<>();
        expected.add(tv2);
        expected.add(tv4);

        List<TV> actual = tv.getListOfDiagonal(36);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetListOfManufacturer() {
        TV tv1 = new TV("Samsung", "DXZ", 2020, 45, 1100.0);
        TV tv2 = new TV("Philips", "mcf", 2015, 36, 560.0);
        TV tv3 = new TV("LG", "bhj", 2019, 52, 930.5);
        TV tv4 = new TV("Samsung", "MDXZ", 2018, 42, 1050.0);
        List<TV> tvList = new LinkedList<>();
        tvList.add(tv1);
        tvList.add(tv2);
        tvList.add(tv3);
        tvList.add(tv4);
        TVutility tv = new TVutility(tvList);
        List<TV> expected = new LinkedList<>();
        expected.add(tv1);
        expected.add(tv4);

        List<TV> actual = tv.getListOfManufacturer("Samsung");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getListOfYear() {
        TV tv1 = new TV("Samsung", "DXZ", 2020, 45, 1100.0);
        TV tv2 = new TV("Philips", "mcf", 2015, 36, 560.0);
        TV tv3 = new TV("LG", "bhj", 2019, 52, 930.5);
        TV tv4 = new TV("Samsung", "MDXZ", 2018, 42, 1050.0);
        List<TV> tvList = new LinkedList<>();
        tvList.add(tv1);
        tvList.add(tv2);
        tvList.add(tv3);
        tvList.add(tv4);
        TVutility tv = new TVutility(tvList);
        List<TV> expected = new LinkedList<>();
        expected.add(tv1);
        expected.add(tv3);

        List<TV> actual = tv.getListOfYear(2019);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getListOfPrice() {
        TV tv1 = new TV("Samsung", "DXZ", 2020, 45, 1100.0);
        TV tv2 = new TV("Philips", "mcf", 2015, 36, 560.0);
        TV tv3 = new TV("LG", "bhj", 2019, 52, 930.5);
        TV tv4 = new TV("Samsung", "MDXZ", 2018, 42, 1050.0);
        List<TV> tvList = new LinkedList<>();
        tvList.add(tv1);
        tvList.add(tv2);
        tvList.add(tv3);
        tvList.add(tv4);
        TVutility tv = new TVutility(tvList);
        List<TV> expected = new LinkedList<>();
        expected.add(tv1);
        expected.add(tv4);

        List<TV> actual = tv.getListOfPrice(940.0, 2000.0);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getSortUpListOfPrice() {
        TV tv1 = new TV("Samsung", "DXZ", 2020, 45, 1100.0);
        TV tv2 = new TV("Philips", "mcf", 2015, 36, 560.0);
        TV tv3 = new TV("LG", "bhj", 2019, 52, 930.5);
        TV tv4 = new TV("Samsung", "MDXZ", 2018, 42, 1050.0);
        List<TV> tvList = new LinkedList<>();
        tvList.add(tv1);
        tvList.add(tv2);
        tvList.add(tv3);
        tvList.add(tv4);
        TVutility tv = new TVutility(tvList);
        List<TV> expected = new LinkedList<>();
        expected.add(tv2);
        expected.add(tv3);
        expected.add(tv4);
        expected.add(tv1);

        List<TV> actual = tv.getSortUpListOfPrice();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getSortDownListOfPrice() {
        TV tv1 = new TV("Samsung", "DXZ", 2020, 45, 1100.0);
        TV tv2 = new TV("Philips", "mcf", 2015, 36, 560.0);
        TV tv3 = new TV("LG", "bhj", 2019, 52, 930.5);
        TV tv4 = new TV("Samsung", "MDXZ", 2018, 42, 1050.0);
        List<TV> tvList = new LinkedList<>();
        tvList.add(tv1);
        tvList.add(tv2);
        tvList.add(tv3);
        tvList.add(tv4);
        TVutility tv = new TVutility(tvList);
        List<TV> expected = new LinkedList<>();
        expected.add(tv1);
        expected.add(tv4);
        expected.add(tv3);
        expected.add(tv2);

        List<TV> actual = tv.getSortDownListOfPrice();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getSortUpListOfDiagonal() {
        TV tv1 = new TV("Samsung", "DXZ", 2020, 45, 1100.0);
        TV tv2 = new TV("Philips", "mcf", 2015, 36, 560.0);
        TV tv3 = new TV("LG", "bhj", 2019, 52, 930.5);
        TV tv4 = new TV("Samsung", "MDXZ", 2018, 42, 1050.0);
        List<TV> tvList = new LinkedList<>();
        tvList.add(tv1);
        tvList.add(tv2);
        tvList.add(tv3);
        tvList.add(tv4);
        TVutility tv = new TVutility(tvList);
        List<TV> expected = new LinkedList<>();
        expected.add(tv2);
        expected.add(tv4);
        expected.add(tv1);
        expected.add(tv3);

        List<TV> actual = tv.getSortUpListOfDiagonal();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getSortDownListOfDiagonal() {
        TV tv1 = new TV("Samsung", "DXZ", 2020, 45, 1100.0);
        TV tv2 = new TV("Philips", "mcf", 2015, 36, 560.0);
        TV tv3 = new TV("LG", "bhj", 2019, 52, 930.5);
        TV tv4 = new TV("Samsung", "MDXZ", 2018, 42, 1050.0);
        List<TV> tvList = new LinkedList<>();
        tvList.add(tv1);
        tvList.add(tv2);
        tvList.add(tv3);
        tvList.add(tv4);
        TVutility tv = new TVutility(tvList);
        List<TV> expected = new LinkedList<>();
        expected.add(tv3);
        expected.add(tv1);
        expected.add(tv4);
        expected.add(tv2);

        List<TV> actual = tv.getSortDownListOfDiagonal();

        Assertions.assertEquals(expected, actual);
    }
}
