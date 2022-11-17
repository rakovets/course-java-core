package com.rakovets.course.java.core.practice.concurrency;

import java.nio.file.Paths;

public class BackupUtilityDemo {
    public static void main(String[] args) {
        String mainDirectory = Paths.get("src", "test", "resources", "concurrency", "testInput").toString();
        String copiedDirectory = Paths.get("src", "test", "resources", "concurrency", "testOutput").toString();
        BackupUtility backupUtility = new BackupUtility(mainDirectory, copiedDirectory);
        backupUtility.start();
    }
}
