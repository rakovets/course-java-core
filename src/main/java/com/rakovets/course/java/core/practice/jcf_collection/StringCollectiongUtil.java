package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.List;

    public class StringCollectiongUtil {

        public void resetWordsByLength(List<String> textList, int lengthOfText) {
            for (String i : textList) {
                if (i.length() == lengthOfText) {
                    textList.set(textList.indexOf(i), "*");
                }
            }
        }
        public void removeWordsByLength(List<String> textList, int lengthOfText) {
            for (int i = 0; i < textList.size(); i ++) {
                if (textList.get(i).length() == lengthOfText) {
                    textList.remove(i); }
        }
    }
}
