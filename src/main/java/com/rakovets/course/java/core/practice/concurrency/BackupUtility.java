package com.rakovets.course.java.core.practice.concurrency;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.logging.Logger;

public class BackupUtility extends Thread {
    private static final Logger logger = Logger.getLogger(BackupUtility.class.getName());
    private final String mainDirectory;
    private final String copiedDirectory;

    public BackupUtility(String mainDirectory, String copiedDirectory) {
        this.mainDirectory = mainDirectory;
        this.copiedDirectory = copiedDirectory;
    }

    @Override
    public void run() {
        try {
            File main = new File(mainDirectory);
            File[] listOfFiles = main.listFiles();
            Path copiedDir = Paths.get(copiedDirectory);
            if (listOfFiles != null) {
                for (File file : listOfFiles) {
                    Files.copy(file.toPath(), copiedDir.resolve(file.getName()), StandardCopyOption.REPLACE_EXISTING);
                }
            }
        } catch (IOException e) {
            logger.info(e.getMessage());
        }
    }
}
