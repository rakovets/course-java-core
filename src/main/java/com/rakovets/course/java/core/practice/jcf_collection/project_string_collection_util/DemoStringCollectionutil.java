package com.rakovets.course.java.core.practice.jcf_collection.project_string_collection_util;

import java.util.ArrayList;
import java.util.List;

public class DemoStringCollectionutil {
    public static void main(String[] args) {
        final int LENGTH_OF_WORDS_TO_BE_RESET = 4;
        final int LENGTH_OF_WORDS_TO_BE_REMOVE = 4;

        List<String> wordlist = new ArrayList<>(List.of("333", "4444", "55555", "4444"));
        System.out.println(wordlist);

        StringCollectionUtil myList = new StringCollectionUtil(wordlist);
        myList.resetWordsByLength(myList.getArrayList(), LENGTH_OF_WORDS_TO_BE_RESET);
        myList.printMyArrayList(myList.getArrayList());
        System.out.println(myList.getArrayList());

        myList.setArrayList(new ArrayList<>(List.of("333", "4444", "55555", "4444")));

        System.out.println();
        System.out.println(myList.getArrayList());
        myList.removeWordsByLength(myList.getArrayList(), LENGTH_OF_WORDS_TO_BE_REMOVE);
        myList.printMyArrayList(myList.getArrayList());
        System.out.println(myList.getArrayList());
    }
}
