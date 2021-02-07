package com.rakovets.course.java.core.practice.jcf.map;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class TextMonitoring {
    public static Map<String, Integer> researchText(String string) {
        Pattern punctuationDeleting = Pattern.compile("[,.!?*\\-:+]");
        Matcher matcher = punctuationDeleting.matcher(string);
        String examplePure = matcher.replaceAll("");

        String[] wordArray = examplePure.trim().split("\\s+");

        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : wordArray) {
            Integer frequency = wordMap.get(word);
            wordMap.put(word, frequency == null ? 1 : frequency + 1);
        }
        return wordMap;
    }

    public static int getCountUniqueWords(String string) {
        return researchText(string).size();
    }

    public static Collection<String> getUniqueWords(String string) {
        return researchText(string).keySet();
    }

    public static int getFrequencyWord(String string, String word) {
        return researchText(string).get(word);
    }

    public static Collection<Map.Entry<String, Integer>> getFrequencyWords(String string, boolean isAscendingFrequency) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(researchText(string).entrySet());
        if (isAscendingFrequency) {
            list.sort(new AscendingFrequencyComparator());
        } else {
            list.sort(new DescendingFrequencyComparator());
        }
        return list;
    }
}
