package com.rakovets.course.javabasics.practice.javaio.fileutil;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class FileDemo {
    public static void main(String[] args) throws IOException {

        String path = "C:\\home\\zmachinsky\\course-java-basics-fork\\src\\Hello.txt";
        String path1 = "C:\\home\\zmachinsky\\course-java-basics-fork\\src\\text2.txt";
        String path2 = "C:\\home\\zmachinsky\\course-java-basics-fork\\src\\spec6.txt";

        StringBuilder stringB = FileAnalyzeUtil.getRowsFromFileToString(path);
        StringBuilder string1 = FileAnalyzeUtil.getWordsStartWithVowels(path);
        StringBuilder string2 = FileAnalyzeUtil.getWordsLastFirstEquals(path1);
        int count = FileAnalyzeUtil.getCountOfsimbols(path2);
        StringBuilder result = new StringBuilder();

        BufferedReader hello = new BufferedReader(new FileReader(path));
        String line ;
        while ((line = hello.readLine()) != null) {
        //    System.out.println(line);
            result.append(line + "\n");


        }
        System.out.println(count);
    }


}










