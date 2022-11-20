package com.rakovets.course.java.core.practice.io;

import java.nio.file.Paths;

public class FileUtilDemo {
    private static final String SOURCE_FILE =  Paths.get("src", "test", "resources", "practice.io", "input.file").toString();
    private static final String TARGET_FILE = Paths.get("src", "test", "resources", "practice.io", "output.file").toString();
    private static final String NUMBER_SET_FILE = Paths.get("src", "test", "resources", "practice.io", "numberSet.file").toString();
    private static final String NUMBER_FILE = Paths.get("src", "test", "resources", "practice.io", "numbers.file").toString();
    private static final String SORTED_NUMBERS_FILE = Paths.get("src", "test", "resources", "practice.io", "sortedNumbers.file").toString();
    private static final String STUDENTS_FILE = Paths.get("src", "test", "resources", "practice.io", "students.file").toString();
    private static final String JAVA_CODE_FILE = Paths.get("src", "test", "resources", "practice.io", "javaCode.file").toString();
    private static final String CHANGED_JAVA_CODE_FILE = Paths.get("src", "test", "resources", "practice.io", "javaCodeChanged.file").toString();

    public static void main(String[] args) {
        FileUtil fileUtil= new FileUtil();

        fileUtil.convertingStringToUpperCase(SOURCE_FILE, TARGET_FILE);
        System.out.println("Task1\nin output.file\n");

        System.out.println("Task2");
        System.out.println(fileUtil.printList(SOURCE_FILE));
        System.out.println(" ");

        System.out.println("Task3");
        System.out.println(fileUtil.printListOfStringStartedWithVowels(SOURCE_FILE));
        System.out.println(" ");

        System.out.println("Task4");
        System.out.println(fileUtil.printListOfWordsLastLetterSimilarToFirstLetterOfNewWord(SOURCE_FILE));
        System.out.println(" ");

        System.out.println("Task 5");
        System.out.println(fileUtil.printTheBiggestSetOfNumbers(NUMBER_SET_FILE));
        System.out.println(" ");

        System.out.println("Task6");
        System.out.println(fileUtil.printLettersFrequency(SOURCE_FILE));
        System.out.println(" ");

        System.out.println("Task7");
        System.out.println(fileUtil.printWordsFrequencyByOrder(SOURCE_FILE));
        System.out.println(" ");

        fileUtil.printSortedNumbers(NUMBER_FILE, SORTED_NUMBERS_FILE);
        System.out.println("Task 8\nin sortedNumbers.file\n");

        System.out.println("Task 9");
        System.out.println(fileUtil.printStudentGrades(STUDENTS_FILE));
        System.out.println(" ");

        fileUtil.printChangedJavaCode(JAVA_CODE_FILE,CHANGED_JAVA_CODE_FILE,"public", "private");
        System.out.println("Task 10\nin javaCodeChanges.file\n");
    }
}
