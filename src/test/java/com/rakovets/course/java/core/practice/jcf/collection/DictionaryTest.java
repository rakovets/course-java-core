package com.rakovets.course.java.core.practice.jcf.collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryTest {
//for shorten the code I added the constructor in Dictionary class with the first word and the first translation
    @Test
    void putNewWordAndTranslate() {
        Dictionary expected = new Dictionary(new HashMap<>(), new LinkedHashMap<>(), "dog", "hund");

        Dictionary actual = new Dictionary(new HashMap<>(), new LinkedHashMap<>());
        actual.putNewWordAndTranslate("dog", "hund");

        Assertions.assertEquals(expected.getDictionary().get("dog"), actual.getDictionary().get("dog"));
    }

    @Test
    void addTranslate() {
        Dictionary expected = new Dictionary(new HashMap<>(), new LinkedHashMap<>(),"dog", "hund, hund2");

        Dictionary actual = new Dictionary(new HashMap<>(), new LinkedHashMap<>(),"dog", "hund");
        actual.addTranslate("dog", "hund2");

        Assertions.assertEquals(expected.getDictionary().get("dog"), actual.getDictionary().get("dog"));
    }

    @Test
    void changeTranslate() {
        Dictionary expected = new Dictionary(new HashMap<>(), new LinkedHashMap<>(),"dog", "hund2");

        Dictionary actual = new Dictionary(new HashMap<>(), new LinkedHashMap<>(),"dog", "hund");
        actual.changeTranslate("dog", "hund2");

        Assertions.assertEquals(expected.getDictionary().get("dog"), actual.getDictionary().get("dog"));
    }

    @Test
    void removeTranslate() {
        Dictionary expected = new Dictionary(new HashMap<>(), new LinkedHashMap<>(),"dog", "");

        Dictionary actual = new Dictionary(new HashMap<>(), new LinkedHashMap<>(),"dog", "hund");
        actual.removeTranslate("dog");

        Assertions.assertEquals(expected.getDictionary().get("dog"), actual.getDictionary().get("dog"));
    }

    @Test
    void getTranslate() {
        Dictionary dictionary = new Dictionary(new HashMap<>(), new LinkedHashMap<>(),"dog", "hund");
        String expected = "hund";

        String actual = dictionary.getTranslate("dog");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void addNewWord() {
        Dictionary expected = new Dictionary(new HashMap<>(), new LinkedHashMap<>(),"dog", "");

        Dictionary actual = new Dictionary(new HashMap<>(), new LinkedHashMap<>());
        actual.addNewWord("dog");

        Assertions.assertEquals(expected.getDictionary().get("dog"), actual.getDictionary().get("dog"));
    }

    @Test
    void changeWord() {
        Dictionary expected = new Dictionary(new HashMap<>(), new LinkedHashMap<>(),"dog2", "hund");

        Dictionary actual = new Dictionary(new HashMap<>(), new LinkedHashMap<>(),"dog", "hund");
        actual.changeWord("dog", "dog2");

        Assertions.assertEquals(expected.getDictionary().get("dog2"), actual.getDictionary().get("dog2"));
    }

    @Test
    void removeWord() {
        Dictionary expected = new Dictionary(new HashMap<>(), new LinkedHashMap<>());

        Dictionary actual = new Dictionary(new HashMap<>(), new LinkedHashMap<>(),"dog", "hund");
        actual.removeWord("dog");

        Assertions.assertEquals(expected.getDictionary().keySet(), actual.getDictionary().keySet());
    }

    @Test
    void getTopPopularWords() {
        Dictionary dictionary = new Dictionary(new HashMap<>(), new LinkedHashMap<>(), "word1", "translate1");
        dictionary.getDictionary().put("word2", "translate2");
        dictionary.getDictionary().put("word3", "translate2");
        dictionary.getDictionary().put("word4", "translate2");
        dictionary.getDictionary().put("word5", "translate2");
        Map<String, Integer> expected = new LinkedHashMap<>();
        expected.put("word1", 2);
        expected.put("word3", 1);

        dictionary.getTranslate("word1");
        dictionary.getTranslate("word1");
        dictionary.getTranslate("word3");
        Map<String, Integer> actual = dictionary.getTopPopularWords();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getTopNotPopularWords() {
        Dictionary dictionary = new Dictionary(new HashMap<>(), new LinkedHashMap<>(), "word1", "translate1");
        dictionary.getDictionary().put("word2", "translate2");
        dictionary.getDictionary().put("word3", "translate2");
        dictionary.getDictionary().put("word4", "translate2");
        dictionary.getDictionary().put("word5", "translate2");
        Map<String, Integer> expected = new LinkedHashMap<>();
        expected.put("word3", 1);
        expected.put("word1", 2);

        dictionary.getTranslate("word1");
        dictionary.getTranslate("word1");
        dictionary.getTranslate("word3");
        Map<String, Integer> actual = dictionary.getTopPopularWords();

        Assertions.assertEquals(expected, actual);
    }
}
