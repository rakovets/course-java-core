package com.rakovets.course.java.core.practice.jcf.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {

        Map<String, String> myMap = new HashMap<>();
        Map<String, Integer> counter = new HashMap<>();
        Dictionary dictionary = new Dictionary(myMap, counter);
        dictionary.putNewWordAndTranslate("a1", "leto");
        dictionary.putNewWordAndTranslate("a2", "leto");
        dictionary.putNewWordAndTranslate("a3", "leto");
        dictionary.putNewWordAndTranslate("a4", "leto");
        dictionary.putNewWordAndTranslate("a5", "leto");
        dictionary.putNewWordAndTranslate("a6", "leto");
        dictionary.putNewWordAndTranslate("a7", "leto");
        dictionary.putNewWordAndTranslate("a8", "leto");
        dictionary.putNewWordAndTranslate("a9", "leto");
        dictionary.putNewWordAndTranslate("a10", "leto");
        dictionary.putNewWordAndTranslate("a11", "leto");

        dictionary.getTranslate("a1");
        dictionary.getTranslate("a2");
        dictionary.getTranslate("a3");
        dictionary.getTranslate("a4");
        dictionary.getTranslate("a5");
        dictionary.getTranslate("a6");
        dictionary.getTranslate("a7");
        dictionary.getTranslate("a8");
        dictionary.getTranslate("a9");
        dictionary.getTranslate("a10");
        dictionary.getTranslate("a11");
        dictionary.getTranslate("a5");
        dictionary.getTranslate("a2");
        dictionary.getTranslate("a1");
        dictionary.getTranslate("a1");
        dictionary.getTranslate("a1");


        System.out.println(dictionary.getTopPopularWords());
        System.out.println(dictionary.getTopNotPopularWords());


    }
}
