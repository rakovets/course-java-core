package com.rakovets.course.java.core.practice.concurrent.utilities;

import com.rakovets.course.java.core.practice.concurrent.utilities.censor.RemovingForbiddenWordsThread;
import com.rakovets.course.java.core.practice.concurrent.utilities.censor.SearchAndMergeFilesThread;

import java.util.Scanner;

public class CensorDemo {
    public static void main(String[] args) throws InterruptedException {
        String mergedFiles = "src/test/java/resources/practice/concurrent/utilities/mergedFiles.txt";
        String forbiddenWords = "src/test/java/resources/practice/concurrent/utilities/forbiddenWords.txt";
        System.out.println("Enter path directory for search:");
        Scanner scanner1 = new Scanner(System.in);
        String pathForSearch = scanner1.nextLine();
        System.out.println("Enter word for search:");
        Scanner scanner2 = new Scanner(System.in);
        String wordForSearch = scanner2.nextLine();
        SearchAndMergeFilesThread searchAndMergeFilesThread = new SearchAndMergeFilesThread(pathForSearch, wordForSearch, mergedFiles);
        searchAndMergeFilesThread.start();
        searchAndMergeFilesThread.join();
        RemovingForbiddenWordsThread removeForbiddenWords = new RemovingForbiddenWordsThread(forbiddenWords, mergedFiles);
        removeForbiddenWords.start();
    }
}
