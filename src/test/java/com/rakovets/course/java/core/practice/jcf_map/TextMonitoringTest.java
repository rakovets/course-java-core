package com.rakovets.course.java.core.practice.jcf_map;

import com.rakovets.course.java.core.practice.jcf_map.TextMonitoring;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextMonitoringTest {
    @Test
    void getCountUniqueWords() {
        // GIVEN
        String text = "Alex Alex Alex Sally Sally Nick";
        TextMonitoring example = new TextMonitoring(text);

        // WHEN
        int actualInt = example.getCountUniqueWords("Alex");

        // THEN
        Assertions.assertEquals(3, actualInt);
    }

    @Test
    void getFrequencyWordPositive() {
        // GIVEN
        String text = "Alex Alex Alex Mike Mike Nick";
        TextMonitoring example = new TextMonitoring(text);

        // WHEN
        int actualInt = example.getFrequencyWord("Mike");

        // THEN
        Assertions.assertEquals(2, actualInt);
    }

    @Test
    void getFrequencyWordNegative() {
        // GIVEN
        String text = "Alex Alex Alex Mike Mike Nick";
        TextMonitoring example = new TextMonitoring(text);

        // WHEN
        int actualInt = example.getFrequencyWord("Igor");

        // THEN
        Assertions.assertEquals(0, actualInt);
    }

    @Test
    void getFrequencyWordsDescending() {
        // GIVEN
        String text = "Alex Alex Alex Mike Mike Nick";
        TextMonitoring example = new TextMonitoring(text);

        // WHEN
        String actualString = example.getFrequencyWords(false).toString();

        // THEN
        Assertions.assertEquals("[Alex=3, Mike=2, Nick=1]", actualString);
    }

    @Test
    void getFrequencyWordsAscending() {
        // GIVEN
        String text = "Alex Alex Alex Mike Mike Nick";
        TextMonitoring example = new TextMonitoring(text);

        // WHEN
        String actualString = example.getFrequencyWords(true).toString();

        // THEN
        Assertions.assertEquals("[Nick=1, Mike=2, Alex=3]", actualString);
    }
}
