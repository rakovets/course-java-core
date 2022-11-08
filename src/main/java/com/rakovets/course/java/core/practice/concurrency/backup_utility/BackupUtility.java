package com.rakovets.course.java.core.practice.concurrency.backup_utility;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class BackupUtility {
    public void copy(String finalDirectory, String initialDirectory) {
        try {
            File fileFinalDirectory = new File(finalDirectory);
            File[] arrayWithFiles = fileFinalDirectory.listFiles();
            Path copiedDir = Paths.get(initialDirectory);

            if (arrayWithFiles != null) {
                for (File file : arrayWithFiles) {
                    Files.copy(file.toPath(), copiedDir.resolve(file.getName()), StandardCopyOption.REPLACE_EXISTING);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
