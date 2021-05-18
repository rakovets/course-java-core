package com.rakovets.course.java.core.practice.io.file_analyzer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FileAnalyzeUtil {

    //task 2
    public static List<String> takeFilePathGetListString(Path filePath) {
        List<String> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(filePath)))) {
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                list.add(string);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }

    //task 3
    public static List<String> takeFilePathGetListWordsStartingVowel(Path filePath) {
        List<String> listWord = new ArrayList<>();
        String[] arrayWords = takeFilePathGetListString(filePath).toString()
                .replaceAll("[\\[\\],.!?]", "").split(" ");
        Arrays.stream(arrayWords)
                .filter(x -> x.matches("^[aAeEiIoOuUyY].*"))
                .forEach(listWord::add);
        return listWord;
    }

    //task4
    public static List<String> takeFilePathGetListWordsStartingFirstLetterFollowingWord(Path filePath) {
        List<String> listWords = new ArrayList<>();
        String[] arrayWords = takeFilePathGetListString(filePath).toString()
                .replaceAll("[\\[\\],.!?]", "").split(" ");
        for (int i = 0; i < arrayWords.length - 1; i++) {
            int word = 0;
            word++;
            if (arrayWords[i].charAt(arrayWords[i].length() - 1) == arrayWords[i + 1].charAt(0)) {
                listWords.add(arrayWords[i]);
            }
        }
        return listWords;
    }


}
