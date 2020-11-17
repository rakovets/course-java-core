package com.rakovets.course.javabasics.practice.javaio.fileutil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileAnalyzeUtil {
    private File file;

    public FileAnalyzeUtil(File file) {
        this.file = file;
    }

    public static StringBuilder getRowsFromFile(String path) throws IOException {

        BufferedReader fileReader = new BufferedReader(new FileReader(path));
        String res;
        StringBuilder result = new StringBuilder();
        while ((res = fileReader.readLine()) != null) {
            result.append(res + "\n");
        }
        fileReader.close();
        return result;
    }

    public static StringBuilder getWordsStartWithVowels(String path) throws IOException {

        String stringText = getRowsFromFile(path).toString();
        StringBuilder result = new StringBuilder();
        String[] array = stringText.split("[^a-zA-Z]+");
        String[] ch = {"E", "e", "Y", "y", "U", "u", "I", "i", "O", "o", "A", "a"};
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < ch.length; i++) {
                if (array[j].startsWith(ch[i])) {
                    result.append(array[j] + " ");
                }
            }
        }
        return result;
    }

    public static StringBuilder getWordsLastFirstEquals(String path) throws IOException {

        String stringText = getRowsFromFile(path).toString();
        StringBuilder result = new StringBuilder();
        String[] array = stringText.split("[^a-zA-Z]+");
        for (int i = 0; i < array.length - 1; i++) {
            String firstSimbol = String.valueOf(array[i + 1].charAt(0));
            if (array[i].endsWith(firstSimbol)) {
                result.append(array[i] + " ");
            }
        }
        return result;
    }
}
