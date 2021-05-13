package com.rakovets.course.java.core.example.io;

import com.rakovets.course.java.core.util.DateUtil;

import java.io.File;

public class Example3DirectoryInfo {
    public static void main(String[] args) {
        File dir = new File("src" + File.separator + "main");
        if (dir.exists() && dir.isDirectory()) {
            File[] files = dir.listFiles();
            if (files != null) {
                System.out.printf("%-20s%-10s%s\n", "Path", "Size", "Last modified");
                for (File file : files) {
                    System.out.printf("%-20s%-10d%s\n", file.getPath(), file.length(),
                            DateUtil.convertFromEpochMilli(file.lastModified()));
                }
            }
        }

        File root = File.listRoots()[0];
        System.out.printf("\nDirectory:\t\t%s\n", root.getPath());
        System.out.printf("Total space:\t%,d byte\n", root.getTotalSpace());
        System.out.printf("Usable space:\t%,d byte\n", root.getUsableSpace());
    }
}
