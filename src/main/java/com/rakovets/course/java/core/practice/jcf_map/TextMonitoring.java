package com.rakovets.course.java.core.practice.jcf_map;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextMonitoring {

    public static Map<String, Integer> researchText(String text) {
        Map<String, Integer> wordRepeats = new LinkedHashMap<>();
        Pattern pattern = Pattern.compile("\\w+");
        Matcher match = pattern.matcher(text);
        while (match.find()) {
            int count = 1;
            if (wordRepeats.containsKey(match.group())) {
                count = wordRepeats.get(match.group()) + 1;
            }
            wordRepeats.put(match.group(), count);
        }
        return wordRepeats;
    }

    public static int getCountUniqueWords(String text) {
        Map<String, Integer> wordsMap = researchText(text);
        Iterator<Map.Entry<String, Integer>> iterator = wordsMap.entrySet().iterator();
        int uniqueWordCount = 0;
        while (iterator.hasNext()) {
            if (iterator.next().getValue().equals(1)) {
                uniqueWordCount++;
            }
        }
        return uniqueWordCount;
    }

    public static List<String> getUniqueWords(String text) {
        List<String> uniqueList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : researchText(text).entrySet()) {
            if (entry.getValue().equals(1)) {
                uniqueList.add(entry.getKey());
            }
        }
        return uniqueList;
    }

    public static int getFrequencyWord(String text, String word) {
        Map<String, Integer> wordsMap = researchText(text);
        return wordsMap.get(word);
    }

    public static Map<String, Integer> getFrequencyWords(String text, boolean isAscendingFrequency) {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(researchText(text).entrySet());
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        if (isAscendingFrequency) {
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o1.getValue() - o2.getValue();
                }
            });
        } else {
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    if (o1.getValue() > o2.getValue()) {
                        return -1;
                    } else if (o1.getValue() < o2.getValue()) {
                        return 1;
                    } else return 0;
                }
            });
        }
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
}
