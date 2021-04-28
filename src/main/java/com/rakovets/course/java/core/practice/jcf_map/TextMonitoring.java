package com.rakovets.course.java.core.practice.jcf_map;

import java.util.*;

public class TextMonitoring {
    compForHash first = new compForHash();
    compForHashRewerse second = new compForHashRewerse();
    HashMap<String, Integer> textlist = new HashMap<>();

    public void researchText(String text){
        int key = 1;
        text =text.replaceAll("[,.?!]"," ");
        String[] words = text.split("\\s+");
        for (String i : words){
            if(textlist.containsKey(i)){
                textlist.put(i,++key);
            }
            else {
                key = 1;
                textlist.put(i,key);
            }
        }

    }

    public Set<String> getCountUniqueWords(){
    return textlist.keySet();
    }

    public Collection<Integer> getUniqueWords(){
        return textlist.values();
    }

    public int getFrequencyWord(String word){
    return textlist.get(word);
    }

    public List<Map.Entry<String, Integer>> getFrequencyWords(boolean isAscendingFrequency){
        List<Map.Entry<String, Integer>> list = new ArrayList<>(textlist.entrySet());
            if (isAscendingFrequency == true){
                list.sort(first);
            }
            else {
                list.sort(second);
            }
            return list;
    }

    public HashMap<String, Integer> getTextlist() {
        return textlist;
    }
}
