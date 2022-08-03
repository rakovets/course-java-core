package com.rakovets.course.java.core.practice.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.nio.charset.StandardCharsets.UTF_8;

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
        var string = Files.readString(first);

        var replaceString = string.toUpperCase();

        Files.write(second, Collections.singleton(replaceString));
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
        try (var scanner = new Scanner(path)) {
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
        var vowels = "eyuoia";
        try (var scanner = new Scanner(path)) {
            while (scanner.hasNext()) {
                var word = scanner.next();
                var first = word.charAt(0);
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
        try (var scanner = new Scanner(path)) {
            String prev = null;
            if (scanner.hasNext()) {
                prev = scanner.next();
            }
            while (scanner.hasNext()) {
                var current = scanner.next();
                if (prev != null) {
                    if ((prev.charAt(prev.length() - 1) == current.charAt(0))) {
                        stringCollection.add(prev + " " + current.replaceAll("[.,?!:;\\s]", ""));
                    }
                    prev = current;
                }
            }
        }
        return stringCollection;
    }

    /**
     * Task 5.
     * <p /> The method returns a list of the largest combination of digits for each string, in ascending order.
     *
     * @param path the path to the file.
     * @return list of the largest combination.
     * @throws IOException throws an exception if the file is handled incorrectly.
     */
    public Collection<String> combinations(Path path) throws IOException {
        Collection<String> stringCollection = new ArrayList<>();
        var numbers = toList(path);
        numbers.stream()
                .map(number -> number.split("\\s+"))
                .forEachOrdered(strings -> {
                    Set<String> hashset = new TreeSet<>();
                    IntStream.range(0, strings.length - 1)
                            .filter(i -> Integer.parseInt(strings[i]) < Integer.parseInt(strings[i + 1]))
                            .forEachOrdered(i -> {
                                hashset.add(strings[i]);
                                if (Integer.parseInt(strings[i]) < Integer.parseInt(strings[i + 1])) {
                                    hashset.add(strings[i + 1]);
                                }
                            });
                    stringCollection.add(hashset.toString().replaceAll("[,\\s]", " "));
                });
        return stringCollection;
    }

    /**
     * Task 6.
     * <p /> The method returns the frequency of occurrence of all letters in the text, ignoring case.
     *
     * @param path the path to the file.
     * @return a collection of letters with their repetition in the text.
     * @throws IOException throws an exception if the file is handled incorrectly.
     */
    public Map<Character, Integer> countLetters(Path path) throws IOException {
        try (var lines = Files.lines(path, UTF_8)) {
            return lines.map(String::chars)
                    .flatMapToInt(Function.identity())
                    .mapToObj(intValue -> (char) intValue)
                    .filter(Character::isLetter)
                    .map(Character::toLowerCase)
                    .collect(Collectors.toMap(Function.identity(), it -> 1, Integer::sum));
        }
    }

    /**
     * Task 7.
     * <p /> The method returns the frequency of occurrence of all words in the text in ascending order
     * of frequency of occurrence.
     *
     * @param path the path to the file.
     * @return a collection of words in ascending order of their occurrences.
     * @throws IOException throws an exception if the file is handled incorrectly.
     */
    public List<Map.Entry<String, Integer>> countWord(Path path) throws IOException {
        Map<String, Integer> map = new HashMap<>(10);

        var text = toList(path).toString().replaceAll("[^a-zA-Z ]", "").split(" ");

        Arrays.stream(text).forEachOrdered(iterator -> map.put(iterator, map.getOrDefault(iterator, 0) + 1));
        return map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList());
    }

    /**
     * Task 10.
     * <p /> The read file method changes the current modifiers to the new modifier and spits it into the new file.
     *
     * @param firstPath  the path to the file.
     * @param secondPath the path to the file.
     * @param oldValue   the current access modifier as a string.
     * @param newValue   new access modifier as a string.
     * @throws IOException throws an exception if the file is handled incorrectly.
     */
    public void replace(Path firstPath, Path secondPath, String oldValue, String newValue) throws IOException {
        var string = Files.readString(firstPath);

        var replaceString = string.replace(oldValue, newValue);

        Files.write(secondPath, Collections.singleton(replaceString));
    }
}
