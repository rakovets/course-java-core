package com.rakovets.course.java.core.practice.concurrency;

import com.rakovets.course.java.core.practice.concurrency.backup_utility.BackupUtility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;


public class BackupUtiliteTests {
    BackupUtility backupUtility = new BackupUtility("BackupUtility");

    @Test
    public void testBackupUtility() {
        //backupUtility.start();
        String dirName = "C:\\MyDir";
        String copyDirName = "C:\\MyDir_copy";
        File dir = new File(dirName);
        dir.mkdir();
        long sizeOfAllFilesExpected = 0L;
        for (File item : dir.listFiles()) {
            sizeOfAllFilesExpected += item.length();
        }
        System.out.println(sizeOfAllFilesExpected);

        File copyDir = new File(copyDirName);
        copyDir.mkdir();
        long sizeOfAllFilesActual = 0L;
        for (File item : copyDir.listFiles()) {
            sizeOfAllFilesActual += item.length();
        }

        Assertions.assertEquals(sizeOfAllFilesExpected, sizeOfAllFilesActual);
    }
}
