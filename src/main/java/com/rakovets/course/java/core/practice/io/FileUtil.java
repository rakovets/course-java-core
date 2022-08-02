package com.rakovets.course.java.core.practice.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public final class FileUtil {
    /**
     * Task 1.
     * <p /> The method rewrites the contents of one file to another file, but only in UPPERCASE.
     *
     * @param first  path.
     * @param second path.
     * @throws IOException throws an exception if the file is handled incorrectly.
     */
    public void toUpperCase(Path first, Path second) throws IOException {
        try (InputStreamReader input =
                     new InputStreamReader(new FileInputStream(first.toFile()), StandardCharsets.UTF_8);
             OutputStreamWriter output =
                     new OutputStreamWriter(new FileOutputStream(second.toFile()), StandardCharsets.UTF_8)) {
            while (input.ready()) {
                char chLowCase = (char) input.read();
                char chUpperCase = Character.toUpperCase(chLowCase);
                output.write(chUpperCase);
            }
        }
    }

    /**
     * Task 2.
     * <p /> The method returns a list of lines in this file.
     *
     * @param path the path to the file.
     * @return list of lines in this file.
     * @throws IOException throws an exception if the file is handled incorrectly.
     */
    public Collection<String> toList(Path path) throws IOException {
        Collection<String> stringCollection = new ArrayList<>();
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNext()) {
                stringCollection.add(scanner.nextLine() + "\n");
            }
        }
        return stringCollection;
    }

    /**
     * Task 3.
     * <p /> The method returns a list of words starting with a vowel.
     *
     * @param path the path to the file.
     * @return words that begin with a vowel.
     * @throws IOException throws an exception if the file is handled incorrectly.
     */
    public Collection<String> findVowel(Path path) throws IOException {
        Collection<String> stringCollection = new ArrayList<>();
        String vowels = "eyuoia";
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                char first = word.charAt(0);
                if (vowels.indexOf(first) != -1) {
                    stringCollection.add(word.replaceAll("[.,?!:;\\s]", ""));
                }
            }
        }
        return stringCollection;
    }

    /**
     * Task 4.
     * <p /> The method returns a list of words for which the last letter matches the first letter of the word
     * following it.
     *
     * @param path the path to the file.
     * @return list of words for which the last letter matches the first letter of the word following it.
     * @throws IOException throws an exception if the file is handled incorrectly.
     */
    public Collection<String> findWordsByLetters(Path path) throws IOException {
        Collection<String> stringCollection = new ArrayList<>();
        try (Scanner scanner = new Scanner(path)) {
            String prev = null;
            if (scanner.hasNext()) {
                prev = scanner.next();
            }
            while (scanner.hasNext()) {
                String current = scanner.next();
                if (prev != null) {
                    if ((prev.charAt(prev.length() - 1) == current.charAt(0))) {
                        stringCollection.add(prev + " "
                                + current.replaceAll("[.,?!:;\\s]", ""));
                    }
                    prev = current;
                }
            }
        }
        return stringCollection;
    }
}
