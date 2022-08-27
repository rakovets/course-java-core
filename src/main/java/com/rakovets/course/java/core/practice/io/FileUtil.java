package com.rakovets.course.java.core.practice.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Path;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class FileUtil {
    public void toUpperCase(Path first, Path second) {
        try (BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(first)));
             BufferedWriter writer = new BufferedWriter(new FileWriter(String.valueOf(second)))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toUpperCase());
                writer.write('\n');
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    public Collection<String> getListStrings(Path first) {
        Collection<String> collectionStrings = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(first)))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                collectionStrings.add(line + "\n");
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
        return collectionStrings;
    }

    public Collection<String> getListWordsStartWithVowel(Path filePath) {
        Collection<String> listStrings = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(filePath)))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split(" ");
                Arrays.stream(words)
                        .filter(s -> s.matches("[AaEeIiOoUuYy](.*)"))
                        .forEach(listStrings::add);
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
        return listStrings;
    }

    public Collection<String> getListLastEqualsFirstLetters(Path filePath) {
        Collection<String> listStrings = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(filePath)))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.toLowerCase().replaceAll("\\.W", "").split(" ");
                for (int i = 0; i < strings.length - 1; i++) {
                    if (strings[i].charAt(strings[i].length() - 1) == strings[i + 1].charAt(0)) {
                        listStrings.add(strings[i]);
                    }
                }
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
        return listStrings;
    }
}
