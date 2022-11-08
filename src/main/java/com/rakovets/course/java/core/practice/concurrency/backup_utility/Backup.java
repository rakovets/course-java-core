package com.rakovets.course.java.core.practice.concurrency.backup_utility;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Backup {
    public void copy(String mainDirectory, String copiedDirectory) {
        try {
            File main = new File(mainDirectory);
            File[] listOfFiles = main.listFiles();
            Path copiedDir = Paths.get(copiedDirectory);
            if (listOfFiles != null) {
                for (File file : listOfFiles) {
                    Files.copy(file.toPath(), copiedDir.resolve(file.getName()), StandardCopyOption.REPLACE_EXISTING);
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
