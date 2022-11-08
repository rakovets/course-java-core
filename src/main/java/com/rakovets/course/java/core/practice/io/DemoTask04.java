package com.rakovets.course.java.core.practice.io;

import com.rakovets.course.java.core.practice.io.project_file_util.FileUtil;

import java.io.*;
import java.util.List;
import java.util.logging.Logger;

public class DemoTask04 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(DemoTask04.class.getName());
        FileUtil fileUtil = new FileUtil();
        String pathToFile = "C:\\MyDir\\task04.txt";
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
        List<String> stringList = fileUtil.getStringListOfWordsEndsWithLetterNextWordStatsFromFile(pathToFile);
        logger.info(stringList.toString());
    }
}
