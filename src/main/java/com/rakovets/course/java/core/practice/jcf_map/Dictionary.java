package com.rakovets.course.java.core.practice.jcf_map;

import java.util.*;

public class Dictionary {
    Map<String, Integer> countMap = new HashMap<>();
    Map<String, Set<String>> stringMap = new LinkedHashMap<>();

    public void add(String englishWord, String russianTranslation) {
        if (stringMap.containsKey(englishWord)) {
            stringMap.get(englishWord).add(russianTranslation);
        } else {
            Set<String> listOfTranslations = new LinkedHashSet<>();
            listOfTranslations.add(russianTranslation);
            stringMap.put(englishWord, listOfTranslations);
        }
        countUsage(englishWord);
    }

    public void amend(String englishWord, String correctedWord) {
        if (stringMap.containsKey(englishWord)) {
            Set<String> currentSet = stringMap.get(englishWord);
            stringMap.remove(englishWord, stringMap.get(englishWord));
            stringMap.put(correctedWord, currentSet);
        } else {
            System.out.println("Correct your input! There is no such word in a dictionary");
        }
        countUsage(englishWord);
    }

    public void remove(String englishWord) {
        stringMap.remove(englishWord);
    }

    public void replaceTranslation(String englishWord, String previousTranslation, String correctTranslation) {
        if (stringMap.containsKey(englishWord)) {
            stringMap.get(englishWord).remove(previousTranslation);
            stringMap.get(englishWord).add(correctTranslation);
        } else {
            System.out.println("Correct your input! Word you are trying to change is absent!");
        }
    }

    public void removeTranslation(String translation) {
        Collection<Set<String>> collection = stringMap.values();
        for (Set<String> set : collection) {
            set.remove(translation);
        }
    }

    public void removeTranslation(String englishWord, String translation) {
        stringMap.get(englishWord).remove(translation);
        countUsage(englishWord);
    }

    public void showTranslation(String englishWord) {
        if (stringMap.containsKey(englishWord)) {
            System.out.println(englishWord + ": " + Arrays.toString(stringMap.get(englishWord).toArray()));
        } else {
            System.out.println("There is no such word in dictionary! Correct your input!");
        }
        countUsage(englishWord);
    }

    public void printDictionary() {
        System.out.println(stringMap);
    }

    private void countUsage(String word) {
        if (countMap.containsKey(word)) {
            countMap.put(word, countMap.get(word) + 1);
        } else {
            countMap.put(word, 1);
        }
    }

    public void showBottom(int leastPopular) {
        Set<Map.Entry<String, Integer>> set = countMap.entrySet();
        Set<String> bottomSet = new HashSet<>();
        List<Integer> integerList = new ArrayList<>(countMap.values());
        integerList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        });
        List<Integer> list;
        if (integerList.size() <= leastPopular) {
            list = integerList.subList(0, integerList.size());
        } else {
            list = integerList.subList(0, leastPopular);
        }
        int index = 0;
        while (index < leastPopular && index < list.size()) {
            for (Map.Entry<String, Integer> entry : set) {
                if (entry.getValue().equals(list.get(index))) {
                    bottomSet.add(entry.getKey());
                    entry.setValue(-1);
                    index++;
                }
                if (index == leastPopular) {
                    break;
                }
            }
        }
        System.out.println("The least popular words:" + bottomSet);
    }

    public void showTop(int mostPopular) {
        Set<Map.Entry<String, Integer>> set = countMap.entrySet();
        Set<String> topSet = new HashSet<>();
        List<Integer> integerList = new ArrayList<>(countMap.values());
        integerList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -Integer.compare(o1, o2);
            }
        });
        List<Integer> list;
        if (integerList.size() <= mostPopular) {
            list = integerList.subList(0, integerList.size());
        } else {
            list = integerList.subList(0, mostPopular);
        }
        int index = 0;
        while (index < mostPopular && index < list.size()) {
            for (Map.Entry<String, Integer> entry : set) {
                if (entry.getValue().equals(list.get(index))) {
                    topSet.add(entry.getKey());
                    entry.setValue(-1);
                    index++;
                }
                if (index == mostPopular) {
                    break;
                }
            }
        }
        System.out.println("The most popular words:" + topSet);
    }
}
