package com.rakovets.course.java.core.practice.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class FileUtilTest {
    FileUtil fileUtil = new FileUtil();

    static String path = "src" + File.separator
            + "test" + File.separator
            + "resources" + File.separator
            + "practice.io" + File.separator;

    static Stream<Arguments> provideArgumentsOfUpperCaseConversion() {
        return Stream.of(
                Arguments.of(Path.of(path, "NormalText.txt"),
                        Path.of(path, "UpperCaseText.txt"),
                        "ONE, EAT YOUR BUN!\n" +
                        "TWO, LOOK AT THE KANGAROO!\n" +
                        "THREE, LOOK AT THE BEE!\n" +
                        "FOUR, OPEN THE DOOR!\n" +
                        "FIVE, TAKE THE KNIFE!\n" +
                        "SIX, TAKE THE STICKS!\n" +
                        "SEVEN, COUNT TO ELEVEN!\n" +
                        "EIGHT, STOP AND WAIT!\n" +
                        "NINE, YOU ARE FINE!\n" +
                        "TEN, SAY IT ALL AGAIN!\n" +
                        "ELEVEN AND TWELVE, WE ARE VERY WELL!")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsOfUpperCaseConversion")
    void testUpperCaseConversion(Path reader, Path writer, String expected) throws IOException {
        fileUtil.upperCaseConversion(reader, writer);

        String actual = String.join("\n", Files.readAllLines(writer));

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetRowList() {
        return Stream.of(
                Arguments.of(Path.of(path, "NormalText.txt"),
                        List.of("One, eat your bun!", "Two, look at the kangaroo!",
                                "Three, look at the bee!", "Four, open the door!",
                                "Five, take the knife!", "Six, take the sticks!",
                                "Seven, count to eleven!", "Eight, stop and wait!",
                                "Nine, you are fine!", "Ten, say it all again!",
                                "Eleven and twelve, we are very well!"))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetRowList")
    void testGetRowList(Path reader, List<String> expected) {
        List<String> actual = fileUtil.getRowList(reader);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetListWordsFirstVowel() {
        return Stream.of(
                Arguments.of(Path.of(path, "NormalText.txt"),
                        List.of("One", "eat", "your", "at", "at", "open", "eleven",
                                "Eight", "and", "you", "are", "it", "all", "again", "Eleven",
                                "and", "are")
                )
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetListWordsFirstVowel")
    void testGetListWordsFirstVowel(Path reader, List<String> expected) {
        List<String> actual = fileUtil.getListWordsFirstVowel(reader);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetListWordsLastLetterWordCoincidesFirstLetterNextWord() {
        return Stream.of(
                Arguments.of(Path.of(path, "NormalText.txt"),
                        List.of("One", "at", "at", "sticks", "count", "well"))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetListWordsLastLetterWordCoincidesFirstLetterNextWord")
    void testGetListWordsLastLetterWordCoincidesFirstLetterNextWord(Path reader, List<String> expected) {
        List<String> actual = fileUtil.getListWordsLastLetterWordCoincidesFirstLetterNextWord(reader);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetListGreatestCombinationNumbersAscendingOrder() {
        return Stream.of(
                Arguments.of(Path.of(path, "Numbers.txt"),
                        List.of("1 2 3 43", "3 22 23", "1 2 3 4 5"))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetListGreatestCombinationNumbersAscendingOrder")
    void testGetListGreatestCombinationNumbersAscendingOrder(Path reader, List<String> expected) {
        List<String> actual = fileUtil.getListGreatestCombinationNumbersAscendingOrder(reader);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetRepetitionRateLetterInTextIgnoreCase() {
        return Stream.of(
                Arguments.of(Path.of(path, "NormalText.txt"),
                        Map.ofEntries(
                                Map.entry('a', 16), Map.entry('b', 2),
                                Map.entry('c', 2), Map.entry('d', 3),
                                Map.entry('e', 35), Map.entry('f', 4),
                                Map.entry('g', 3), Map.entry('h', 7),
                                Map.entry('i', 10), Map.entry('k', 7),
                                Map.entry('l', 9), Map.entry('n', 16),
                                Map.entry('o', 17), Map.entry('p', 2),
                                Map.entry('r', 8), Map.entry('s', 6),
                                Map.entry('t', 21), Map.entry('u', 5),
                                Map.entry('v', 6), Map.entry('w', 5),
                                Map.entry('x', 1), Map.entry('y', 4)))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetRepetitionRateLetterInTextIgnoreCase")
    void testGetRepetitionRateLetterInTextIgnoreCase(Path reader, Map<Character, Integer> expected) {
        Map<Character, Integer> actual = fileUtil.getRepetitionRateLetterInTextIgnoreCase(reader);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetRepetitionRateWordsInText() {
        return Stream.of(
                Arguments.of(Path.of(path, "NormalText.txt"),
                        Map.ofEntries(
                                Map.entry("door", 1), Map.entry("nine", 1),
                                Map.entry("very", 1), Map.entry("wait", 1),
                                Map.entry("bee", 1), Map.entry("kangaroo", 1),
                                Map.entry("seven", 1), Map.entry("your", 1),
                                Map.entry("two", 1), Map.entry("three", 1),
                                Map.entry("we", 1), Map.entry("eight", 1),
                                Map.entry("fine", 1), Map.entry("four", 1),
                                Map.entry("eat", 1), Map.entry("ten", 1),
                                Map.entry("five", 1), Map.entry("you", 1),
                                Map.entry("all", 1), Map.entry("six", 1),
                                Map.entry("one", 1), Map.entry("again", 1),
                                Map.entry("count", 1), Map.entry("say", 1),
                                Map.entry("it", 1), Map.entry("knife", 1),
                                Map.entry("sticks", 1), Map.entry("stop", 1),
                                Map.entry("twelve", 1), Map.entry("well", 1),
                                Map.entry("bun", 1), Map.entry("to", 1),
                                Map.entry("open", 1), Map.entry("are", 2),
                                Map.entry("and", 2), Map.entry("look", 2),
                                Map.entry("take", 2), Map.entry("at", 2),
                                Map.entry("eleven", 2), Map.entry("the", 5)))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetRepetitionRateWordsInText")
    void testGetRepetitionRateWordsInText(Path reader, Map<String, Integer> expected) {
        Map<String, Integer> actual = fileUtil.getRepetitionRateWordsInText(reader);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForSortedNumbersInFile() {
        return Stream.of(
                Arguments.of(Path.of(path, "Numbers.txt"),
                        "[1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 5, 6, 12, 12, 22, 23, 34, 35, 43]")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForSortedNumbersInFile")
    void testSortedNumbersInFile(Path reader, String expected) throws IOException {
        fileUtil.sortedNumbersInFile(reader);

        String actual = String.join("", Files.readAllLines(Path.of(path, "Numbers.txt_")));

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetStudentsPerformance() {
        return Stream.of(
                Arguments.of(Path.of(path, "MarksLog.txt"),
                        Map.of("Smirnov", 8.5, "Petrov", 4.625,
                                "Voronoy", 3.75, "Ivanov", 5.125))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetStudentsPerformance")
    void testGetStudentsPerformance(Path reader, Map<String, Double> expected) {
        Map<String, Double> actual = fileUtil.getStudentsPerformance(reader);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForCodeEditor() {
        return Stream.of(
                Arguments.of(Path.of(path, "JavaCode.java"), "public", "private",
                        "public class FileUtil {\n" +
                        "    private void upperCaseConversion(Path fileReader, Path fileWriter) {\n" +
                        "        try (BufferedReader fileRead = new BufferedReader(new FileReader(fileReader.toFile()));\n" +
                        "             BufferedWriter fileWrite = new BufferedWriter(new FileWriter(fileWriter.toFile()))) {\n" +
                        "            String str;\n" +
                        "            while ((str = fileRead.readLine()) != null) {\n" +
                        "                fileWrite.write(str.toUpperCase());\n" +
                        "                fileWrite.newLine();\n" +
                        "            }\n" +
                        "        } catch (IOException e) {\n" +
                        "            e.printStackTrace();\n" +
                        "        }\n" +
                        "    }\n" +
                        "\n" +
                        "    private List<String> getRowListt(Path fileReader) {\n" +
                        "        List<String> rowList = new ArrayList<>();\n" +
                        "        try (BufferedReader fileRead = new BufferedReader(new FileReader(fileReader.toFile()))) {\n" +
                        "            String str;\n" +
                        "            while ((str = fileRead.readLine()) != null) {\n" +
                        "                rowList.add(str);\n" +
                        "            }\n" +
                        "        } catch (IOException e) {\n" +
                        "            e.printStackTrace();\n" +
                        "        }\n" +
                        "        return rowList;\n" +
                        "    }\n" +
                        "\n" +
                        "    private List<String> getListWordsFirstVowell(Path fileReader) {\n" +
                        "        List<String> list = new ArrayList<>();\n" +
                        "        try (BufferedReader fileRead = new BufferedReader(new FileReader(fileReader.toFile()))) {\n" +
                        "            String str;\n" +
                        "            while ((str = fileRead.readLine()) != null) {\n" +
                        "                Arrays.stream(str.split(\"(\\\\W+)\"))\n" +
                        "                        .filter(i -> i.substring(0, 1).matches(\"(?i:[aeiouy])\"))\n" +
                        "                        .forEach(list::add);\n" +
                        "            }\n" +
                        "        } catch (IOException e) {\n" +
                        "            e.printStackTrace();\n" +
                        "        }\n" +
                        "        return list;\n" +
                        "    }")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForCodeEditor")
    void testCodeEditor(Path reader, String modifierBefore, String modifierAfter, String expected) throws IOException {
        fileUtil.codeEditor(reader, modifierBefore, modifierAfter);

        String actual = String.join("\n", Files.readAllLines(Path.of(path, "JavaCode.java_")));

        Assertions.assertEquals(expected, actual);
    }
}
