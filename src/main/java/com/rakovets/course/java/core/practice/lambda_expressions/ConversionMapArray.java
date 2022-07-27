package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConversionMapArray {
    public Map<String,String> getMap(String[] array) {
        return IntStream.range(0,array.length/2)
                .boxed()
                .collect(Collectors.toMap(i->array[i*2],i->array[i*2+1]));
    }

    public String [] getArrayString(Map<String,String> map) {
        List <String> list = new ArrayList<>();
        map.forEach((key, value) -> {
            list.add(key);
            list.add(value);
        });
       return list.toArray(new String[0]);
    }
}
