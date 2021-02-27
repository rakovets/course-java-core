package com.rakovets.course.java.core.practice.concurrency.common.censor;

import java.util.Scanner;

public class CensorDemo {
    public static void main(String[] args) {


        SearchAndMergeFilesThread searchAndMergeFilesThread = new SearchAndMergeFilesThread("src/test/resources/practice/concurrency/censor", "weather");
        searchAndMergeFilesThread.start();

        RemovingForbiddenWordsThread removeForbiddenWords = new RemovingForbiddenWordsThread();
        removeForbiddenWords.start();



    }
}
