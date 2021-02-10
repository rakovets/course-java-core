package com.rakovets.course.java.core.practice.jcf.map;

import com.rakovets.course.java.core.practice.jcf.map.words_monitoring.TextMonitoring;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextMonitoringTest {
    @Test
    void getCountUniqueWords() {
        // GIVEN
        String text = "Alex Alex Alex Sally Sally Nick";
        TextMonitoring example = new TextMonitoring(text);

        // WHEN
        int actualInt = example.getCountUniqueWords();

        // THEN
        Assertions.assertEquals(3, actualInt);
    }

    @Test
    void getFrequencyWordPositiv() {
        // GIVEN
        String text = "Alex Alex Alex Sally Sally Nick";
        TextMonitoring example = new TextMonitoring(text);

        // WHEN
        int actualInt = example.getFrequencyWord("Sally");

        // THEN
        Assertions.assertEquals(2, actualInt);
    }

    @Test
    void getFrequencyWordNegativ() {
        // GIVEN
        String text = "Alex Alex Alex Sally Sally Nick";
        TextMonitoring example = new TextMonitoring(text);

        // WHEN
        int actualInt = example.getFrequencyWord("Pikachu");

        // THEN
        Assertions.assertEquals(0, actualInt);
    }
}
