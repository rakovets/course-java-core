package com.rakovets.course.javabasics.StringCollectionUtil;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public  class StringCollectionUtil  {



    public static List<String> markWordsWithLength(LinkedList source, int nums){
        Iterator<String> iter = source.iterator();
        LinkedList<String> result = new LinkedList<String>();

        while(iter.hasNext()){
            String temp = iter.next();
            if (temp.length() == nums){
                result.add("*");
            } else result.add(temp);
        }
return result;
    }
}
