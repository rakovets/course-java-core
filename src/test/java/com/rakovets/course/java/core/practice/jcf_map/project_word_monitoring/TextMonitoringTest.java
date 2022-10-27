package com.rakovets.course.java.core.practice.jcf_map.project_word_monitoring;

import com.rakovets.course.java.core.practice.jcf_map.project_words_monitoring.TextMonitoring;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class TextMonitoringTest {
    final String TEXT = " a a a aa? word  aa .aaa, b d bb! bbb word word c cc ccc d d d dd& ddd/ ddd! d.";
    TextMonitoring textMonitoring = new TextMonitoring();

    @Test
    public void testResearchText() {
        Map<String, Integer> mapWords = new HashMap<>(textMonitoring.researchText(TEXT));
        String stringExpected = "[aa=2, aaa=1, bb=1, cc=1, dd=1, a=3, b=1, ccc=1, bbb=1, c=1, d=5, ddd=2, word=3]";

        Assertions.assertEquals(mapWords.entrySet().toString(), stringExpected);
    }

    @Test
    public void testGetCountUniqueWords() {
        Assertions.assertEquals(textMonitoring.getCountUniqueWords(TEXT), 13);
    }

    @Test
    public void testGetUniqueWords() {
        String stringExpected = "[aa, aaa, bb, cc, dd, a, b, ccc, bbb, c, d, ddd, word]";

        Assertions.assertEquals(textMonitoring.getUniqueWords(TEXT).toString(), stringExpected);
    }

    @Test
    public void testGetFrequencyWord() {

        Assertions.assertEquals(textMonitoring.getFrequencyWord(TEXT, "word"), 3);
    }

    @Test
    public void testGetFrequencyWords_NotReversed() {
        String stringExpected = "{a=3, aa=2, aaa=1, b=1, bb=1, bbb=1, c=1, cc=1, ccc=1, d=5, dd=1, ddd=2, word=3}";

        Assertions.assertEquals(textMonitoring.getFrequencyWords(TEXT, true).toString(), stringExpected);
    }

    @Test
    public void testGetFrequencyWords_Reversed() {
        String stringExpected = "{word=3, ddd=2, dd=1, d=5, ccc=1, cc=1, c=1, bbb=1, bb=1, b=1, aaa=1, aa=2, a=3}";

        Assertions.assertEquals(textMonitoring.getFrequencyWords(TEXT, false).toString(), stringExpected);
    }
}
