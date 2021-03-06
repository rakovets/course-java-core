package com.rakovets.course.java.core.practice.io.file_analyzer;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class FileAnalyzeUtilTest {

    @Test
    void myList() {
        Path filePath = Paths.get("src", "main", "resources", "file_analyzer", "myList.txt");
        List<String> list = Collections.singletonList(
                "public and static List the String getMyList String filePath throws IOException");
        assertEquals(list, FileAnalyzeUtil.myList(filePath, Task.GET_MY_LIST));
    }

    @Test
    void listWordsStartWithVowel() {
        Path filePath = Paths.get("src", "main", "resources", "file_analyzer", "myList.txt");
        List<String> list = Arrays.asList("and", "IOException");
        assertEquals(list, FileAnalyzeUtil.myList(filePath, Task.LIST_WORDS_START_WITH_VOWEL));
    }

    @Test
    void wordsWithEqualFirstAndLastLetter() {
        Path filePath = Paths.get("src", "main", "resources", "file_analyzer", "myList.txt");
        List<String> list = Arrays.asList("List", "String");
        assertEquals(list, FileAnalyzeUtil.myList(filePath, Task.WORDS_WITH_EQUAL_FIRST_AND_LAST_LETTER));
    }

    @Test
    void listOfLargestNumberCombination() {
        Path filePath = Paths.get("src", "main", "resources", "file_analyzer", "numbers.txt");
        List<String> list = Collections.singletonList("1 11 22");
        assertEquals(list, FileAnalyzeUtil.myList(filePath, Task.LIST_OF_LARGEST_NUMBER_COMBINATION));
    }

    @Test
    void frequencyOfRepetition() {
        Path filePath = Paths.get("src", "main", "resources", "file_analyzer", "myList.txt");
        List<String> list = Arrays.asList("a-3", "b-1", "c-3", "d-1", "e-5", "f-1", "g-3", "h-3", "i-9", "l-4", "m-1",
                "n-4", "o-3", "p-3", "r-3", "s-6", "t-11", "u-1", "w-1", "x-1", "y-1");
        assertEquals(list, FileAnalyzeUtil.getList(filePath, Task.FREQUENCY_OF_REPETITION));
    }

    @Test
    void frequencyOfWordsAscendingOrder() {
        Path filePath = Paths.get("src", "main", "resources", "file_analyzer", "myList.txt");
        List<String> list = Arrays.asList("1-IOException", "1-List", "1-and", "1-filePath", "1-getMyList",
                "1-public", "1-static", "1-the", "1-throws", "2-String");
        assertEquals(list, FileAnalyzeUtil.getList(filePath, Task.FREQUENCY_OF_WORDS_ASCENDING_ORDER));
    }

    @Test
    void sortInAscendingOrder() {
        Path filePath = Paths.get("src", "main", "resources", "file_analyzer", "myListInt.txt");
        List<String> list = Arrays.asList("1", "3", "3", "5", "6", "6", "9", "9", "11", "15", "22", "25");
        assertEquals(list, FileAnalyzeUtil.getList(filePath, Task.SORT_IN_ASCENDING_ORDER));
    }

    @Test
    void studentProgress() {
        Path filePath = Paths.get("src", "main", "resources", "file_analyzer", "students.txt");
        assertEquals(6.2, FileAnalyzeUtil.studentProgress(filePath));
    }

    @Test
    void replaceAccessModifiers() {
        String filePath = "src/main/resources/FileAnalyzer/modification.txt";
        FileAnalyzeUtil.replaceAccessModifiers(filePath, "private", "public");
    }
}
