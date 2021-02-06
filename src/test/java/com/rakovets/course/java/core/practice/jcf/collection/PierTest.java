package com.rakovets.course.java.core.practice.jcf.collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PierTest {

    @Test
    void getAverageWaitTimeByPerson() {
        Map<String, Integer> averageTimeBetweenBoats = new HashMap<>();
        averageTimeBetweenBoats.put("Morning", 2);
        averageTimeBetweenBoats.put("Day", 26);
        averageTimeBetweenBoats.put("Evening", 19);
        averageTimeBetweenBoats.put("Night", 19);
        Map<String, Double> expected = new HashMap<>();
        expected.put("Morning", 1.0);
        expected.put("Day", 13.0);
        expected.put("Evening", 9.5);
        expected.put("Night", 9.5);

        Map<String, Double> actual = Pier.getAverageWaitTimeByPerson(averageTimeBetweenBoats);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getMaxIntervalBetweenBoat() {
        Map<String, Integer> averageTimeBetweenPerson = new HashMap<>();
        averageTimeBetweenPerson.put("Morning", 2);
        averageTimeBetweenPerson.put("Day", 10);
        averageTimeBetweenPerson.put("Evening", 15);
        averageTimeBetweenPerson.put("Night", 30);
        int maxPersonOnStop = 4;
        Map<String, Integer> expected = new HashMap<>();
        expected.put("Morning", 8);
        expected.put("Day", 40);
        expected.put("Evening", 60);
        expected.put("Night", 120);

        Map<String, Integer> actual = Pier.getMaxIntervalBetweenBoat(averageTimeBetweenPerson, maxPersonOnStop);

        Assertions.assertEquals(expected, actual);
    }
}
