package com.rakovets.course.java.core.practice.concurrency.utility;

import com.rakovets.course.java.core.util.AnsiColorCode;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class SaveProgram {
    public static void main(String[] args) {
        Path path = Paths.get("src", "main", "resources", "save.properties");
        Properties p = new Properties();
        try (FileReader reader = new FileReader(path.toFile())) {
            p.load(reader);
        } catch (IOException ex) {
            System.out.printf("%s%s%s\n", AnsiColorCode.FG_RED_BOLD,
                    "There is a problem with writing path for properties", AnsiColorCode.RESET);
        }

        String filePathForReading = p.getProperty("filePathForReading");
        String directoryForSaving = p.getProperty("directoryForSaving");
        long timeBetweenSavesMinute = 1;

        BackupUtility.getCopy(filePathForReading, directoryForSaving, timeBetweenSavesMinute);
    }
}
