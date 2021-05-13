package com.rakovets.course.java.core.example.io;

import java.io.File;
import java.io.IOException;

public class Example1CreatingFile {
    public static void main(String[] args) {
        try {
            File file = new File("tmp-file.txt");
            if (file.exists()) {
                System.out.printf("File '%s' already exists.\n", file.getCanonicalPath());
            } else {
                if (file.createNewFile()) {
                    System.out.printf("New file '%s' is created.\n", file.getCanonicalPath());
                } else {
                    System.out.printf("New file '%s' isn't created.\n", file.getCanonicalPath());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
