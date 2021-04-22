package com.rakovets.course.java.core.practice.jcf_map;

import java.util.HashMap;

public class TextMonitoring {
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
                textlist.put(i,key);
            }
            key = 1;
        }

    }

    public HashMap<String, Integer> getTextlist() {
        return textlist;
    }
}
