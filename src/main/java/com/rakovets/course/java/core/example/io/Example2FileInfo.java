package com.rakovets.course.java.core.example.io;

import com.rakovets.course.java.core.util.DateUtil;

import java.io.File;
import java.io.IOException;

public class Example2FileInfo {
    public static void main(String[] args) {
        File fp = ExampleFiles.INPUT_FILE;

        if (fp.isFile()) {
            System.out.printf("Name: %s\n", fp.getName());
            System.out.printf("Parent: %s\n", fp.getParent());
            System.out.printf("Path: %s\n", fp.getPath());
            System.out.printf("Absolute path: %s\n", fp.getAbsolutePath());
            try {
                System.out.printf("Canonical path: %s\n", fp.getCanonicalPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.printf("File size: %s\n", fp.length());
            System.out.printf("Last Modified: %s\n", DateUtil.convertFromEpochMilli(fp.lastModified()));
            System.out.printf("Readable: %s\n", fp.canRead());
            System.out.printf("Writable: %s\n", fp.canWrite());
            System.out.printf("Executable: %s\n", fp.canExecute());
        }
    }
}
