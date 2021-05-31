package com.rakovets.course.java.core.practice.concurrency.backup_utility;

public class BackUpReaderDemo {
    public static void main(String[] args) {
        Thread backUp = new Thread(new BackUpReader(), "BackUp");
        backUp.start();
    }
}
