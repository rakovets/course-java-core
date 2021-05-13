package com.rakovets.course.java.core.practice.io;

import com.rakovets.course.java.core.practice.io.file_analyzer.FileAnalyzeUtil;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileAnalyzeUtilDemo {
    public static void main(String[] args) {
        Path task02 = Paths.get("src", "main", "resources", "practice", "task02");

        System.out.println(FileAnalyzeUtil.takeFilePathGetListString(task02));
    }
}
