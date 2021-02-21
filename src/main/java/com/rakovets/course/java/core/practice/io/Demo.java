package com.rakovets.course.java.core.practice.io;

import java.io.*;
import java.util.*;

public class Demo {
    public static void main(String[] args) {
        System.out.println(FileAnalyzeUtil.getMaxConsistencyOfNumbers("src/test/java/com/rakovets/course/java/core/practice/io/filesForFileAnalyzer/list-max-consistency.txt"));
        String s = "1 2 1 2 3";
        List<String> list = new LinkedList<>();
        Collections.addAll(list, s.split(" "));
        list.add(" ");
        System.out.println(list);
    }
}
