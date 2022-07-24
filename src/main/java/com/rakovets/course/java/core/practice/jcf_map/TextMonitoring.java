package com.rakovets.course.java.core.practice.jcf_map;

import java.util.*;

public class TextMonitoring {
    public Map<String, Integer> researchText(String text) {
        List<String> words = Arrays.asList(text.split("[\\pP\\s]+"));
        Set<String> unique = new HashSet<>(words);
        Map<String, Integer> result = new HashMap<>();
        for (String word : unique) {
            int counter = 0;
            for (String s : words) {
                if (word.equals(s)) {
                    counter++;
                }
            }
            result.put(word, counter);
        }
        return result;
    }

    public int getCountUniqueWords(String text) {
        Map<String, Integer> map = researchText(text);
        Collection<Integer> collection = map.values();
        int counter = 0;
        for (Integer numberRepetitions : collection) {
            if (numberRepetitions == 1) {
                counter++;
            }
        }
        return counter;
    }

    public Set<String> getUniqueWords(String text) {
        Map<String, Integer> map = researchText(text);
        Set<String> unique = new HashSet<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                unique.add(entry.getKey());
            }
        }
        return unique;
    }

    public int getFrequencyWord(String text, String word) {
        Map<String, Integer> map = researchText(text);
        return map.get(word);
    }

    public Map<String, Integer> getFrequencyWords(String text, boolean isAscendingFrequency) {
        Map<String, Integer> map = researchText(text);
        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
        Comparator<Map.Entry<String, Integer>> comparator = new Comparator<>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if (!(Objects.equals(o1.getValue(), o2.getValue()))) {
                    int compareResult = o1.getValue().compareTo(o2.getValue());
                    return isAscendingFrequency ? compareResult : -compareResult;
                }
                int compareResult = o1.getKey().compareTo(o2.getKey());
                return isAscendingFrequency ? compareResult : -compareResult;
            }
        };
        list.sort(comparator);
        Map<String, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> e : list) {
            result.put(e.getKey(), e.getValue());
        }
        return result;
    }
}
