package com.rakovets.course.java.core.practice.concurrency;

import com.rakovets.course.java.core.practice.concurrency.backup_utility.Backup;

public class BackupDemo {
    public static void main(String[] args) {
        Backup backup = new Backup();
        backup.copy("D://filewriter", "D://filewriter_");
    }
}
