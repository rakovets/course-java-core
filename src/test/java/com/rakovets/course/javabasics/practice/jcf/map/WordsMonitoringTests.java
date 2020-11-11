package com.rakovets.course.javabasics.practice.jcf.map;

import com.rakovets.course.javabasics.example.collections.map.TextMonitoring;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


//            System.out.println("Word \n " + TextMonitoring.getWork(text, "roooby"));
public class WordsMonitoringTests {

    @Test
    void researchTextTest() {

        String textForResearching = "Set up an organization to improve the way your team. The road to the Hell!Going to play?";
        String expected = "{play=1, Set=1, Going=1, your=1, team=1, an=1, way=1, the=2, The=1, road=1, improve=1, organization=1, up=1, to=3, Hell=1}";
        Assertions.assertEquals(expected, TextMonitoring.researchText(textForResearching).toString());
    }

    @Test
    void getCountUniqueWordsTest() {

        String textForResearching = "Set up an organization to improve the way your team. The road to the Hell!Going to play?";
        Assertions.assertEquals(13, TextMonitoring.getCountUniqueWords(textForResearching));
    }

    @Test
    void getUniqueWordsTest() {

        String textForResearching = "Set up an organization to improve the way your team. The road to the Hell!Going to play?";
        String expexted = "[play, Set, Going, your, team, an, way, The, road, improve, organization, up, Hell]";
        Assertions.assertEquals(expexted, TextMonitoring.getUniqueWords(textForResearching).toString());
    }

    @Test
    void getWorkTest() {

        String textForResearching = "Set up an organization to improve the way your team. The road to the Hell!Going to play?";
        String word = "the";
        String word1 = "to";
        String word2 = "mask";
        String word3 = "The";
        Assertions.assertEquals(2, TextMonitoring.getWork(textForResearching, word));
        Assertions.assertEquals(3, TextMonitoring.getWork(textForResearching, word1));
        Assertions.assertEquals(0, TextMonitoring.getWork(textForResearching, word2));
        Assertions.assertEquals(1, TextMonitoring.getWork(textForResearching, word3));
    }
}
