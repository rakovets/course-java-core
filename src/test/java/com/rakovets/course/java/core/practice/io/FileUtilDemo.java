package com.rakovets.course.java.core.practice.io;

import java.io.FileNotFoundException;

public class FileUtilDemo {
    public static void main(String[] args) throws FileNotFoundException {
        FileUtil fileUtil= new FileUtil();
        System.out.println("Task1\nin output.file\n");
        fileUtil.convertingStringToUpperCase();

        System.out.println("Task2");
        System.out.println(fileUtil.printList());
        System.out.println(" ");

        System.out.println("Task3");
        System.out.println(fileUtil.printListOfStringStartedWithVowels());
        System.out.println(" ");

        System.out.println("Task4");
        System.out.println(fileUtil.printListOfWordsLastLetterSimilarToFirstLetterOfNewWord());
        System.out.println(" ");

        System.out.println("Task 5");
        System.out.println(fileUtil.printTheBiggestSetOfNumbers());
        System.out.println(" ");

        System.out.println("Task6");
        System.out.println(fileUtil.printLettersFrequency());
        System.out.println(" ");

        System.out.println("Task7");
        System.out.println(fileUtil.printWordsFrequency());
        System.out.println(" ");

        System.out.println("Task 8\nin sortedNumbers.file\n");
        fileUtil.printSortedNumbers();

        System.out.println("Task 9");
        System.out.println(fileUtil.printStudentGrades());
        System.out.println(" ");

        System.out.println("Task 10\nin javaCodeChanges.file\n");
        fileUtil.printChangedJavaCode("public", "private");
    }
}
