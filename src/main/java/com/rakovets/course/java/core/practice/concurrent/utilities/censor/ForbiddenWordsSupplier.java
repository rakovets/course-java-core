package com.rakovets.course.java.core.practice.concurrent.utilities.censor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

public class ForbiddenWordsSupplier implements Callable<List<String>> {
    private final String forbiddenWordsSource;

    public ForbiddenWordsSupplier(String forbiddenWordsSource) {
        this.forbiddenWordsSource = forbiddenWordsSource;
    }

    @Override
    public List<String> call() {
        List<String> forbiddenWords = new ArrayList<>();
        List<String> forbiddenWordsPurified = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(forbiddenWordsSource))) {
            String string;
            while ((string = reader.readLine()) != null) {
                forbiddenWords.add(string);
            }
        } catch (IOException ex) {
            try {
                throw new CensorException("ForbiddenWordsSupplier: Exception during reading forbidden words");
            } catch (CensorException exception) {
                System.out.println(exception.getMessage());
            }
        }

        if (forbiddenWords.isEmpty()) {
            try {
                throw new CensorException("ForbiddenWordsSupplier: No data to check");
            } catch (CensorException exception) {
                System.out.println(exception.getMessage());
            }
        } else {
            forbiddenWordsPurified = Arrays.asList(forbiddenWords.toString().replaceAll("[\\W\\d]", " ").trim().split("\\s+"));
        }
        return forbiddenWordsPurified;
    }
}
