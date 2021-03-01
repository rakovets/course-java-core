package com.rakovets.course.java.core.practice.concurrency.common.Censor;

import java.util.Scanner;

class CensorDemo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter path to directory (src\\main\\resources\\TextFiles): ");
        String directoryPath = in.nextLine();
        System.out.println("Enter word you would like to search for (Java): ");
        String searchWord = in.nextLine();

        SearchThread searchThread = new SearchThread(directoryPath, searchWord);
        CutThread cutThread = new CutThread(searchThread);

        long startTimeSearchThread = System.nanoTime();
        searchThread.start();
        long executionTimeSearchThread = System.nanoTime() - startTimeSearchThread;
        System.out.println("Searching took " + executionTimeSearchThread + " nanoseconds");

        long startTimeCutThread = System.nanoTime();
        cutThread.start();
        long executionTimeCutThread = System.nanoTime() - startTimeCutThread;
        System.out.println("Cutting took " + executionTimeCutThread + " nanoseconds");

        System.out.println("Merging completed");
    }
}
