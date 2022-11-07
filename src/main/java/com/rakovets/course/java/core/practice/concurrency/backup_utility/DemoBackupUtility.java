package com.rakovets.course.java.core.practice.concurrency.backup_utility;

import java.io.*;
import java.util.logging.Logger;

public class DemoBackupUtility {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(DemoBackupUtility.class.getName());
        BackupUtility backupUtility = new BackupUtility();
        try {
            backupUtility.backupDir("C:\\MyDir");
            logger.info("Directory is copied? " + String.valueOf(String.valueOf(backupUtility.getIsCopied())));
        } catch (NullPointerException e) {
            logger.info("Неправильно введено имя копиркуемого директория");
        }
    }
}
