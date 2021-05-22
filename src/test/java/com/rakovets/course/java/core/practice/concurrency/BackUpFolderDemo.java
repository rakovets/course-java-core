package com.rakovets.course.java.core.practice.concurrency;

import com.rakovets.course.java.core.practice.concurrency.copy_file.BackUpFolder;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BackUpFolderDemo {
    public static void main(String[] args) {
        try {
            BackUpFolder backUpFolder = new BackUpFolder();
            String location = "./src/main/resources/practice/copy_file";
            String target = "./src/main/resources/practice/past_file";
            File locFile = new File(location);
            File tarFile = new File(target);
            BackUpFolder.copy(locFile, tarFile);
        } catch (IOException ex) {
            ex.getMessage();
        }
    }
}
