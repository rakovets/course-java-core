package com.rakovets.course.java.core.practice.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class FileUtilTests {
    FileUtil fileUtil = new FileUtil();

    static Stream<Arguments> provideArgumentsGetListOfStrings() {
        return Stream.of(
                Arguments.of(Paths.get("src", "test", "resources", "practice.io", "numbers.txt"),
                        List.of("34 7 8 38 1 3", "8 7 6 5 4 3 1", "87 45 76 35 75 24")),
                Arguments.of(Paths.get("src", "test", "resources", "practice.io", "studentsProgress.txt"),
                        List.of("Komleva, 8, 9, 10", "Flurick, 5, 8, 7", "Belka, 4, 9, 6"))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetListOfStrings")
    public void getListOfStrings(Path inputFilePath, List<String> expected) {
        List<String> actual = fileUtil.getListOfStrings(inputFilePath);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getWordsStartsWithVowelTest() {
        Path inputFilePath = Paths.get("src", "test", "resources", "practice.io", "text.txt");

        List<String> actual = fileUtil.getWordsStartsWithVowel(inputFilePath);

        Assertions.assertEquals(actual, List.of("ipsum", "amet", "adipiscing", "elit", "iaculis", "in", "eget", "urna",
                "imperdiet", "ante", "ipsum", "elementum", "urna", "enim", "egestas", "eu", "ipsum", "euismod", "id", "ipsum", "ac",
                "elementum", "eu", "Aliquam", "a", "ante", "in", "In", "eget", "id", "imperdiet"));
    }

    @Test
    void getWordsFirstCharEqualLastCharNextWordTest() {
        Path inputFilePath = Paths.get("src", "test", "resources", "practice.io", "text.txt");

        List<String> actual = fileUtil.getWordsFirstCharEqualLastCharNextWord(inputFilePath);

        Assertions.assertEquals(actual, List.of("lectus sed", "tristique euismod", "facilisis sortor",
                "elementum metus", "a ante", "in nulla", "dictum metus"));
    }

    @Test
    void getListOfLargestNumberCombinationTest() {
        Path numbers5FilePath = Path.of("D://IT/Courses IT Academy/course-java-core/src/test/resources/practice.io", "numbers5.txt");

        List<String> actual = fileUtil.getListOfLargestNumberCombination(numbers5FilePath);

        Assertions.assertEquals(actual, List.of("1 3 5 ", "1 2 3 ", "67 68 69 "));
    }

    @Test
    void getAllLettersFrequencyTest() {
        Path inputFilePath = Paths.get("src", "test", "resources", "practice.io", "text.txt");
        String expected = "{a=32, b=6, c=11, d=15, e=53, f=4, g=7, h=1, i=48, l=32, m=26, n=22, o=18, p=15, q=3, r=24, s=35, t=30, u=33, v=7}";

        Map<Character, Integer> actual = fileUtil.getAllLettersFrequency(inputFilePath);

        Assertions.assertEquals(actual.get('d'), 15);
    }

    @Test
    void getWordsFrequencyTest() {
        Path codeFilePath = Paths.get("src", "test", "resources", "practice.io", "javacode.txt");

        Map<String, Integer> actual = fileUtil.getAscendingSortedWordsFrequency(codeFilePath);

        Assertions.assertEquals(actual.get("int"), 3);
        Assertions.assertEquals(actual.get("student"), 1);
    }

    @Test
    void getStudentProgressTest() {
        Path studentsFilePath = Paths.get("src", "test", "resources", "practice.io", "studentsProgress.txt");

        Map<String, Double> actual = fileUtil.getStudentProgress(studentsFilePath);

        Assertions.assertEquals(actual.get("Komleva"), 9.0);
    }
}
