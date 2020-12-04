package com.rakovets.course.javabasics.practice.lambdaexpressions;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CityHelperTest {

    @Test
    void test() {
        String[] cities = {"Minsk", "Brest", "Grodno", "Vitebsk", "Gomel", "Mogilev", "Minsk", "Minsk", "Brest", "Vitebsk"};
        CityHelper cityHelper = new CityHelper(cities);
        assertArrayEquals(new String[]{"Minsk", "Brest", "Grodno", "Vitebsk", "Gomel", "Mogilev", "Minsk", "Minsk", "Brest", "Vitebsk"}, cityHelper.getAll());
        assertArrayEquals(new String[]{"Minsk", "Brest", "Grodno", "Vitebsk", "Gomel", "Mogilev"}, cityHelper.getUnique());
        assertArrayEquals(new String[]{"Vitebsk", "Mogilev", "Vitebsk"}, cityHelper.getLonger(6));
        assertArrayEquals(new String[]{"Minsk", "Mogilev", "Minsk", "Minsk"}, cityHelper.getWithFirstLetter('M'));
        assertArrayEquals(new String[]{"Grodno", "Gomel"}, cityHelper.getWithFirstLetter('G'));
        assertEquals(3, cityHelper.getAmount("Minsk"));
        assertEquals(2, cityHelper.getAmount("Vitebsk"));
    }
}
