package com.rakovets.course.java.core.practice.concurrency.backup_utility;

import java.io.*;
import java.util.logging.Logger;

public class DemoBackupUtility {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(DemoBackupUtility.class.getName());
        BackupUtility backupUtility = new BackupUtility();
        try {
            String nameOfCopyDirectory = backupUtility.backupDir("C:\\MyDir");
            logger.info("Directory is copied? " + String.valueOf(String.valueOf(backupUtility.getIsCopied())));
            logger.info("Name of cope directory is: " + nameOfCopyDirectory);
        } catch (NullPointerException e) {
            logger.info("Неправильно введено имя копиркуемого директория");
        }

        try {
            String nameOfCopyDirectory = backupUtility.backupDirByByte("C:\\MyDir");
            logger.info("Directory is copied? " + String.valueOf(String.valueOf(backupUtility.getIsCopiedByByte())));
            logger.info("Name of cope directory is: " + nameOfCopyDirectory);
        } catch (NullPointerException e) {
            logger.info("Неправильно введено имя копиркуемого директория");
        }
    }
}
