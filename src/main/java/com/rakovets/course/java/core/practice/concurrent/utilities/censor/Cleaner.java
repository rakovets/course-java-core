package com.rakovets.course.java.core.practice.concurrent.utilities.censor;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Cleaner implements Runnable {
    private final String forbiddenWordsSource;
    private final String objectForCleaning;

    public Cleaner(String forbiddenWordsSource, String objectForCleaning) {
        this.forbiddenWordsSource = forbiddenWordsSource;
        this.objectForCleaning = objectForCleaning;
    }

    @Override
    public void run() {
        List<String> forbiddenWords = new ArrayList<>();
        List<String> cleaningObject = new ArrayList<>();
        List<String> purifiedText = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(forbiddenWordsSource))) {
            String string;
            while ((string = reader.readLine()) != null) {
                forbiddenWords.add(string);
            }
        } catch (IOException ex) {
            try {
                throw new CensorException("Cleaner: Exception during reading forbidden words");
            } catch (CensorException exception) {
                System.out.println(exception.getMessage());
            }
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(objectForCleaning))) {
            String string;
            while ((string = reader.readLine()) != null) {
                cleaningObject.add(string);
            }
        } catch (IOException ex) {
            try {
                throw new CensorException("Cleaner: Exception during reading object for cleaning");
            } catch (CensorException exception) {
                System.out.println(exception.getMessage());
            }
        }

        if (forbiddenWords.isEmpty()) {
            try {
                throw new CensorException("Cleaner: No data to check");
            } catch (CensorException exception) {
                System.out.println(exception.getMessage());
            }
        } else {
            String[] forbiddenWordsArray = forbiddenWords.toString().replaceAll("[\\W\\d]", " ").trim().split("\\s+");

            for (String stringForCleaning : cleaningObject) {
                String purified = stringForCleaning;
                for (String word : forbiddenWordsArray) {
                    purified = purified.replaceAll(word, "");
                    purified = purified.replaceAll(word.toLowerCase(Locale.ROOT), "");
                }
                purifiedText.add(purified);
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(objectForCleaning))) {
                for(String data : purifiedText) {
                    bw.write(data + "\n");
                }
                bw.flush();
            } catch (IOException ex) {
                try {
                    throw new CensorException("Cleaner: Mistakes of writing have occurred");
                } catch (CensorException exception) {
                    System.out.println(exception.getMessage());
                }
            }
        }
    }
}
