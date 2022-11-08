package com.rakovets.course.java.core.practice.io.project_file_util;

import java.io.*;
import java.util.Map;
import java.util.logging.Logger;

public class DemoTask06 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(DemoTask06.class.getName());
        String pathToFile = "C:\\MyDir\\task06.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathToFile))) {
            String text1 = "Any yo any.    text 1.\n";
            String text2 = "ooy ide? ust text 2.\n";
            String text3 = "gy ako   op text 3.\n";
            bw.write(text1);
            bw.write(text2);
            bw.write(text3);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        FileUtil fileUtil1 = new FileUtil();
        Map<Character, Integer> uniqueLetters = fileUtil1.getUniqueLettersFromFileAndCountThem(pathToFile);
        logger.info(uniqueLetters.toString());
        logger.info(uniqueLetters.entrySet().toString());
    }
}
