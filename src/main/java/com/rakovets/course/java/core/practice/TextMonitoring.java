package com.rakovets.course.java.core.practice;

import java.util.*;

public class TextMonitoring {
    Map<String, Integer> map;

    public void researchText(String text) {
        String textToArray = text.replaceAll("[,.&!@]", "");
        String[] textInArray = textToArray.split(" ");

        map = new HashMap<>();

        for (String word : textInArray) {
            if (map.containsKey(word))
                map.put(word, map.get(word) + 1);
            else
                map.put(word, 1);
        }
    }

    public int getCountUniqueWords() {
        return map.size();
    }

    public Set<String> getUniqueWords() {
        return map.keySet();
    }

    public int getFrequencyWord(String word) {
        return map.get(word);
    }

    public String[] getFrequencyWords(boolean isAscendingFrequency) {
        String[] arrayKeyAndValue = new String[map.size()];
        int index = isAscendingFrequency == true ? 0 : map.size();
        HashSet<Integer> set = new HashSet<>();

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
         //   String key = pair.getKey();                      //ключ
            Integer value = pair.getValue();                  //значение
            set.add(value);
          //  arrayKeyAndValue[index] = key + ":" + value;
            index = isAscendingFrequency == true ? ++index : --index;
        }
for(Integer index2 : set){

    index = isAscendingFrequency == true ? ++index : --index;
}
        return arrayKeyAndValue;
    }
}
