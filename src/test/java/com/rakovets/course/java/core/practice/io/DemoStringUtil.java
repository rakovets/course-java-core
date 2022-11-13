package com.rakovets.course.java.core.practice.io;

import com.rakovets.course.java.core.practice.io.file_util.FileUtil;

import java.io.IOException;

public class DemoStringUtil {
    private static String text = "C:\\Users\\User\\IdeaProjects\\untitled\\course-java-core\\src\\test\\resources\\practice.io\\text.txt";
    private static String text2 = "C:\\Users\\User\\IdeaProjects\\untitled\\course-java-core\\src\\test\\resources\\practice.io\\text2.txt";
    private static String wayNumber = "C:\\Users\\User\\IdeaProjects\\untitled\\course-java-core\\src\\test\\resources\\practice.io\\way.txt";
    private static String text3 = "C:\\Users\\User\\IdeaProjects\\untitled\\course-java-core\\src\\test\\resources\\practice.io\\text3.txt";

    public static void main(String[] args) throws IOException {
        FileUtil fileUtil = new FileUtil();

        System.out.println(System.getProperty("user.dir"));
        fileUtil.rewriteContents(text, text2);
        System.out.println(fileUtil.getListStringFromFile(wayNumber));
        System.out.println(fileUtil.getListStringVowel(text));
        System.out.println(fileUtil.getListWordWithSameLetters(text));
        System.out.println(fileUtil.getLargestCombinationNumbers(wayNumber));
        System.out.println(fileUtil.getCountCharFrequency(text));
        //System.out.println(fileUtil.getCountOfWordFrequency(text3));
    }
}
