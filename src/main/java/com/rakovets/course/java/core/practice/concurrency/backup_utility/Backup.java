package com.rakovets.course.java.core.practice.concurrency.backup_utility;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Backup extends Thread{
    private final Logger logger = Logger.getLogger(Backup.class.getName());
    private final String mainDirectory;
    private final String copiedDirectory;

    public Backup(String mainDirectory, String copiedDirectory) {
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
            logger.log(Level.WARNING, "StackTrace " + Arrays.toString(e.getStackTrace()));
        }
    }
}
