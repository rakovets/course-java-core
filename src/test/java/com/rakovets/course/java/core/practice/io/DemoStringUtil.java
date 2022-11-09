package com.rakovets.course.java.core.practice.io;

import com.rakovets.course.java.core.practice.io.file_util.FileUtil;

public class DemoStringUtil {
    private static String text = "C:\\Users\\User\\IdeaProjects\\untitled\\course-java-core\\src\\test\\java\\com\\rakovets\\course\\java\\core\\practice\\io\\text.txt";
    private static String text2 = "C:\\Users\\User\\IdeaProjects\\untitled\\course-java-core\\src\\test\\java\\com\\rakovets\\course\\java\\core\\practice\\io\\text2.txt";
    public static void main(String[] args) {
        FileUtil fileUtil = new FileUtil();
        System.out.println(System.getProperty("user.dir"));
        fileUtil.rewriteContents(text, text2);
        System.out.println();
        System.out.println(fileUtil.getListStringFromFile(text));
        System.out.println();
        System.out.println(fileUtil.getListStringVowel(text));
        System.out.println();
        System.out.println(fileUtil.getListWordWithSameLetters(text));
    }
}
