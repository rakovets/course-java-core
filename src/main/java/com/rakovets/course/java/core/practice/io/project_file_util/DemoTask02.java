package com.rakovets.course.java.core.practice.io.project_file_util;

import java.io.*;
import java.util.List;
import java.util.logging.Logger;

public class DemoTask02 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(DemoTask02.class.getName());
        String pathToFile = "C:\\MyDir\\task02.txt";
        String text1 = "Text 1.\n";
        String text2 = "Text 2.\n";
        String text3 = "Text 3.\n";
        FileUtil fileUtil = new FileUtil();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:/MyDir/task02.txt"))) {
            bw.write(text1);
            bw.write(text2);
            bw.write(text3);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        List<String> stringList = fileUtil.getStringListFromFile("C:/MyDir/task02.txt");
        stringList.stream()
                .forEach(x -> logger.info(x));
    }
}
