package com.rakovets.course.java.core.practice.concurrency.backup_utility;

import java.io.*;
import java.util.logging.Logger;

public class DemoBackupUtility {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(DemoBackupUtility.class.getName());
        BackupUtility backupUtility = new BackupUtility();
        try {
            logger.info("Directory is copied? " + String.valueOf(backupUtility.backupDir("C:\\MyDir")));
        } catch (NullPointerException e) {
            logger.info("Неправильно введено имя копиркуемого директория");
        }
    }
}
