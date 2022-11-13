package com.rakovets.course.java.core.practice.concurrency.Backup_utility;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class BackupUtility extends Thread {
    private final String mainDir;
    private final String backupDir;

    public BackupUtility(String mainDir, String backupDir) {
        this.mainDir = mainDir;
        this.backupDir = backupDir;
    }

    @Override
    public void run() {
        try {
        File main = new File(mainDir);
        File[] list = main.listFiles();
        Path backup = Paths.get(backupDir);
        if (list != null) {
            for (File file : list) {
                Files.copy(file.toPath(), backup.resolve(file.getName()), StandardCopyOption.REPLACE_EXISTING);
            }
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
