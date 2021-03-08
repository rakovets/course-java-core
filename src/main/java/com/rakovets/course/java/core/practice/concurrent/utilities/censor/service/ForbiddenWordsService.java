package com.rakovets.course.java.core.practice.concurrent.utilities.censor.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

public class ForbiddenWordsService {
    public static BufferedReader reader;
    public static String string;
    public static Set<String> forbiddenWords = new HashSet<>();

    public static void getForbiddenWords(Path forbiddenPath) {
        try {
            reader = new BufferedReader(new FileReader(String.valueOf(forbiddenPath)));
            while ((string = reader.readLine()) != null) {
                forbiddenWords.add(string);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        CutterService.setForbiddenWords(forbiddenWords);
    }
}
