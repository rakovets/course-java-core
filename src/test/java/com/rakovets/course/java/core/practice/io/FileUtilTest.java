package com.rakovets.course.java.core.practice.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@DisplayName("File util test.")
class FileUtilTest {
    FileUtil fileUtil;
    Path path;

    @BeforeEach
    void init() {
        fileUtil = new FileUtil();

        path = Path.of("resources", "text", "poem.txt");
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

        Collection<String> actual = fileUtil.toList(path);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("The method returns a list of lines in this file.")
    void findVowel() throws IOException {
        Collection<String> expected = new ArrayList<>(List.of("in", "a", "yellow", "one", "one", "as", "as",
                "it", "in", "undergrowth", "other", "as", "as", "it", "and", "as", "about", "equally", "another", "on",
                "if", "ever", "a", "ages", "and", "ages", "in", "a", "and", "one", "all"));

        Collection<String> actual = fileUtil.findVowel(path);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    @DisplayName("The method returns a list of words for which the last letter matches the" +
            " first letter of the word following it")
    void findWordsByLetters() throws IOException {
        Collection<String> expected = new ArrayList<>(List.of("yellow wood", "not travel", "looked down", "that the",
                "about the", "kept the", "how way"));

        Collection<String> actual = fileUtil.findWordsByLetters(path);

        Assertions.assertEquals(expected, actual);
    }


}
