package com.rakovets.course.java.core.practice.jcf_collection;

import com.rakovets.course.java.core.practice.jcf_collection.project_string_collection_util.StringCollectionUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class StringCollectionutilTests {
    final int LENGTH_OF_WORDS_TO_BE_RESET = 4;
    final int LENGTH_OF_WORDS_TO_BE_REMOVE = 4;

    List<String> wordList = new ArrayList<>(List.of("333", "4444", "55555", "4444"));
    StringCollectionUtil myList = new StringCollectionUtil(wordList);
    List<String> wordListExpected = new ArrayList<>(List.of("333", "*", "55555", "*"));

    @Test
}
