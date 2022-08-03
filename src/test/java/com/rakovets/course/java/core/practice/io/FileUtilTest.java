package com.rakovets.course.java.core.practice.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@DisplayName("File util test.")
class FileUtilTest {
    static FileUtil fileUtil;

    @BeforeAll
    static void initAll() {
        fileUtil = new FileUtil();
    }

    @Test
    @DisplayName("The method returns a list of lines in this file.")
    void toList() throws IOException {
        Collection<String> expected = new ArrayList<>(List.of("Two roads diverged in a yellow wood,\n"
                , "And sorry I could not travel both\n"
                , "And be one traveler, long I stood\n"
                , "And looked down one as far as I could\n"
                , "To where it bent in the undergrowth.\n"
                , "\n"
                , "Then took the other, as just as fair,\n"
                , "And having perhaps the better claim,\n"
                , "Because it was grassy and wanted wear;\n"
                , "Though as for that the passing there\n"
                , "Had worn them really about the same.\n"
                , "\n"
                , "And both that morning equally lay\n"
                , "In leaves no step had trodden black.\n"
                , "Oh, I kept the first for another day!\n"
                , "Yet knowing how way leads on to way,\n"
                , "I doubted if I should ever come back.\n"
                , "\n"
                , "I shall be telling this with a sigh\n"
                , "Somewhere ages and ages hence:\n"
                , "Two roads diverged in a wood, and I—\n"
                , "I took the one less traveled by,\n"
                , "And that has made all the difference.\n"));

        var actual = fileUtil.toList(Path.of("resources", "text", "poem.txt"));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("The method returns a list of lines in this file.")
    void findVowel() throws IOException {
        Collection<String> expected = new ArrayList<>(List.of("in", "a", "yellow", "one", "one", "as", "as",
                "it", "in", "undergrowth", "other", "as", "as", "it", "and", "as", "about", "equally", "another", "on",
                "if", "ever", "a", "ages", "and", "ages", "in", "a", "and", "one", "all"));

        var actual = fileUtil.findVowel(Path.of("resources", "text", "poem.txt"));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("The method returns a list of words for which the last letter matches the" +
            " first letter of the word following it")
    void findWordsByLetters() throws IOException {
        Collection<String> expected = new ArrayList<>(List.of("yellow wood", "not travel", "looked down", "that the",
                "about the", "kept the", "how way"));

        var actual = fileUtil.findWordsByLetters(Path.of("resources", "text", "poem.txt"));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test list of the largest combination.")
    void combinations() throws IOException {
        Collection<String> expected = new ArrayList<>(List.of("[1  2  3]", "[67  68  69]"));

        var actual = fileUtil.combinations(Path.of("resources", "text", "numbers.txt"));

        Assertions.assertEquals(expected, actual);
    }

    private static void extracted(Map<Character, Integer> expected) {
        expected.put('a', 57);
        expected.put('b', 12);
        expected.put('c', 9);
        expected.put('d', 36);
        expected.put('e', 68);
        expected.put('f', 8);
        expected.put('g', 14);
        expected.put('h', 36);
        expected.put('i', 30);
        expected.put('j', 1);
        expected.put('k', 7);
        expected.put('l', 26);
        expected.put('m', 7);
        expected.put('n', 37);
        expected.put('o', 49);
        expected.put('p', 5);
        expected.put('q', 1);
        expected.put('r', 32);
        expected.put('s', 32);
        expected.put('t', 51);
        expected.put('u', 10);
        expected.put('v', 8);
        expected.put('w', 18);
        expected.put('y', 11);
    }

    @Test
    @DisplayName("Test collection of letters with their repetition in the text.")
    void countLetters() throws IOException {
        Map<Character, Integer> expected = new HashMap<>();
        extracted(expected);

        var actual = fileUtil.countLetters(Path.of("resources", "text", "poem.txt"));

        Assertions.assertEquals(expected, actual);
    }

    private static void extracted(List<Map.Entry<String, Integer>> expected) {
        expected.add(Map.entry("other", 1));
        expected.add(Map.entry("One", 1));
        expected.add(Map.entry("nothing", 1));
        expected.add(Map.entry("your", 1));
        expected.add(Map.entry("two", 1));
        expected.add(Map.entry("life", 1));
        expected.add(Map.entry("The", 1));
        expected.add(Map.entry("ways", 1));
        expected.add(Map.entry("There", 1));
        expected.add(Map.entry("are", 1));
        expected.add(Map.entry("only", 1));
        expected.add(Map.entry("to", 1));
        expected.add(Map.entry("everything", 1));
        expected.add(Map.entry("live", 1));
        expected.add(Map.entry("a", 2));
        expected.add(Map.entry("though", 2));
        expected.add(Map.entry("as", 2));
        expected.add(Map.entry("miracle", 2));
        expected.add(Map.entry("is", 4));
    }

    @Test
    @DisplayName("Test collection of words in ascending order of their occurrences.")
    void countWord() throws IOException {
        List<Map.Entry<String, Integer>> expected = new ArrayList<>();
        extracted(expected);

        var actual = fileUtil.countWord(Path.of("resources", "text", "text.txt"));

        Assertions.assertEquals(expected, actual);
    }
}
