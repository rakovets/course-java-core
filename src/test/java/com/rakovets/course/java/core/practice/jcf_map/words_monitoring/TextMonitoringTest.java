package com.rakovets.course.java.core.practice.jcf_map.words_monitoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TextMonitoringTest {
    private String text = "My day\n" +
            "First, I wake up. Then, I get dressed. I walk to school. I do not ride a bike. I do not ride the " +
            "bus. I like to go to school. It rains. I do not like rain. I eat lunch. I eat a sandwich and an " +
            "apple.";

    @BeforeEach
    void init() {
        TextMonitoring monitoring = new TextMonitoring(text);
    }


    @Test
    void getCountUniqueWordsTest() {
        TextMonitoring monitoring = new TextMonitoring(text);

        var result = monitoring.getCountUniqueWords();

        Assertions.assertEquals(6 ,result);
    }
}
