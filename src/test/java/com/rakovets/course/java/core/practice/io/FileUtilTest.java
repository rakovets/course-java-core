package com.rakovets.course.java.core.practice.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileUtilTest {
    static FileUtil fileUtil;
    Path path = Path.of("src","test", "resources", "practice.io", "textIn.txt");
    Path pathNumbers = Path.of("src", "test", "resources", "practice.io", "numbers.txt");
    Path pathStudents = Path.of("src", "test", "resources", "practice.io", "studentsMarks.txt");
    @BeforeAll
    static void initAll() {
        fileUtil = new FileUtil();
    }

    private static ArrayList<String> getExpected() {
        return new ArrayList<>(List.of("A summer day",
                "Has rain or sun,",
                "But either way",
                "I find it fun.",
                "To stand in the rain",
                "That’s pouring down",
                "Or lie in the sun",
                "That paints me brown.",
                "One two three it is a Christmas tree eeee!",
                "Three two one Christmas is fun nanana!"));
    }

    @Test
    public void getListLines() {
        List<String> expected = getExpected();

        List<String> actual = fileUtil.getListLines(path);

        Assertions.assertEquals(expected, actual);
    }

    private static ArrayList<String> getStrings() {
        return new ArrayList<>(List.of("A", "or", "either", "I", "it", "in", "Or", "in",
                "One", "it", "is", "a", "eeee!", "one", "is"));
    }

    @Test
    void findWordsStartingWithVowel() {
        List<String> expected = getStrings();

        List<String> actual = fileUtil.getWordsStartingWithVowel(path);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findWordsLastLetterMatchesFirst() {
        List<String> expected = new ArrayList<>(List.of("tree", "two", "fun"));

        List<String> actual = fileUtil.getWordsLastLetterMatchesFirst(path);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findListLargestCombination() {
        List<String> expected = new ArrayList<>(List.of("1 2 3 4", "56 78 90", "1 3 5 78", "1 2 3 4 5"));

        List<String> actual = fileUtil.getListLargestCombinationOfDigitsInAscendingOrder(pathNumbers);

        Assertions.assertEquals(expected, actual);
    }

    private static void getMapLetters(Map<Character, Integer> expected) {
        expected.put('a',16);
        expected.put('b', 2);
        expected.put('c', 2);
        expected.put('d', 4);
        expected.put('e', 19);
        expected.put('f', 3);
        expected.put('g', 1);
        expected.put('h', 10);
        expected.put('i', 16);
        expected.put('l', 1);
        expected.put('m', 5);
        expected.put('n', 19);
        expected.put('o', 10);
        expected.put('p', 2);
        expected.put('r', 13);
        expected.put('s', 13);
        expected.put('t', 20);
        expected.put('u', 7);
        expected.put('w', 5);
        expected.put('y', 2);
    }

    @Test
    void findAllLettersInText() {
        Map<Character, Integer> expected = new HashMap<>();
        getMapLetters(expected);

        var actual = fileUtil.getAllLettersInTextIgnoreCase(path);

        Assertions.assertEquals(expected, actual);
    }

    private static void getMapWord(List<Map.Entry<String, Integer>> expected) {
        expected.add(Map.entry("A", 1));
        expected.add(Map.entry("Or", 1));
        expected.add(Map.entry("One", 1));
        expected.add(Map.entry("I", 1));
        expected.add(Map.entry("lie", 1));
        expected.add(Map.entry("pouring", 1));
        expected.add(Map.entry("down", 1));
        expected.add(Map.entry("three", 1));
        expected.add(Map.entry("summer", 1));
        expected.add(Map.entry("either", 1));
        expected.add(Map.entry("find", 1));
        expected.add(Map.entry("me", 1));
        expected.add(Map.entry("To", 1));
        expected.add(Map.entry("stand", 1));
        expected.add(Map.entry("day", 1));
        expected.add(Map.entry("But", 1));
        expected.add(Map.entry("a", 1));
        expected.add(Map.entry("or", 1));
        expected.add(Map.entry("nanana", 1));
        expected.add(Map.entry("one", 1));
        expected.add(Map.entry("tree", 1));
        expected.add(Map.entry("brown", 1));
        expected.add(Map.entry("way", 1));
        expected.add(Map.entry("Three", 1));
        expected.add(Map.entry("eeee", 1));
        expected.add(Map.entry("paints", 1));
        expected.add(Map.entry("s", 1));
        expected.add(Map.entry("Has", 1));
        expected.add(Map.entry("Christmas", 2));
        expected.add(Map.entry("sun", 2));
        expected.add(Map.entry("two", 2));
        expected.add(Map.entry("That", 2));
        expected.add(Map.entry("rain", 2));
        expected.add(Map.entry("in", 2));
        expected.add(Map.entry("is", 2));
        expected.add(Map.entry("it", 2));
        expected.add(Map.entry("the", 2));
        expected.add(Map.entry("fun", 2));
    }

    @Test
    void findAllWordsInText() {
        List<Map.Entry<String, Integer>> expected = new ArrayList<>();
        getMapWord(expected);

        var actual = fileUtil.getAllWordsInText(path);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findStudentsMarks() {
        List<String> expected = List.of("Volkov - average mark: 6,11", "Sokolov - average mark: 7,88", "Makarov - average mark: 7,75");

        List<String> actual = fileUtil.getStudentsMarks(pathStudents);

        Assertions.assertEquals(expected, actual);
    }
}
