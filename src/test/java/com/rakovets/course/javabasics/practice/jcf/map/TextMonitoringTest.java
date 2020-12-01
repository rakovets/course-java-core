package com.rakovets.course.javabasics.practice.jcf.map;

import com.rakovets.course.javabasics.example.generics.model.map.TextMonitoring;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextMonitoringTest {

    @Test
    void test1() {
        String strings = "It is a little story for my life for my home for my country";
        TextMonitoring textMonitoring = new TextMonitoring();
        textMonitoring.researchText(strings);
        Assertions.assertEquals(10, textMonitoring.getCountUniqueWords());
    }

    @Test
    void test2() {
        String strings = "It is a little story for my life for my home for my country";
        TextMonitoring textMonitoring = new TextMonitoring();
        textMonitoring.researchText(strings);
        Assertions.assertEquals("[a, country, for, is, It, my, life, little, story, home]", textMonitoring.getUniqueWords().toString());
    }

    @Test
    void test3() {
        String strings = "It is a little story for my life for my home for my country";
        TextMonitoring textMonitoring = new TextMonitoring();
        textMonitoring.researchText(strings);
        Assertions.assertEquals(3, textMonitoring.get("my"));
    }

    @Test
    void test4() {
        String strings = "It is a little story for my life for my home for my country";
        TextMonitoring textMonitoring = new TextMonitoring();
        textMonitoring.researchText(strings);
        Assertions.assertEquals("{a=1, country=1, is=1, It=1, life=1, little=1, story=1, home=1, for=3, my=3}", textMonitoring.getWordFrequencyDesc(true).toString());
    }

    @Test
    void test5() {
        String strings = "It is a little story for my life for my home for my country";
        TextMonitoring textMonitoring = new TextMonitoring();
        textMonitoring.researchText(strings);
        Assertions.assertEquals("{for=3, my=3, a=1, country=1, is=1, It=1, life=1, little=1, story=1, home=1}", textMonitoring.getWordFrequencyDesc(false).toString());
    }
}