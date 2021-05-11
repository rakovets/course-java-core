package com.rakovets.course.java.core.practice.io;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileAnalyzeUtilDemo {
    public static void main(String[] args) {
        Path tasksFrom02To04From06To07 = Paths.get("src/main/java/com/rakovets/course/java/core/practice/io/" +
                "files/fileAnalyzeUtil-text");
        Path task08sourceFile = Paths.get("src/main/java/com/rakovets/course/java/core/practice/io/files/" +
                "fileAnalyzeUtil-task-08-nonSortedNumbers");
        Path task09 = Paths.get("src/main/java/com/rakovets/course/java/core/practice/io/files/" +
                "fileAnalyzeUtil-task-09-students-marks");
        Path task10SourceFile = Paths.get("src/main/java/com/rakovets/course/java/core/practice/io/files/" +
                "fileAnalyzeUtil-task-10-sourceFile");

        try {
            System.out.println(FileAnalyzeUtil.getTextListFromFile(tasksFrom02To04From06To07));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println(FileAnalyzeUtil.getWordsListStartingWithVowelFromFile(tasksFrom02To04From06To07));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println(FileAnalyzeUtil.getWordsListEndingWithLetterEqualFirstLetterOfNextWord(tasksFrom02To04From06To07));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println(FileAnalyzeUtil.getLetterFrequency(tasksFrom02To04From06To07));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println(FileAnalyzeUtil.getWordsFrequency(tasksFrom02To04From06To07));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            FileAnalyzeUtil.sortNumbersFromFile(task08sourceFile);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println(FileAnalyzeUtil.getStudentsAverageMarks(task09));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            FileAnalyzeUtil.changeFileModifiers(task10SourceFile, "public", "private");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
