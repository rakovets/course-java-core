package com.rakovets.course.java.core.practice.jcf_collection;

import com.rakovets.course.java.core.practice.jcf_collection.project_string_collection_util.StringCollectionUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class StringCollectionutilTests {
    @Test
    public void testResetWordsByLength() {
        StringCollectionUtil wordList1 = new StringCollectionUtil(new ArrayList<>(List.of("333", "4444", "55555", "4444")));
        StringCollectionUtil wordList2 = new StringCollectionUtil(new ArrayList<>(List.of("333", "4444", "55555", "4444")));
        StringCollectionUtil wordList3 = new StringCollectionUtil(new ArrayList<>(List.of("333", "4444", "55555", "4444")));
        List<String> wordListResetWordsExpected1 = new ArrayList<>(List.of("333", "*", "55555", "*"));
        List<String> wordListResetWordsExpected2 = new ArrayList<>(List.of("*", "4444", "55555", "4444"));
        List<String> wordListResetWordsExpected3 = new ArrayList<>(List.of("333", "4444", "*", "4444"));
        Assertions.assertEquals(wordListResetWordsExpected1, wordList1.resetWordsByLength(wordList1.getArrayList(), 4));
        Assertions.assertEquals(wordListResetWordsExpected2, wordList2.resetWordsByLength(wordList2.getArrayList(), 3));
        Assertions.assertEquals(wordListResetWordsExpected3, wordList3.resetWordsByLength(wordList3.getArrayList(), 5));
    }

    @Test
    public void testRemoveWordsByLength() {
        StringCollectionUtil wordList1 = new StringCollectionUtil(new ArrayList<>(List.of("333", "4444", "55555", "4444")));
        StringCollectionUtil wordList2 = new StringCollectionUtil(new ArrayList<>(List.of("333", "4444", "55555", "4444")));
        StringCollectionUtil wordList3 = new StringCollectionUtil(new ArrayList<>(List.of("333", "4444", "55555", "4444")));
        List<String> wordListRemoveWordsExpected1 = new ArrayList<>(List.of("333", "55555"));
        List<String> wordListRemoveWordsExpected2 = new ArrayList<>(List.of("4444", "55555", "4444"));
        List<String> wordListRemoveWordsExpected3 = new ArrayList<>(List.of("333", "4444", "4444"));
        Assertions.assertEquals(wordListRemoveWordsExpected1, wordList1.removeWordsByLength(wordList1.getArrayList(), 4));
        Assertions.assertEquals(wordListRemoveWordsExpected2, wordList1.removeWordsByLength(wordList2.getArrayList(), 3));
        Assertions.assertEquals(wordListRemoveWordsExpected3, wordList1.removeWordsByLength(wordList3.getArrayList(), 5));
    }
}
