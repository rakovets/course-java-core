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

public class BackupUtility extends Thread {
    private final Logger logger = Logger.getLogger(BackupUtility.class.getName());

    private final String dir;
    private final String copyDir;

    public BackupUtility(String dir, String copyDir) {
        this.dir = dir;
        this.copyDir = copyDir;
    }

    @Override
    public void run() {
        File file = new File(dir);
        File[] files = file.listFiles();
        Path copiedDir = Paths.get(copyDir);
        if (files != null) {
            for (File file1 : files) {
                try {
                    Files.copy(file1.toPath(), copiedDir.resolve(file1.getName()), StandardCopyOption.REPLACE_EXISTING);
                } catch (IOException e) {
                    logger.log(Level.WARNING, Arrays.toString(e.getStackTrace()));
                }
            }
        }
    }
}
