package com.rakovets.course.java.core.practice.io.project_file_util;

import java.io.*;
import java.util.logging.Logger;

public class DemoTask01 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(DemoTask01.class.getName());
        String firstFileName = "C:\\MyDir\\task01.txt";
        String secondFileName = "C:\\MyDir\\task01_UpperCase.txt";
        FileUtil fileUtil = new FileUtil();
        fileUtil.fileTextToUpperCase(firstFileName, secondFileName);
        try (BufferedReader br = new BufferedReader(new FileReader("C:/MyDir/task01.txt"))) {
            String s;
            while ((s = br.readLine()) != null) {
                logger.info(s);
            }
        } catch (IOException ex) {
            logger.info(ex.getMessage());
        }
        try (BufferedReader br = new BufferedReader(new FileReader("C:/MyDir/task01_UpperCase.txt"))) {
            String s;
            while ((s = br.readLine()) != null) {
                logger.info(s);
            }
        } catch (IOException ex) {
            logger.info(ex.getMessage());
        }
    }
}
