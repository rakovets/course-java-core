package com.rakovets.course.java.core.practice.jcf_map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class TextMonitoringTest {
    TextMonitoring textMonitoring = new TextMonitoring();
    String text = "Java Java java is language... language Java";

    @Test
    public void testResearch() {
        Map <String,Integer> expected = new HashMap<>(Map.of("Java",3,"is",1,"language",2, "java",1));
        Assertions.assertEquals(expected,textMonitoring.researchText(text));
    }

    @Test
    public void testGetCountUniqueWords() {
        Assertions.assertEquals(2,textMonitoring.getCountUniqueWords(text));
    }

    @Test
    public void testGetUniqueWords() {
       Set  <String> expected = Set.of("java","is");
        Assertions.assertEquals(expected,textMonitoring.getUniqueWords(text));
    }

    @Test
    public void testGetFrequencyWord() {
        Assertions.assertEquals(3,textMonitoring.getFrequencyWord(text,"Java"));
    }

    @Test
    public void testGetFrequencyWordsFalse() {
        Map <String,Integer> actual= textMonitoring.getFrequencyWords(text,false);
        List <String> keys = new ArrayList<>(actual.keySet());
        List <Integer> values =new ArrayList<>(actual.values());
        List <Integer> valuesExpected = Arrays.asList(3,2,1,1);
        List <String> keysExpected =Arrays.asList("Java","language","java","is");
        Assertions.assertEquals(keysExpected,keys);
        Assertions.assertEquals(valuesExpected,values);
    }

    @Test
    public void testGetFrequencyWordsTrue() {
        Map <String,Integer> actual= textMonitoring.getFrequencyWords(text,true);
        List <String> keys = new ArrayList<>(actual.keySet());
        List <Integer> values =new ArrayList<>(actual.values());
        List <Integer> valuesExpected = Arrays.asList(1,1,2,3);
        List <String> keysExpected =Arrays.asList("is","java","language","Java");
        Assertions.assertEquals(keysExpected,keys);
        Assertions.assertEquals(valuesExpected,values);
    }

    @Test
    public void testGetFrequencyWordsNegative() {
        Map <String,Integer> actual= textMonitoring.getFrequencyWords(text,true);
        List <String> keys = new ArrayList<>(actual.keySet());
        List <Integer> values = new ArrayList<>(actual.values());
        List <Integer> valuesExpected = Arrays.asList(2,1,1,3);
        List <String> keysExpected =Arrays.asList("java","is","language","Java");
        Assertions.assertNotEquals(keysExpected,keys);
        Assertions.assertNotEquals(valuesExpected,values);
    }
    }
