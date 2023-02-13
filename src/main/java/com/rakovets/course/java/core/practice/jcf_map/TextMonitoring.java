package com.rakovets.course.java.core.practice.jcf_map;

import java.util.*;

public class TextMonitoring {
    public static Map<String, Integer> researchText(String str) {
        Map<String, Integer> map = new HashMap<>();
        for(String string : str.replaceAll("[,.!?]", "").split("[^A-Za-z]+")) {
            map.put(string, map.getOrDefault(string, 0) + 1);
        }
        return map;
    }

    public static int getCountUniqueWords(String str) {
        return researchText(str).size();
    }

    public static Collection<String> getUniqueWords(String str) {
        Collection keyset = researchText(str).keySet();
        return keyset;

    }
    public static int getFrequencyWord(String str, String word) {
        return researchText(str).get(word);
    }

    public static List<Map.Entry<String,Integer>> getFrequencyWords(String str, boolean isAscendingFrequency) {
        List<Map.Entry<String, Integer>> list = new LinkedList(researchText(str).entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                if (isAscendingFrequency) {
                    var result =  Double.compare(o1.getValue(),o2.getValue());
                    if(result == 0) {
                        return o1.getKey().compareTo(o1.getKey());
                    } else return result;
                } else {
                    return o2.getValue().compareTo(o1.getValue());
                }
            }
        });
        return list;
    }
}
