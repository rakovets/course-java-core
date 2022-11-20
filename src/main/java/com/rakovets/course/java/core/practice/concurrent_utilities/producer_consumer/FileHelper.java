package com.rakovets.course.java.core.practice.concurrent_utilities.producer_consumer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileHelper {

    private String FILE_NAME = "";

    public void setFilename(final String filename) {
        FILE_NAME = filename;
    }

    public synchronized void addLineToFile(final String line) {
        try {
            Files.write(
                    Paths.get(FILE_NAME),
                    (line + "\n").getBytes(),
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
