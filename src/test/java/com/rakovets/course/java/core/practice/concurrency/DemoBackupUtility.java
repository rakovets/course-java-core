package com.rakovets.course.java.core.practice.concurrency;

import com.rakovets.course.java.core.practice.concurrency.backup_utility.BackupUtility;

public class DemoBackupUtility {
    public static void main(String[] args) {
        BackupUtility backupUtility = new BackupUtility("D://file", "D://filecopy");
        backupUtility.start();
    }
}
