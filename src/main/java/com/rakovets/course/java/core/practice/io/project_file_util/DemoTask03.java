package com.rakovets.course.java.core.practice.io.project_file_util;

import java.io.*;
import java.util.List;
import java.util.logging.Logger;

public class DemoTask03 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(DemoTask03.class.getName());
        FileUtil fileUtil = new FileUtil();
        String pathToFile = "C:\\MyDir\\task03.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathToFile))) {
            String text1 = "Any to any text 1.\n";
            String text2 = "ooy ide usw text 2.\n";
            String text3 = "gy ak op text 3.\n";
            bw.write(text1);
            bw.write(text2);
            bw.write(text3);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        List<String> stringList = fileUtil.getStringListOfWordsStartingWithVowelsFromFile(pathToFile);
        logger.info(stringList.toString());
    }
}
