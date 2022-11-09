package com.rakovets.course.java.core.practice.io.project_file_util;

import java.io.*;
import java.util.*;
import java.util.logging.Logger;

public class DemoTask07 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(DemoTask07.class.getName());
        String pathToFile = "C:\\MyDir\\task07.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathToFile))) {
            String text1 = "Any yo any.    text 1.\n";
            String text2 = "ooy ide? ust text 2.\n";
            String text3 = "gy ako  any op text 3.\n";
            bw.write(text1);
            bw.write(text2);
            bw.write(text3);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        FileUtil fileUtil = new FileUtil();
        Map uniqueWordsFrequency = fileUtil.getFrequencyOfUniqueWordsFromFile(pathToFile);
        logger.info(uniqueWordsFrequency.entrySet().toString());
    }
}
