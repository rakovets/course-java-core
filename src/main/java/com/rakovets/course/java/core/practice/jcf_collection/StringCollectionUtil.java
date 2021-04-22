package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.List;

public class StringCollectionUtil {

    public void resetWordsByLength(List<String> textList, int textLength) {
        for (String i : textList) {
            if (i.length() == textLength) {
                textList.set(textList.indexOf(i), "*");
            }
        }
    }

    public void removeWordsByLength(List<String> textList, int textLength) {
        for (int i = 0; i < textList.size(); i ++) {
            if (textList.get(i).length() == textLength) {
                textList.remove(i);
            }
        }
    }
}
