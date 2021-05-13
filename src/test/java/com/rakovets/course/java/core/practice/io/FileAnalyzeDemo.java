package com.rakovets.course.java.core.practice.io;
import com.rakovets.course.java.core.practice.io.file_analyzer.FileAnalyzeUtil;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileAnalyzeDemo {
    public static void main(String[] args) {
//        System.out.println(FileAnalyzeUtil.getListWordStartWith(Paths.get("/Users/aleksej/Documents/it-academy/course-java-core/test.txt")));
//        System.out.println(FileAnalyzeUtil.getListLines(Paths.get("/Users/aleksej/Documents/it-academy/course-java-core/test.txt")));
//        System.out.println(FileAnalyzeUtil.getListWord(Paths.get("/Users/aleksej/Documents/it-academy/course-java-core/test.txt")));
//        System.out.println(FileAnalyzeUtil.findLargestCombinationNumbers(Paths.get("/Users/aleksej/Documents/it-academy/course-java-core/test.txt")));
        System.out.println(FileAnalyzeUtil.getQuantityCharsRepeating(Paths.get("/Users/aleksej/Documents/it-academy/course-java-core/test.txt")));
        System.out.println(FileAnalyzeUtil.getQuantityWordsRepeating(Paths.get("/Users/aleksej/Documents/it-academy/course-java-core/test.txt")));
    }
}
