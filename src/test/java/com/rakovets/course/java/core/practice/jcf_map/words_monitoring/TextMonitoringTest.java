package com.rakovets.course.java.core.practice.jcf_map.words_monitoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.NavigableMap;

public class TextMonitoringTest {
    String text = "First, I wake up. Then, I get dressed. I walk to school. I do not ride a bike. I do not ride the " +
            "bus. I like to go to school. It rains. I do not like rain. I eat lunch. I eat a sandwich and an " +
            "apple.";


    @Test
    void getCountUniqueWordsTest() {
        TextMonitoring monitoring = new TextMonitoring(text);

        var result = monitoring.getCountUniqueWords();

        Assertions.assertEquals(28 ,result);
    }

    @Test
    void getUniqueWordsTest() {
        TextMonitoring monitoring = new TextMonitoring(text);

        var result = monitoring.getUniqueWords().size();

        Assertions.assertEquals(28 ,result);
    }

    @Test
    void getFrequencyWordTest() {
        TextMonitoring monitoring = new TextMonitoring(text);

        var result = monitoring.getFrequencyWord("I");

        Assertions.assertEquals(9 ,result);
    }

    @Test
    void getFrequencyWordsTest1() {
        TextMonitoring monitoring = new TextMonitoring(text);

        NavigableMap<String, Integer> map = monitoring.getFrequencyWords(true);
        var result = map.firstKey();

        Assertions.assertEquals("First", result);
    }

    @Test
    void getFrequencyWordsTest2() {
        TextMonitoring monitoring = new TextMonitoring(text);

        NavigableMap<String, Integer> map = monitoring.getFrequencyWords(false);
        var result = map.firstKey();

        Assertions.assertEquals("I", result);
    }
}
