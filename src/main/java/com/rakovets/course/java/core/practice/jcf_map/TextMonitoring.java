package com.rakovets.course.java.core.practice.jcf_map;

import java.util.*;

public class TextMonitoring {
    private Map<String, Integer> map;

    /**
     * The method extracts all the different words and calculates the frequency with which they occur.
     * <p /> Words are considered different even if they differ in letter case.
     *
     * @param text received text.
     */
    public void researchText(String text) {
        String textToArray = text.replaceAll("[,.&!@]", "");

        String[] textInArray = textToArray.split(" ");

        map = new HashMap<>(10);

        for (String word : textInArray) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
    }

    /**
     * Returns the number of unique words in a text.
     *
     * @return the number of unique words.
     */
    public int getCountUniqueWords() {
        return map.size();
    }

    /**
     * Gets a set of unique words from a text.
     *
     * @return collection of unique words.
     */

    public Collection<String> getUniqueWords() {
        return map.keySet();
    }

    /**
     * Gets the frequency of the word.
     *
     * @param word Gets the frequency of the word
     * @return the number of repetitions of the word in the collection.
     */
    public int getFrequencyWord(String word) {
        return map.get(word);
    }

    /**
     * Returns all words and how often they are used
     *
     * @param isAscendingFrequency if true, then outputs in ascending order, otherwise in descending order
     * @return all words and their number of uses.
     */
    public Map<String, Integer> getFrequencyWords(boolean isAscendingFrequency) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Map<String, Integer> resultArray = new LinkedHashMap<>();

        if (isAscendingFrequency) {
            list.sort(Map.Entry.comparingByValue());
        } else {
            list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        }
        for (Map.Entry<String, Integer> entry : list) {
            resultArray.put(entry.getKey(), entry.getValue());
        }
        return resultArray;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TextMonitoring that = (TextMonitoring) o;
        return map.equals(that.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(map);
    }
}
