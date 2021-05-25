package com.rakovets.course.java.core.practice.concurrency;

import java.io.File;
import java.io.IOException;

public class BackupUtilityDemo {
    public static void main(String[] args) {
        try {

            String location = "./src/main/resources/practice/source_file";
            String target = "./src/main/resources/practice/backup_file";
            File locFile = new File(location);
            File tarFile = new File(target);
            BackupUtility.copy(locFile, tarFile);
        } catch (IOException ex) {
            ex.getMessage();
        }
    }
}
