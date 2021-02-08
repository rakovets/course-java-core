package com.rakovets.course.java.core.practice.jcf.map;

import com.rakovets.course.java.core.practice.jcf.collection.Pier;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        String myString = "sd safsd sdf a sarg agsadg sd a sfdff a jj";
        Map<String, Integer> myTable = TextMonitoring.getFrequencyWords(false, myString);
        System.out.println(myTable);
    }
}
