package com.rakovets.course.java.core.practice.jcf.map.words_monitioring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

class TextMonitoringTest {

    @Test
    void getCountUniqueWords() {
        //Given
        TextMonitoring textMonitoring = new TextMonitoring();
        int expectedResult = 5;
        //When
        int actualResult = textMonitoring.getCountUniqueWords("Jawa, jawa, sony, audi, mercedes jawa ");
        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void getUniqueWords() {
        //Given
        TextMonitoring textMonitoring = new TextMonitoring();
        HashMap<String, String> map = new HashMap<>();
        map.put("bmw","unique");
        map.put("merc","unique");
        map.put("audi","unique");
        Collection<Map.Entry<String, String>> expectedList = new LinkedList<>(map.entrySet());
        //When
        Collection<Map.Entry<String, String>> actualList =
                textMonitoring.getUniqueWords("bmw audi audi audi merc merc");

        //Than
        Assertions.assertEquals(expectedList, actualList);
    }

    @Test
    void getFrequencyWord() {
        //Given
        TextMonitoring textMonitoring = new TextMonitoring();
        int expectedResult = 2;
        //When
        int actualResult = textMonitoring.getFrequencyWord("Jawa, jawa, sony, audi, mercedes jawa", "jawa");
        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testGetFrequencyWordAscendingFalse() {
        //Given
        TextMonitoring textMonitoring = new TextMonitoring();
        HashMap<String, Integer> map = new HashMap<>();
        map.put("bmw",1);
        map.put("merc",2);
        map.put("audi",3);
        List<Map.Entry<String, Integer>> expectedList = new LinkedList<>(map.entrySet());
        //When
        List<Map.Entry<String, Integer>> actualList =
                textMonitoring.getFrequencyWordAscending("bmw audi audi audi merc merc", false);

        //Than
        Assertions.assertEquals(expectedList, actualList);
    }

    @Test
    void testGetFrequencyWordAscendingTrue() {
        //Given
        TextMonitoring textMonitoring = new TextMonitoring();
        HashMap<String, Integer> map = new HashMap<>();
        map.put("bmw",1);
        map.put("merc",2);
        map.put("audi",3);
        List<Map.Entry<String, Integer>> expectedList = new LinkedList<>(map.entrySet());
        expectedList.sort(Comparator.comparingInt(Map.Entry::getValue));
        //When
        List<Map.Entry<String, Integer>> actualList =
                textMonitoring.getFrequencyWordAscending("bmw audi audi audi merc merc", true);

        //Than
        Assertions.assertEquals(expectedList, actualList);
    }
}
