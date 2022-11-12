package com.rakovets.course.java.core.practice.concurrency.backup_utility;

import java.io.*;
import java.util.logging.Logger;

public class DemoBackupUtility {
    public static void main(String[] args) throws IOException {
        Thread backupUtility = new BackupUtility("Manager thread");
        backupUtility.start();
    }
}

