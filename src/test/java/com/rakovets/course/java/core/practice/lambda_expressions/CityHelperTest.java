package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CityHelperTest {

    List<String> cities = Arrays.asList("New York", "Los Angeles", "Dallas", "Dallas", "Chicago", "New York", "Seattle",
            "Boston", "Detroit", "Atlanta", "Miami", "Orlando");
    CityHelper cityHelper = new CityHelper(cities);

    @Test
    void uniqueName() {
        assertEquals(Arrays.asList("New York", "Los Angeles", "Dallas", "Chicago", "Seattle", "Boston",
                "Detroit", "Atlanta", "Miami", "Orlando"), cityHelper.uniqueName());
    }

    @Test
    void longerName() {
        assertEquals(Arrays.asList("New York", "Los Angeles", "Chicago", "New York", "Seattle", "Detroit",
                "Atlanta", "Orlando"), cityHelper.longerName(6));
    }

    @Test
    void startLetter() {
        assertEquals(Arrays.asList("New York", "New York"), cityHelper.startLetter('N'));
    }

    @Test
    void equalNames() {
        assertEquals(2, cityHelper.equalNames("New York"));
    }
}
