package com.rakovets.course.java.core.practice.io.FileAnalyzer;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class FileAnalyzeUtilTest {

    @Test
    void myList() {
        String filePath = "src/main/resources/FileAnalyzer/myList.txt";
        assertEquals(Collections.singletonList("public and static List the String getMyList String filePath throws " +
                "IOException"), FileAnalyzeUtil.myList(filePath));
    }

    @Test
    void listWordsStartWithVowel() {
        String filePath = "src/main/resources/FileAnalyzer/myList.txt";
        assertEquals(Arrays.asList("and", "IOException"), FileAnalyzeUtil.listWordsStartWithVowel(filePath));
    }

    @Test
    void wordsWithEqualFirstAndLastLetter() {
        String filePath = "src/main/resources/FileAnalyzer/myList.txt";
        assertEquals(Arrays.asList("List", "String"), FileAnalyzeUtil.wordsWithEqualFirstAndLastLetter(filePath));
    }

    @Test
    void listOfLargestNumberCombination() {
        String filePath = "src/main/resources/FileAnalyzer/myListInt.txt";
        assertEquals(Arrays.asList("1", "11", "22", "25"), FileAnalyzeUtil.listOfLargestNumberCombination(filePath));
    }

    @Test
    void frequencyOfRepetition() {
        String filePath = "src/main/resources/FileAnalyzer/myList.txt";
        assertEquals(Arrays.asList("a-3", "b-1", "c-3", "d-1", "e-5", "f-1", "g-3", "h-3", "i-9", "l-4",
                "m-1", "n-4", "o-3", "p-3", "r-3", "s-6", "t-11", "u-1", "w-1", "x-1", "y-1"),
                FileAnalyzeUtil.frequencyOfRepetition(filePath));
    }

    @Test
    void frequencyOfWordsAscendingOrder() {
        String filePath = "src/main/resources/FileAnalyzer/myList.txt";
        assertEquals(Arrays.asList("1-IOException", "1-List", "1-and", "1-filePath", "1-getMyList", "1-public",
                "1-static", "1-the", "1-throws", "2-String"),
                FileAnalyzeUtil.frequencyOfWordsAscendingOrder(filePath));
    }

    @Test
    void sortInAscendingOrder() {
        String filePath = "src/main/resources/FileAnalyzer/myListInt.txt";
        assertEquals(Arrays.asList(1, 3, 3, 5, 6, 6, 9, 9, 11, 15, 22, 25),
                FileAnalyzeUtil.sortInAscendingOrder(filePath));
    }

    @Test
    void studentProgress() {
        String filePath = "src/main/resources/FileAnalyzer/students.txt";
        Map<String, Double> map = new HashMap<>();
        map.put("Student3", 5.8);
        map.put("Student4", 5.4);
        map.put("Student5", 8.0);
        map.put("Student1", 7.6);
        map.put("Student2", 4.2);
        assertEquals(map, FileAnalyzeUtil.studentProgress(filePath));
    }

    @Test
    void replaceAccessModifiers() {
        String filePath = "src/main/resources/FileAnalyzer/modification.txt";
        FileAnalyzeUtil.replaceAccessModifiers(filePath, "private", "public");
    }
}
