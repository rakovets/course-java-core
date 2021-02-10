package com.rakovets.course.java.core.practice.jcf.collection;

import java.util.HashMap;
import java.util.Map;

public class Pier {
    public static Map<String, Double> getAverageWaitTimeByPerson(Map<String, Integer> averageTimeBetweenBoats) {
        Map<String, Double> averageWaitTime = new HashMap<>();
        averageWaitTime.put("Morning", averageTimeBetweenBoats.get("Morning") / 2.0);
        averageWaitTime.put("Day", averageTimeBetweenBoats.get("Day") / 2.0);
        averageWaitTime.put("Evening", averageTimeBetweenBoats.get("Evening") / 2.0);
        averageWaitTime.put("Night", averageTimeBetweenBoats.get("Night") / 2.0);
        return averageWaitTime;
    }

    public static Map<String, Integer> getMaxIntervalBetweenBoat(Map<String, Integer> averageTimeBetweenPerson, int maxPersonOnStop) {
        Map<String, Integer> minIntervalBetweenBoat = new HashMap<>();
        minIntervalBetweenBoat.put("Morning", averageTimeBetweenPerson.get("Morning") * maxPersonOnStop);
        minIntervalBetweenBoat.put("Day", averageTimeBetweenPerson.get("Day") * maxPersonOnStop);
        minIntervalBetweenBoat.put("Evening", averageTimeBetweenPerson.get("Evening") * maxPersonOnStop);
        minIntervalBetweenBoat.put("Night", averageTimeBetweenPerson.get("Night") * maxPersonOnStop);
        return minIntervalBetweenBoat;
    }
}

