package com.rakovets.course.java.core.practice.io.project_file_util;

import java.io.*;
import java.util.List;
import java.util.logging.Logger;

public class DemoTask05 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(DemoTask05.class.getName());
        String pathToFile = "C:\\MyDir\\task05.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathToFile))) {
            String text1 = "1 2 1 66 2 3\n";
            String text2 = "67 68 69 23 101 1\n";
            bw.write(text1);
            bw.write(text2);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        FileUtil fileUtil = new FileUtil();
        List<String> stringList = fileUtil.getOnlyIncreasingValuesfromFile(pathToFile);
        logger.info(stringList.toString());
    }
}
