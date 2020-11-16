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

    public static StringBuilder getWordsStartWhithVowels(String path) throws IOException {

        StringBuilder text = getRowsFromFile(path);
        char[] ch  = {'E','e','Y','y','U','u','I','i','O','o','A','a'};
        for (int i = 0; i < text.length(); i++){

        }
        return text;

    }
}
