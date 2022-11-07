package com.rakovets.course.java.core.practice.concurrency;

import com.rakovets.course.java.core.practice.concurrency.backup_utility.BackupUtility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

public class BackupUtiliteTests {
    BackupUtility backupUtility = new BackupUtility();
    @Test
    public void testBackupDir() {
        String dirName = "C:\\MyDir";
        File dir = new File(dirName);
        long sizeOfAllFilesExpected = 0L;
        for (File item : dir.listFiles()) {
            sizeOfAllFilesExpected += item.length();
        }
        System.out.println(sizeOfAllFilesExpected);

        String copyDirName = backupUtility.backupDir(dirName);
        File copyDir = new File(copyDirName);
        long sizeOfAllFilesActual = 0L;
        for (File item : copyDir.listFiles()) {
            sizeOfAllFilesActual += item.length();
        }

        Assertions.assertEquals(sizeOfAllFilesExpected, sizeOfAllFilesActual);
    }
}
