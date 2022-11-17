package com.rakovets.course.java.core.practice.io;

import com.rakovets.course.java.core.practice.io.file_util.FileUtil;

import java.io.IOException;

public class DemoStringUtil {
    private static final String text = "C:\\Users\\User\\IdeaProjects\\untitled\\course-java-core\\src\\test\\resources\\practice.io\\text.txt";
    private static final String text2 = "C:\\Users\\User\\IdeaProjects\\untitled\\course-java-core\\src\\test\\resources\\practice.io\\text2.txt";
    private static final String wayNumber = "C:\\Users\\User\\IdeaProjects\\untitled\\course-java-core\\src\\test\\resources\\practice.io\\way.txt";
    private static final String text3 = "C:\\Users\\User\\IdeaProjects\\untitled\\course-java-core\\src\\test\\resources\\practice.io\\text3.txt";
    private static final String numbers = "C:\\Users\\User\\IdeaProjects\\untitled\\course-java-core\\src\\test\\resources\\practice.io\\numbers.txt";
    private static final String studentsMarks = "C:\\Users\\User\\IdeaProjects\\untitled\\course-java-core\\src\\test\\resources\\practice.io\\studentsMarks.txt";
    private static final String pattern = "_";

    public static void main(String[] args) throws IOException {
        FileUtil fileUtil = new FileUtil();

        System.out.println(System.getProperty("user.dir"));
        fileUtil.rewriteContents(text, text2);
        System.out.println(fileUtil.getListStringFromFile(wayNumber));
        System.out.println(fileUtil.getListStringVowel(text));
        System.out.println(fileUtil.getListWordWithSameLetters(text));
        System.out.println(fileUtil.getLargestCombinationNumbers(wayNumber));
        System.out.println(fileUtil.getCountCharFrequency(text));
        System.out.println(fileUtil.getCountOfWordsCharFrequency(text3));
        fileUtil.getSortInAscendingOrder(numbers, pattern);
        System.out.println(fileUtil.getStudentPerformance(studentsMarks));
    }
}
//Smirnov,4,6,8,9,9,2
//        Sobovev,5,2,5,8,9,8
//        Koba,2,5,4,5,3,5
