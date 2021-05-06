package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.TV.TV;
import com.rakovets.course.java.core.practice.lambda_expressions.TV.SorterForTV;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SorterForTVTest {
    @Test
    void getWithDiagonal() {
        // GIVEN
        List<TV> items = new ArrayList<>();
        Collections.addAll(items,
                new TV ("LG", "OLED", 2015, 55.5, 250.0),
                new TV ("LG", "OLED", 2020, 65.5, 375.5),
                new TV ("Philips", "55OLED805", 2017, 47.0, 300.0),
                new TV ("Sony", "LUX", 2021, 55.5, 550.0),
                new TV ("Samsung", "QE75Q950TS", 2020, 46.5, 450.7));

        List<TV> expectedList = new ArrayList<>();
        Collections.addAll(expectedList,
                new TV ("LG", "OLED", 2015, 55.5, 250.0),
                new TV ("Sony", "LUX", 2021, 55.5, 550.0));

        // WHEN
        List<TV> actualList = SorterForTV.getWithDiagonal(items, 55.5);

        // THEN
        Assertions.assertEquals(expectedList.toString(), actualList.toString());
    }

    @Test
    void getOfProducer() {
        // GIVEN
        List<TV> items = new ArrayList<>();
        Collections.addAll(items,
                new TV ("LG", "OLED", 2015, 55.5, 250.0),
                new TV ("LG", "OLED", 2020, 65.5, 375.5),
                new TV ("Philips", "55OLED805", 2017, 47.0, 300.0),
                new TV ("Sony", "LUX", 2021, 55.5, 550.0),
                new TV ("Samsung", "QE75Q950TS", 2020, 46.5, 450.7));

        List<TV> expectedList = new ArrayList<>();
        Collections.addAll(expectedList,
                new TV ("LG", "OLED", 2015, 55.5, 250.0),
                new TV ("LG", "OLED", 2020, 65.5, 375.5));

        // WHEN
        List<TV> actualList = SorterForTV.getOfProducer(items, "LG");

        // THEN
        Assertions.assertEquals(expectedList.toString(), actualList.toString());
    }

    @Test
    void getAfterProductionYear() {
        // GIVEN
        List<TV> items = new ArrayList<>();
        Collections.addAll(items,
                new TV ("LG", "OLED", 2015, 55.5, 250.0),
                new TV ("LG", "OLED", 2020, 65.5, 375.5),
                new TV ("Philips", "55OLED805", 2017, 47.0, 300.0),
                new TV ("Sony", "LUX", 2021, 55.5, 550.0),
                new TV ("Samsung", "QE75Q950TS", 2020, 46.5, 450.7));

        List<TV> expectedList = new ArrayList<>();
        Collections.addAll(expectedList,
                new TV ("LG", "OLED", 2020, 65.5, 375.5),
                new TV ("Sony", "LUX", 2021, 55.5, 550.0),
                new TV ("Samsung", "QE75Q950TS", 2020, 46.5, 450.7));

        // WHEN
        List<TV> actualList = SorterForTV.getAfterProductionYear(items, 2020);

        // THEN
        Assertions.assertEquals(expectedList.toString(), actualList.toString());
    }

    @Test
    void getPriceBetween() {
        // GIVEN
        List<TV> items = new ArrayList<>();
        Collections.addAll(items,
                new TV ("LG", "OLED", 2015, 55.5, 250.0),
                new TV ("LG", "OLED", 2020, 65.5, 375.5),
                new TV ("Philips", "55OLED805", 2017, 47.0, 300.0),
                new TV ("Sony", "LUX", 2021, 55.5, 550.0),
                new TV ("Samsung", "QE75Q950TS", 2020, 46.5, 450.7));

        List<TV> expectedList = new ArrayList<>();
        Collections.addAll(expectedList,
                new TV ("LG", "OLED", 2020, 65.5, 375.5),
                new TV ("Philips", "55OLED805", 2017, 47.0, 300.0),
                new TV ("Samsung", "QE75Q950TS", 2020, 46.5, 450.7));

        // WHEN
        List<TV> actualList = SorterForTV.getPriceBetween(items, 300.0, 500.0);

        // THEN
        Assertions.assertEquals(expectedList.toString(), actualList.toString());
    }

    @Test
    void getAscendingPrice() {
        // GIVEN
        List<TV> items = new ArrayList<>();
        Collections.addAll(items,
                new TV ("LG", "OLED", 2015, 55.5, 250.0),
                new TV ("LG", "OLED", 2020, 65.5, 375.5),
                new TV ("Philips", "55OLED805", 2017, 47.0, 300.0),
                new TV ("Sony", "LUX", 2021, 55.5, 550.0),
                new TV ("Samsung", "QE75Q950TS", 2020, 46.5, 450.7));

        List<TV> expectedList = new ArrayList<>();
        Collections.addAll(expectedList,
                new TV ("LG", "OLED", 2015, 55.5, 250.0),
                new TV ("Philips", "55OLED805", 2017, 47.0, 300.0),
                new TV ("LG", "OLED", 2020, 65.5, 375.5),
                new TV ("Samsung", "QE75Q950TS", 2020, 46.5, 450.7),
                new TV ("Sony", "LUX", 2021, 55.5, 550.0));

        // WHEN
        List<TV> actualList = SorterForTV.getAscendingPrice(items);

        // THEN
        Assertions.assertEquals(expectedList.toString(), actualList.toString());
    }

    @Test
    void getDescendingPrice() {
        // GIVEN
        List<TV> items = new ArrayList<>();
        Collections.addAll(items,
                new TV ("LG", "OLED", 2015, 55.5, 250.0),
                new TV ("LG", "OLED", 2020, 65.5, 375.5),
                new TV ("Philips", "55OLED805", 2017, 47.0, 300.0),
                new TV ("Sony", "LUX", 2021, 55.5, 550.0),
                new TV ("Samsung", "QE75Q950TS", 2020, 46.5, 450.7));

        List<TV> expectedList = new ArrayList<>();
        Collections.addAll(expectedList,
                new TV ("Sony", "LUX", 2021, 55.5, 550.0),
                new TV ("Samsung", "QE75Q950TS", 2020, 46.5, 450.7),
                new TV ("LG", "OLED", 2020, 65.5, 375.5),
                new TV ("Philips", "55OLED805", 2017, 47.0, 300.0),
                new TV ("LG", "OLED", 2015, 55.5, 250.0));

        // WHEN
        List<TV> actualList = SorterForTV.getDescendingPrice(items);

        // THEN
        Assertions.assertEquals(expectedList.toString(), actualList.toString());
    }

    @Test
    void getAscendingDiagonal() {
        // GIVEN
        List<TV> items = new ArrayList<>();
        Collections.addAll(items,
                new TV ("LG", "OLED", 2015, 52.5, 250.0),
                new TV ("LG", "OLED", 2020, 65.5, 375.5),
                new TV ("Philips", "55OLED805", 2017, 47.0, 300.0),
                new TV ("Sony", "LUX", 2021, 55.5, 550.0),
                new TV ("Samsung", "QE75Q950TS", 2020, 46.5, 450.7));

        List<TV> expectedList = new ArrayList<>();
        Collections.addAll(expectedList,
                new TV ("Samsung", "QE75Q950TS", 2020, 46.5, 450.7),
                new TV ("Philips", "55OLED805", 2017, 47.0, 300.0),
                new TV ("LG", "OLED", 2015, 52.5, 250.0),
                new TV ("Sony", "LUX", 2021, 55.5, 550.0),
                new TV ("LG", "OLED", 2020, 65.5, 375.5));

        // WHEN
        List<TV> actualList = SorterForTV.getAscendingDiagonal(items);

        // THEN
        Assertions.assertEquals(expectedList.toString(), actualList.toString());
    }

    @Test
    void getDescendingDiagonal() {
        // GIVEN
        List<TV> items = new ArrayList<>();
        Collections.addAll(items,
                new TV ("LG", "OLED", 2015, 52.5, 250.0),
                new TV ("LG", "OLED", 2020, 65.5, 375.5),
                new TV ("Philips", "55OLED805", 2017, 47.0, 300.0),
                new TV ("Sony", "LUX", 2021, 55.5, 550.0),
                new TV ("Samsung", "QE75Q950TS", 2020, 46.5, 450.7));

        List<TV> expectedList = new ArrayList<>();
        Collections.addAll(expectedList,
                new TV ("LG", "OLED", 2020, 65.5, 375.5),
                new TV ("Sony", "LUX", 2021, 55.5, 550.0),
                new TV ("LG", "OLED", 2015, 52.5, 250.0),
                new TV ("Philips", "55OLED805", 2017, 47.0, 300.0),
                new TV ("Samsung", "QE75Q950TS", 2020, 46.5, 450.7));

        // WHEN
        List<TV> actualList = SorterForTV.getDescendingDiagonal(items);

        // THEN
        Assertions.assertEquals(expectedList.toString(), actualList.toString());
    }
}
