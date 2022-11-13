package com.rakovets.course.java.core.practice.io.file_util;

import java.nio.file.Path;

public class FileUtilDemo {
    public static void main(String[] args) {
        FileUtil fileUtil = new FileUtil();
        Path task01InitialFile = Path.of("C://Users/aliakseih/IdeaProjects/course-java-core/src/test/resources/practice.io/file_util/Task01InitialFileDemo");
        Path task01TargetFile = Path.of("C://Users/aliakseih/IdeaProjects/course-java-core/src/test/resources/practice.io/file_util/Task01TargetFileDemo");
        Path task03File = Path.of("C://Users/aliakseih/IdeaProjects/course-java-core/src/test/resources/practice.io/file_util/Task03FileDemo");
        Path task04File = Path.of("C://Users/aliakseih/IdeaProjects/course-java-core/src/test/resources/practice.io/file_util/Task04FileDemo");
        Path task08File = Path.of("C://Users/aliakseih/IdeaProjects/course-java-core/src/test/resources/practice.io/file_util/Task08FileDemo");
        Path task10FileInitial = Path.of("C://Users/aliakseih/IdeaProjects/course-java-core/src/test/resources/practice.io/file_util/Task10FileDemoInitial");

        //Task01Demo
        fileUtil.overrideDataToUpperCase(task01InitialFile, task01TargetFile);

        //Task03Demo
        System.out.println("Task03Demo");
        System.out.println(fileUtil.extractWordsWithVowelsFromPath(task03File));

        //Task04Demo
        System.out.println("Task04Demo");
        System.out.println(fileUtil.extractWordLastLetterEqualsFirstLetterNextWord(task04File));

        //Task08Demo
        System.out.println("Task08Demo");
        fileUtil.sortIntegersAscendingOrderFromFileToAnother(task08File);

        //Task10Demo
        System.out.println("Task10Demo is finished");
        fileUtil.changeAccessModifier(task10FileInitial, "public", "private");
    }
}
