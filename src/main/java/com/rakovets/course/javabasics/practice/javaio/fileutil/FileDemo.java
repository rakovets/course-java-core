package com.rakovets.course.javabasics.practice.javaio.fileutil;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FileDemo {
    public static void main(String[] args) throws IOException {

        String path = "C:\\home\\zmachinsky\\course-java-basics-fork\\src\\Hello.txt";
        String path1 = "C:\\home\\zmachinsky\\course-java-basics-fork\\src\\text2.txt";
        String path2 = "C:\\home\\zmachinsky\\course-java-basics-fork\\src\\spec6.txt";

          LinkedList<String> stringB = FileAnalyzeUtil.getRowsFromFileToString(path);
          LinkedList<String> stringW = FileAnalyzeUtil.getWordsStartWithVowels(path);
          LinkedList<String> stringEq = FileAnalyzeUtil.getWordsLastFirstEquals(path1);
          LinkedList<String> stringnums = FileAnalyzeUtil.getListWithMaxCombination(path2);
          HashMap<String, Integer> stringSi = FileAnalyzeUtil.getCountOfSimbols(path1);
          LinkedList<Map.Entry<String, Integer>> stringSort = FileAnalyzeUtil.getCountOfWordsSorted(path1);

          System.out.print(stringnums);


    }
}













