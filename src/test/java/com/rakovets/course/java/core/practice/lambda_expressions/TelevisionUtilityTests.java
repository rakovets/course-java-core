package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.project_tv.Television;
import com.rakovets.course.java.core.practice.lambda_expressions.project_tv.TelevisionUtility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TelevisionUtilityTests {
    TelevisionUtility televisionUtility = new TelevisionUtility();
    Comparator<Television> comparator = Comparator.comparing(Television::toString);
    List<Television> televisionListActual = new ArrayList<>(List.of(
            new Television("Samsung", "111", 2020, 50, 1105.5),
            new Television("Samsung", "112", 2021, 55, 1505.0),
            new Television("Samsung", "113", 2022, 55, 1805.2),
            new Television("Samsung", "114", 2019, 60, 1550.8),
            new Television("LG", "211", 2020, 40, 750.9),
            new Television("LG", "212", 2020, 50, 1225.0),
            new Television("LG", "213", 2021, 60, 1505.0),
            new Television("LG", "214", 2019, 60, 1705.0),
            new Television("LG", "215", 2022, 70, 2205.0),
            new Television("Philips", "311", 2019, 40, 605.0),
            new Television("Philips", "312", 2020, 50, 1255.0),
            new Television("Philips", "313", 2022, 80, 2205.0),
            new Television("Sony", "411", 2022, 80, 3205.0)
    ));

    @Test
    public void testGetTelevisionByDiagonal() {
        List<Television> televisionsActual = televisionUtility.getTelevisionByDiagonal(televisionListActual, 50);
        Television[] arrayActual = new Television[televisionsActual.size()];
        televisionsActual.toArray(arrayActual);

        List<Television> televisionsExpected = new ArrayList<>(List.of(
                new Television("Samsung", "111", 2020, 50, 1105.5),
                new Television("LG", "212", 2020, 50, 1225.0),
                new Television("Philips", "312", 2020, 50, 1255.0)
        ));
        Television[] arrayExpected = new Television[televisionsExpected.size()];
        televisionsActual.toArray(arrayExpected);

        Assertions.assertEquals(0, Arrays.compare(arrayExpected, arrayActual, comparator));
    }

    @Test
    public void testGetTelevisionByProducerCompany() {
        List<Television> televisionsActual = televisionUtility.getTelevisionByProducerCompany(televisionListActual, "Philips");
        Television[] arrayActual = new Television[televisionsActual.size()];
        televisionsActual.toArray(arrayActual);

        List<Television> televisionsExpected = new ArrayList<>(List.of(
                new Television("Philips", "311", 2019, 40, 605.0),
                new Television("Philips", "312", 2020, 50, 1255.0),
                new Television("Philips", "313", 2022, 80, 2205.0)
        ));
        Television[] arrayExpected = new Television[televisionsExpected.size()];
        televisionsActual.toArray(arrayExpected);

        Assertions.assertEquals(0, Arrays.compare(arrayExpected, arrayActual, ((o1, o2) -> o1.toString().compareTo(o2.toString()))));
    }

    @Test
    public void testGetTelevisionByYearOfProduction() {
        List<Television> televisionsActual = televisionUtility.getTelevisionByYearOfProduction(televisionListActual, 2022);
        Television[] arrayActual = new Television[televisionsActual.size()];
        televisionsActual.toArray(arrayActual);

        List<Television> televisionsExpected = new ArrayList<>(List.of(
                new Television("Samsung", "113", 2022, 55, 1805.2),
                new Television("LG", "215", 2022, 70, 2205.0),
                new Television("Philips", "313", 2022, 80, 2205.0),
                new Television("Sony", "411", 2022, 80, 3205.0)
        ));
        Television[] arrayExpected = new Television[televisionsExpected.size()];
        televisionsActual.toArray(arrayExpected);

        Assertions.assertEquals(0, Arrays.compare(arrayExpected, arrayActual, Comparator.comparing(Television::toString)));
    }

    @Test
    public void testGetTelevisionBypPriceRange() {
        List<Television> televisionsActual = televisionUtility.getTelevisionBypPriceRange(televisionListActual, 1400, 1700);
        Television[] arrayActual = new Television[televisionsActual.size()];
        televisionsActual.toArray(arrayActual);

        List<Television> televisionListExpected = new ArrayList<>(List.of(
                new Television("Samsung", "112", 2021, 55, 1505.0),
                new Television("Samsung", "114", 2019, 60, 1550.8),
                new Television("LG", "213", 2021, 60, 1505.0)
        ));
        Television[] arrayExpected = new Television[televisionListExpected.size()];
        televisionsActual.toArray(arrayExpected);

        Assertions.assertEquals(0, Arrays.compare(arrayExpected, arrayActual, comparator));
    }

    @Test
    public void testSortTelevisionBypPriceUp() {
        List<Television> televisionsActual = televisionUtility.sortTelevisionBypPriceUp(televisionListActual);
        Television[] arrayActual = new Television[televisionsActual.size()];
        televisionsActual.toArray(arrayActual);

        List<Television> televisionListExpected = new ArrayList<>(List.of(
                new Television("Philips", "311", 2019, 40, 605.0),
                new Television("LG", "211", 2020, 40, 750.9),
                new Television("Samsung", "111", 2020, 50, 1105.5),
                new Television("LG", "212", 2020, 50, 1225.0),
                new Television("Philips", "312", 2020, 50, 1255.0),
                new Television("Samsung", "112", 2021, 55, 1505.0),
                new Television("LG", "213", 2021, 60, 1505.0),
                new Television("Samsung", "114", 2019, 60, 1550.8),
                new Television("LG", "214", 2019, 60, 1705.0),
                new Television("Samsung", "113", 2022, 55, 1805.2),
                new Television("LG", "215", 2022, 70, 2205.0),
                new Television("Philips", "313", 2022, 80, 2205.0),
                new Television("Sony", "411", 2022, 80, 3205.0)
        ));
        Television[] arrayExpected = new Television[televisionListExpected.size()];
        televisionsActual.toArray(arrayExpected);

        Assertions.assertEquals(0, Arrays.compare(arrayExpected, arrayActual, comparator));
    }

    @Test
    public void testSortTelevisionBypPriceDown() {
        List<Television> televisionsActual = televisionUtility.sortTelevisionBypPriceDown(televisionListActual);
        Television[] arrayActual = new Television[televisionsActual.size()];
        televisionsActual.toArray(arrayActual);

        List<Television> televisionListExpected = new ArrayList<>(List.of(
                new Television("Sony", "411", 2022, 80, 3205.0),
                new Television("Philips", "313", 2022, 80, 2205.0),
                new Television("LG", "215", 2022, 70, 2205.0),
                new Television("Samsung", "113", 2022, 55, 1805.2),
                new Television("LG", "214", 2019, 60, 1705.0),
                new Television("Samsung", "114", 2019, 60, 1550.8),
                new Television("LG", "213", 2021, 60, 1505.0),
                new Television("Samsung", "112", 2021, 55, 1505.0),
                new Television("Philips", "312", 2020, 50, 1255.0),
                new Television("LG", "212", 2020, 50, 1225.0),
                new Television("Samsung", "111", 2020, 50, 1105.5),
                new Television("LG", "211", 2020, 40, 750.9),
                new Television("Philips", "311", 2019, 40, 605.0)
        ));
        Television[] arrayExpected = new Television[televisionListExpected.size()];
        televisionsActual.toArray(arrayExpected);

        Assertions.assertEquals(0, Arrays.compare(arrayExpected, arrayActual, comparator));
    }

    @Test
    public void testSortTelevisionBypDiagonalUp() {
        List<Television> televisionsActual = televisionUtility.sortTelevisionBypDiagonalUp(televisionListActual);
        Television[] arrayActual = new Television[televisionsActual.size()];
        televisionsActual.toArray(arrayActual);

        List<Television> televisionListExpected = new ArrayList<>(List.of(
                new Television("LG", "211", 2020, 40, 750.9),
                new Television("Philips", "311", 2019, 40, 605.0),
                new Television("Samsung", "111", 2020, 50, 1105.5),
                new Television("LG", "212", 2020, 50, 1225.0),
                new Television("Philips", "312", 2020, 50, 1255.0),
                new Television("Samsung", "112", 2021, 55, 1505.0),
                new Television("Samsung", "113", 2022, 55, 1805.2),
                new Television("Samsung", "114", 2019, 60, 1550.8),
                new Television("LG", "213", 2021, 60, 1505.0),
                new Television("LG", "214", 2019, 60, 1705.0),
                new Television("LG", "215", 2022, 70, 2205.0),
                new Television("Philips", "313", 2022, 80, 2205.0),
                new Television("Sony", "411", 2022, 80, 3205.0)
        ));
        Television[] arrayExpected = new Television[televisionListExpected.size()];
        televisionsActual.toArray(arrayExpected);

        Assertions.assertEquals(0, Arrays.compare(arrayExpected, arrayActual, comparator));
    }

    @Test
    public void testSortTelevisionBypDiagonalDown() {
        List<Television> televisionsActual = televisionUtility.sortTelevisionBypDiagonalDown(televisionListActual);
        Television[] arrayActual = new Television[televisionsActual.size()];
        televisionsActual.toArray(arrayActual);

        List<Television> televisionListExpected = new ArrayList<>(List.of(
                new Television("Sony", "411", 2022, 80, 3205.0),
                new Television("Philips", "313", 2022, 80, 2205.0),
                new Television("LG", "215", 2022, 70, 2205.0),
                new Television("LG", "214", 2019, 60, 1705.0),
                new Television("LG", "213", 2021, 60, 1505.0),
                new Television("Samsung", "114", 2019, 60, 1550.8),
                new Television("Samsung", "113", 2022, 55, 1805.2),
                new Television("Samsung", "112", 2021, 55, 1505.0),
                new Television("Philips", "312", 2020, 50, 1255.0),
                new Television("LG", "212", 2020, 50, 1225.0),
                new Television("Samsung", "111", 2020, 50, 1105.5),
                new Television("Philips", "311", 2019, 40, 605.0),
                new Television("LG", "211", 2020, 40, 750.9)
        ));
        Television[] arrayExpected = new Television[televisionListExpected.size()];
        televisionsActual.toArray(arrayExpected);

        Assertions.assertEquals(0, Arrays.compare(arrayExpected, arrayActual, comparator));
    }
}
