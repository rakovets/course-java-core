package com.rakovets.course.java.core.practice.jcf.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        //List<String> wordsList = Arrays.asList("Hell", "is", "not", "a", "Hell");
        List<String> wordsList = new ArrayList<>();
        wordsList.add("Hell");
        wordsList.add("is");
        wordsList.add("not");
        wordsList.add("a");
        wordsList.add("Hell");

        StringCollectionUtil.resetWordsByLength(wordsList, 4);

        System.out.println(wordsList);

        StringCollectionUtil.removeWordsByLength(wordsList, 1);

        for (String word : wordsList) {
            System.out.println(word);
        }
    }
}
