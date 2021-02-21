package com.rakovets.course.java.core.practice.lambda_expressions.project_tv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class TVTest {

    @Test
    void getTvWithDiagonal() {
        //Given
        List<TVitem> tvList = new ArrayList<>();
        tvList.add(new TVitem("Samsung", "k50", 2017, 50, 1400));
        tvList.add(new TVitem("Samsung", "k62", 2016, 62, 1600));
        tvList.add(new TVitem("Samsung", "k40", 2012, 40, 1200));
        tvList.add(new TVitem("Sony", "f62", 2015, 62, 1100));
        tvList.add(new TVitem("Sony", "x52", 2014, 52, 1500));
        tvList.add(new TVitem("Philips", "fgf92", 2021, 92, 3900));
        List<TVitem> expectedResult = new ArrayList<>();
        expectedResult.add(new TVitem("Samsung", "k62", 2016, 62, 1600));
        expectedResult.add(new TVitem("Sony", "f62", 2015, 62, 1100));

        //When
        List<TVitem> actualResult = TV.getTvWithDiagonal(tvList, 62);

        //Than
        Assertions.assertEquals(expectedResult.toString(), actualResult.toString());
    }

    @Test
    void getTvWithBrand() {
        //Given
        List<TVitem> tvList = new ArrayList<>();
        tvList.add(new TVitem("Samsung", "k50", 2017, 50, 1400));
        tvList.add(new TVitem("Samsung", "k62", 2016, 62, 1600));
        tvList.add(new TVitem("Samsung", "k40", 2012, 40, 1200));
        tvList.add(new TVitem("Sony", "f62", 2015, 62, 1100));
        tvList.add(new TVitem("Sony", "x52", 2014, 52, 1500));
        tvList.add(new TVitem("Philips", "fgf92", 2021, 92, 3900));
        List<TVitem> expectedResult = new ArrayList<>();
        expectedResult.add(new TVitem("Sony", "f62", 2015, 62, 1100));
        expectedResult.add(new TVitem("Sony", "x52", 2014, 52, 1500));

        //When
        List<TVitem> actualResult = TV.getTvWithBrand(tvList, "Sony");

        //Than
        Assertions.assertEquals(expectedResult.toString(), actualResult.toString());
    }

    @Test
    void getTvWithNotOlderYear() {
        //Given
        List<TVitem> tvList = new ArrayList<>();
        tvList.add(new TVitem("Samsung", "k50", 2017, 50, 1400));
        tvList.add(new TVitem("Samsung", "k62", 2016, 62, 1600));
        tvList.add(new TVitem("Samsung", "k40", 2012, 40, 1200));
        tvList.add(new TVitem("Sony", "f62", 2015, 62, 1100));
        tvList.add(new TVitem("Sony", "x52", 2014, 52, 1500));
        tvList.add(new TVitem("Philips", "fgf92", 2021, 92, 3900));
        List<TVitem> expectedResult = new ArrayList<>();
        expectedResult.add(new TVitem("Samsung", "k50", 2017, 50, 1400));
        expectedResult.add(new TVitem("Samsung", "k62", 2016, 62, 1600));
        expectedResult.add(new TVitem("Sony", "f62", 2015, 62, 1100));
        expectedResult.add(new TVitem("Philips", "fgf92", 2021, 92, 3900));


        //When
        List<TVitem> actualResult = TV.getTvWithNotOlderYear(tvList, 2015);

        //Than
        Assertions.assertEquals(expectedResult.toString(), actualResult.toString());
    }

    @Test
    void getTvWithPriceRange() {
        //Given
        List<TVitem> tvList = new ArrayList<>();
        tvList.add(new TVitem("Samsung", "k50", 2017, 50, 900));
        tvList.add(new TVitem("Samsung", "k62", 2016, 62, 1200));
        tvList.add(new TVitem("Samsung", "k40", 2012, 40, 1200));
        tvList.add(new TVitem("Sony", "f62", 2015, 62, 1100));
        tvList.add(new TVitem("Sony", "x52", 2014, 52, 2100));
        tvList.add(new TVitem("Philips", "fgf92", 2021, 92, 3900));
        List<TVitem> expectedResult = new ArrayList<>();
        expectedResult.add(new TVitem("Samsung", "k62", 2016, 62, 1200));
        expectedResult.add(new TVitem("Samsung", "k40", 2012, 40, 1200));
        expectedResult.add(new TVitem("Sony", "f62", 2015, 62, 1100));

        //When
        List<TVitem> actualResult = TV.getTvWithPriceRange(tvList, 1000, 2000);

        //Than
        Assertions.assertEquals(expectedResult.toString(), actualResult.toString());
    }

    @Test
    void sortTvWithPriceAscendTrue() {
        //Given
        List<TVitem> tvList = new ArrayList<>();
        tvList.add(new TVitem("Sony", "f62", 2015, 62, 1100));
        tvList.add(new TVitem("Philips", "fgf92", 2021, 92, 3900));
        tvList.add(new TVitem("Samsung", "k50", 2017, 50, 900));
        List<TVitem> expectedResult = new ArrayList<>();
        expectedResult.add(new TVitem("Samsung", "k50", 2017, 50, 900));
        expectedResult.add(new TVitem("Sony", "f62", 2015, 62, 1100));
        expectedResult.add(new TVitem("Philips", "fgf92", 2021, 92, 3900));
        //When
        List<TVitem> actualResult = TV.sortTvWithPrice(tvList, true);

        //Than
        Assertions.assertEquals(expectedResult.toString(), actualResult.toString());
    }

    @Test
    void sortTvWithPriceAscendFalse() {
        //Given
        List<TVitem> tvList = new ArrayList<>();
        tvList.add(new TVitem("Sony", "f62", 2015, 62, 1100));
        tvList.add(new TVitem("Philips", "fgf92", 2021, 92, 3900));
        tvList.add(new TVitem("Samsung", "k50", 2017, 50, 900));
        List<TVitem> expectedResult = new ArrayList<>();
        expectedResult.add(new TVitem("Philips", "fgf92", 2021, 92, 3900));
        expectedResult.add(new TVitem("Sony", "f62", 2015, 62, 1100));
        expectedResult.add(new TVitem("Samsung", "k50", 2017, 50, 900));
        //When
        List<TVitem> actualResult = TV.sortTvWithPrice(tvList, false);

        //Than
        Assertions.assertEquals(expectedResult.toString(), actualResult.toString());
    }

    @Test
    void sortTvWithDiagonalAscendTrue() {
        //Given
        List<TVitem> tvList = new ArrayList<>();
        tvList.add(new TVitem("Sony", "f62", 2015, 62, 1100));
        tvList.add(new TVitem("Philips", "fgf40", 2015, 40, 1900));
        tvList.add(new TVitem("Samsung", "k50", 2017, 50, 900));
        List<TVitem> expectedResult = new ArrayList<>();
        expectedResult.add(new TVitem("Philips", "fgf40", 2015, 40, 1900));
        expectedResult.add(new TVitem("Samsung", "k50", 2017, 50, 900));
        expectedResult.add(new TVitem("Sony", "f62", 2015, 62, 1100));

        //When
        List<TVitem> actualResult = TV.sortTvWithDiagonal(tvList, true);

        //Than
        Assertions.assertEquals(expectedResult.toString(), actualResult.toString());
    }

    @Test
    void sortTvWithDiagonalAscendFalse() {
        //Given
        List<TVitem> tvList = new ArrayList<>();
        tvList.add(new TVitem("Sony", "f62", 2015, 62, 1100));
        tvList.add(new TVitem("Philips", "fgf40", 2015, 40, 1900));
        tvList.add(new TVitem("Samsung", "k50", 2017, 50, 900));
        List<TVitem> expectedResult = new ArrayList<>();
        expectedResult.add(new TVitem("Sony", "f62", 2015, 62, 1100));
        expectedResult.add(new TVitem("Samsung", "k50", 2017, 50, 900));
        expectedResult.add(new TVitem("Philips", "fgf40", 2015, 40, 1900));

        //When
        List<TVitem> actualResult = TV.sortTvWithDiagonal(tvList, false);

        //Than
        Assertions.assertEquals(expectedResult.toString(), actualResult.toString());
    }
}

