package com.rakovets.course.java.core.practice.io.project_file_util;

import java.io.*;
import java.util.List;
import java.util.logging.Logger;

public class DemoTask05 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(DemoTask05.class.getName());
        String pathToFile = "C:\\MyDir\\task05.txt";
        String text1 = "1   г2 r1 66 vv2 3\n";
        String text2 = "67 ф68 v v 69 23  e101 1\n";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathToFile))) {
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
