package com.rakovets.course.java.core.practice.jcf_map;

import com.rakovets.course.java.core.practice.jcf_map.words_monitoring.TextMonitoring;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextMonitoringTest {

    @Test
    void getCountUniqueWordsTest() {
        String text = "hello, I like java, but I don't like java??? skript???.    hello hello, ,      hello";

        int actualString = TextMonitoring.getCountUniqueWords(text);

        Assertions.assertEquals(7, actualString);
    }

    @Test
    void getFrequencyWordTest() {
        String text = "hello, I like java, but I don't like java??? skript???.    hello hello, ,      hello";

        int actualString = TextMonitoring.getFrequencyWord(text, "java");

        Assertions.assertEquals(2, actualString);
    }

    @Test
    void getFrequencyWordsText() {
        String text = "hello, I like java, but I don't like java??? skript???.    hello hello, ,      hello";

        String actualString = TextMonitoring.getFrequencyWords(text, true).toString();

        Assertions.assertEquals("[but=1, don't=1, skript=1, java=2, like=2, I=2, hello=4]", actualString);
    }
}
