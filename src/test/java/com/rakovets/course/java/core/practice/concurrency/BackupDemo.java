package com.rakovets.course.java.core.practice.concurrency;

import com.rakovets.course.java.core.practice.concurrency.Backup_utility.BackupUtility;

public class BackupDemo {
    public static void main(String[] args) {
       BackupUtility backupUtility = new BackupUtility("/Users/nikita/Downloads/Java/backup", "/Users/nikita/Downloads/Java/backup1");
       backupUtility.start();
    }
}
