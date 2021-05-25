package com.rakovets.course.java.core.practice.concurrency;

import java.util.LinkedList;
import java.util.Queue;

public class Storage {
    private static Queue<Integer> numberStorage = new LinkedList<>();
    private static boolean isRun;

    public static Queue<Integer> getNumberStorage() {
        return numberStorage;
    }

    public static boolean addNumber(int number) {
        return numberStorage.add(number);
    }

    public static void setIsRun(boolean isRun) {
        Storage.isRun = isRun;
    }
    public static boolean isIsRun() {
        return isRun;
    }
}
