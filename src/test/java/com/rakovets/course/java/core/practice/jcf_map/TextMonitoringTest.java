package com.rakovets.course.java.core.practice.jcf_map;

import com.rakovets.course.java.core.practice.jcf_map.textMonitoring.TextMonitoring;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class TextMonitoringTest {
    private TextMonitoring textMonitoring;
    private Map<String, Integer> mapTest;
    private String test1;
    private String test2;

    @BeforeEach
    public void init() {
        textMonitoring = new TextMonitoring();
        mapTest = new LinkedHashMap<>();
        test1 = "This method is used to check whether a particular value is being mapped by a single or more " +
                "than one key in the Map. It takes the value as a parameter and returns " +
                "True if that value is mapped by any of the key in the map.";
        test2 = "to, THe, The worlds. to TO TO, to The. THE words, THe THE,,, THE, THe the. To TO tO tO ... to";
    }

    @Test
    public void researchTextTest1() {
        mapTest = textMonitoring.researchText(test1);

        Integer actual = mapTest.get("is");
        Assertions.assertEquals(3, actual);
    }

    @Test
    public void researchTextTest2() {
        mapTest = textMonitoring.researchText(test1);

        Integer actual = mapTest.get("a");
        Assertions.assertEquals(3, actual);
    }

    @Test
    public void researchTextTest3() {
        mapTest = textMonitoring.researchText(test1);

        Integer actual = mapTest.get("key");
        Assertions.assertEquals(2, actual);
    }

    @Test
    public void researchTextTest4() {
        mapTest = textMonitoring.researchText(test2);

        Integer actual = mapTest.get("to");
        Assertions.assertEquals(4, actual);
    }

    @Test
    public void researchTextTest5() {
        mapTest = textMonitoring.researchText(test2);

        Integer actual = mapTest.get("THe");
        Assertions.assertEquals(3, actual);
    }

    @Test
    public void getCountUniqueWordsTest1() {
        Integer actual = textMonitoring.getCountUniqueWords(test1);

        Assertions.assertEquals(34, actual);
    }

    @Test
    public void getCountUniqueWordsTest2() {
        Integer actual = textMonitoring.getCountUniqueWords(test2);

        Assertions.assertEquals(10, actual);
    }

    @Test
    public void getUniqueWordsTest1() {
        Set<String> keys = textMonitoring.getUniqueWords(test1);
        Integer actual = keys.size();

        Assertions.assertEquals(34, actual);
    }

    @Test
    public void getUniqueWordsTest2() {
        Set<String> keys = textMonitoring.getUniqueWords(test1);
        boolean actual = keys.contains("Map");

        Assertions.assertTrue(actual);
    }

    @Test
    public void getUniqueWordsTest3() {
        Set<String> keys = textMonitoring.getUniqueWords(test1);
        boolean actual = keys.contains("parameter");

        Assertions.assertTrue(actual);
    }

    @Test
    public void getUniqueWordsTest4() {
        Set<String> keys = textMonitoring.getUniqueWords(test1);
        boolean actual = keys.contains("Garage");

        Assertions.assertFalse(actual);
    }

    @Test
    public void getFrequencyWordTest1() {
        Integer actual = textMonitoring.getFrequencyWord("is", test1);

        Assertions.assertEquals(3, actual);
    }

    @Test
    public void getFrequencyWordTest2() {
        Integer actual = textMonitoring.getFrequencyWord("the", test1);

        Assertions.assertEquals(4, actual);
    }

    @Test
    public void getFrequencyWordTest3() {
        Integer actual = textMonitoring.getFrequencyWord("Garage", test1);

        Assertions.assertEquals(0, actual);
    }

    @Test
    public void getFrequencyWordTest4() {
        Integer actual = textMonitoring.getFrequencyWord("to", test2);

        Assertions.assertEquals(4, actual);
    }
}
