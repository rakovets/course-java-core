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
        int res = fileReader.read();
        StringBuilder result = new StringBuilder();
        while (res != -1) {
            result.append((char) res);
            res = fileReader.read();
        }
        fileReader.close();
        return result;

    }

    public static StringBuilder getWordsStartWithVowels(String path) throws IOException {

        StringBuilder text = getRowsFromFile(path);
        String stringText= text.toString().replaceAll("\r\n"," ");
        StringBuilder result = new StringBuilder();
        String[] array = stringText.toString().split(" ");// TODO
        String[] ch = {"E", "e", "Y", "y", "U", "u", "I", "i", "O", "o", "A", "a"};
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < ch.length; i++) {
                if (array[j].startsWith(ch[i])) {
                    result.append(array[j] + ",");
                }
            }
        }
        return result;
    }
}