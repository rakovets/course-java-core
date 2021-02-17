package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TVTests {

    @Test
    void getDiagonal() {
        List<TV> list = new ArrayList<>();
        Collections.addAll(list,
                new TV("Samsung", "QE55Q90TAU", 2019, 55, 2000.0 ),
                new TV("KIVI", "65U710KB", 2018, 65, 859.0),
                new TV("Samsung", "UE50TU8000U", 2020, 50, 735.9),
                new TV("LG", "50NANO796NF", 2020, 50, 635.9),
                new TV(" Xiaomi", "MI TV 4S", 2021, 43, 439.9));

        List<TV> expectedResult = new ArrayList<>();
        Collections.addAll(expectedResult,
                new TV("Samsung", "UE50TU8000U", 2020, 50, 735.9),
                new TV("LG", "50NANO796NF", 2020, 50, 635.9));

        List<TV> actualResult = TVUtilities.getDiagonal(list, 50.0);

        Assertions.assertEquals(expectedResult.toString(), actualResult.toString());
    }

    @Test
    void getManufacturer(){
        List<TV> list = new ArrayList<>();
        Collections.addAll(list,
                new TV("Samsung", "QE55Q90TAU", 2019, 55, 2000.0 ),
                new TV("KIVI", "65U710KB", 2018, 65, 859.0),
                new TV("Samsung", "UE50TU8000U", 2020, 50, 735.9),
                new TV("LG", "50NANO796NF", 2020, 50, 635.9),
                new TV(" Xiaomi", "MI TV 4S", 2021, 43, 439.9));

        List<TV> expectedResult = new ArrayList<>();
        Collections.addAll(expectedResult,
                new TV("Samsung", "QE55Q90TAU", 2019, 55, 2000.0),
                new TV("Samsung", "UE50TU8000U", 2020, 50, 735.9));

        List<TV> actualResult = TVUtilities.getManufacturer(list, "Samsung");

        Assertions.assertEquals(expectedResult.toString(), actualResult.toString());
    }

    @Test
    void getProductionYear(){
        List<TV> list = new ArrayList<>();
        Collections.addAll(list,
                new TV("Samsung", "QE55Q90TAU", 2019, 55, 2000.0 ),
                new TV("KIVI", "65U710KB", 2018, 65, 859.0),
                new TV("Samsung", "UE50TU8000U", 2020, 50, 735.9),
                new TV("LG", "50NANO796NF", 2020, 50, 635.9),
                new TV(" Xiaomi", "MI TV 4S", 2021, 43, 439.9));

        List<TV> expectedResult = new ArrayList<>();
        Collections.addAll(expectedResult,
                new TV("KIVI", "65U710KB", 2018, 65, 859.0));

        List<TV> actualResult = TVUtilities.getProductionYear(list, 2018);

        Assertions.assertEquals(expectedResult.toString(), actualResult.toString());
    }

    @Test
    void getCostRange(){
        List<TV> list = new ArrayList<>();
        Collections.addAll(list,
                new TV("Samsung", "QE55Q90TAU", 2019, 55, 2000.0 ),
                new TV("KIVI", "65U710KB", 2018, 65, 859.0),
                new TV("Samsung", "UE50TU8000U", 2020, 50, 735.9),
                new TV("LG", "50NANO796NF", 2020, 50, 635.9),
                new TV(" Xiaomi", "MI TV 4S", 2021, 43, 439.9));

        List<TV> expectedResult = new ArrayList<>();
        Collections.addAll(expectedResult,
                new TV("Samsung", "UE50TU8000U", 2020, 50, 735.9),
                new TV("LG", "50NANO796NF", 2020, 50, 635.9));

        List<TV> actualResult = TVUtilities.getCostRange(list, 600.0, 800.0);

        Assertions.assertEquals(expectedResult.toString(), actualResult.toString());
    }

    @Test
    void getCostAsc(){
        List<TV> list = new ArrayList<>();
        Collections.addAll(list,
                new TV("Samsung", "QE55Q90TAU", 2019, 55, 2000.0 ),
                new TV("KIVI", "65U710KB", 2018, 65, 859.0),
                new TV("Samsung", "UE50TU8000U", 2020, 50, 735.9),
                new TV("LG", "50NANO796NF", 2020, 50, 635.9),
                new TV(" Xiaomi", "MI TV 4S", 2021, 43, 439.9));

        List<TV> expectedResult = new ArrayList<>();
        Collections.addAll(expectedResult,
                new TV(" Xiaomi", "MI TV 4S", 2021, 43, 439.9),
                new TV("LG", "50NANO796NF", 2020, 50, 635.9),
                new TV("Samsung", "UE50TU8000U", 2020, 50, 735.9),
                new TV("KIVI", "65U710KB", 2018, 65, 859.0),
                new TV("Samsung", "QE55Q90TAU", 2019, 55, 2000.0 ));

        List<TV> actualResult = TVUtilities.getCostAsc(list);

        Assertions.assertEquals(expectedResult.toString(), actualResult.toString());
    }

    @Test
    void getCostDesc(){
        List<TV> list = new ArrayList<>();
        Collections.addAll(list,
                new TV("Samsung", "QE55Q90TAU", 2019, 55, 2000.0 ),
                new TV("KIVI", "65U710KB", 2018, 65, 859.0),
                new TV("Samsung", "UE50TU8000U", 2020, 50, 735.9),
                new TV("LG", "50NANO796NF", 2020, 50, 635.9),
                new TV(" Xiaomi", "MI TV 4S", 2021, 43, 439.9));

        List<TV> expectedResult = new ArrayList<>();
        Collections.addAll(expectedResult,
                new TV("Samsung", "QE55Q90TAU", 2019, 55, 2000.0 ),
                new TV("KIVI", "65U710KB", 2018, 65, 859.0),
                new TV("Samsung", "UE50TU8000U", 2020, 50, 735.9),
                new TV("LG", "50NANO796NF", 2020, 50, 635.9),
                new TV(" Xiaomi", "MI TV 4S", 2021, 43, 439.9));

        List<TV> actualResult = TVUtilities.getCostDesc(list);

        Assertions.assertEquals(expectedResult.toString(), actualResult.toString());
    }

    @Test
    void getDiagonalAsc(){
        List<TV> list = new ArrayList<>();
        Collections.addAll(list,
                new TV("Samsung", "QE55Q90TAU", 2019, 55, 2000.0 ),
                new TV("KIVI", "65U710KB", 2018, 65, 859.0),
                new TV("Samsung", "UE50TU8000U", 2020, 50, 735.9),
                new TV("LG", "50NANO796NF", 2020, 50, 635.9),
                new TV(" Xiaomi", "MI TV 4S", 2021, 43, 439.9));

        List<TV> expectedResult = new ArrayList<>();
        Collections.addAll(expectedResult,
                new TV(" Xiaomi", "MI TV 4S", 2021, 43, 439.9),
                new TV("Samsung", "UE50TU8000U", 2020, 50, 735.9),
                new TV("LG", "50NANO796NF", 2020, 50, 635.9),
                new TV("Samsung", "QE55Q90TAU", 2019, 55, 2000.0 ),
                new TV("KIVI", "65U710KB", 2018, 65, 859.0));

        List<TV> actualResult = TVUtilities.getDiagonalAsc(list);

        Assertions.assertEquals(expectedResult.toString(), actualResult.toString());
    }

    @Test
    void getDiagonalDesc(){
        List<TV> list = new ArrayList<>();
        Collections.addAll(list,
                new TV("Samsung", "QE55Q90TAU", 2019, 55, 2000.0 ),
                new TV("KIVI", "65U710KB", 2018, 65, 859.0),
                new TV("Samsung", "UE50TU8000U", 2020, 50, 735.9),
                new TV("LG", "50NANO796NF", 2020, 50, 635.9),
                new TV(" Xiaomi", "MI TV 4S", 2021, 43, 439.9));

        List<TV> expectedResult = new ArrayList<>();
        Collections.addAll(expectedResult,
                new TV("KIVI", "65U710KB", 2018, 65, 859.0),
                new TV("Samsung", "QE55Q90TAU", 2019, 55, 2000.0 ),
                new TV("Samsung", "UE50TU8000U", 2020, 50, 735.9),
                new TV("LG", "50NANO796NF", 2020, 50, 635.9),
                new TV(" Xiaomi", "MI TV 4S", 2021, 43, 439.9));

        List<TV> actualResult = TVUtilities.getDiagonalDesc(list);

        Assertions.assertEquals(expectedResult.toString(), actualResult.toString());
    }
}
