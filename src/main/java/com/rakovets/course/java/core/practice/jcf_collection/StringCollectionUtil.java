package com.rakovets.course.java.core.practice.jcf_collection;


import java.util.*;

public class StringCollectionUtil {
    public static Collection<String> resetWordsByLength(Collection<String> listOfWords, int wordLength){
        Collection<String> resetedListOfWords = new ArrayList<>();
        for(String word : listOfWords){
            if(word.length() == wordLength){
                resetedListOfWords.add("*");
            } else {
                resetedListOfWords.add(word);
            }
        }
        return resetedListOfWords;
    }

    public static Collection<String> removeWordsByLength(Collection<String> listOfWords, int wordLength){
        Iterator<String> stringIterator = listOfWords.iterator();
        while (stringIterator.hasNext()){
            if(stringIterator.next().length() == wordLength){
                stringIterator.remove();
            }
        }
        return listOfWords;
    }
}
