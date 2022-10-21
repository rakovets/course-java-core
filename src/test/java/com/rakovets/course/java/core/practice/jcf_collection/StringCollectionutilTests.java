package com.rakovets.course.java.core.practice.jcf_collection;

import com.rakovets.course.java.core.practice.jcf_collection.project_string_collection_util.StringCollectionUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class StringCollectionutilTests {
    StringCollectionUtil wordList = new StringCollectionUtil(new ArrayList<>(List.of("333", "4444", "55555", "4444")));
    List<String> wordListResetWordsExpected = new ArrayList<>(List.of("333", "*", "55555", "*"));
    List<String> wordListRemoveWordsExpected = new ArrayList<>(List.of("333", "55555"));

    @Test
    public void testResetWordsByLength() {
        Assertions.assertEquals(wordListResetWordsExpected, wordList.resetWordsByLength(wordList.getArrayList(), 4));
    }

    @Test
    public void testRemoveWordsByLength() {
        Assertions.assertEquals(wordListRemoveWordsExpected, wordList.removeWordsByLength(wordList.getArrayList(), 4));
    }
}
