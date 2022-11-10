package com.rakovets.course.java.core.practice.io.project_file_util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

public class DemoTask09 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(DemoTask09.class.getName());
        String pathToFile = "C:\\MyDir\\task09.txt";
        String text1 = "Ivanov,4,5,4,5\n";
        String text2 = "Petrov,6,5,5,6\n";
        String text3 = "Sidorov,6,6,7,7\n";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathToFile))) {
            bw.write(text1);
            bw.write(text2);
            bw.write(text3);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        FileUtil fileUtil = new FileUtil();
        List<String> listNamesAndAverageMarks = fileUtil.getNameAndAverageMarksFromFile(pathToFile);
        listNamesAndAverageMarks.stream()
                .forEach(x -> logger.info(x));
    }
}
