package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.Collection;
import java.util.List;

public class StringCollectionUtil {
    public Collection<String> resetWordsByLength(List<String> textList, int textLength) {
        for (String i : textList) {
            if (i.length() == textLength) {
                textList.set(textList.indexOf(i), "*");
            }
        }
        return textList;
    }

    public Collection<String> removeWordsByLength(List<String> textList, int textLength) {
        for (int i = 0; i < textList.size(); i ++) {
            if (textList.get(i).length() == textLength) {
                textList.remove(i);
            }
        }
        return textList;
    }
}
