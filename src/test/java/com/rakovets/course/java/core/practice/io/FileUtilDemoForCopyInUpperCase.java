package com.rakovets.course.java.core.practice.io;

import com.rakovets.course.java.core.practice.io.project_file_util.FileUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.logging.Logger;

public class FileUtilDemoForCopyInUpperCase {
    private static final Logger LOG = Logger.getLogger(FileUtilDemoForCopyInUpperCase.class.getName());
    private static final String SOURCE_FILENAME = Paths.get("src", "test", "resources", "practice.io", "task01.txt").toString();
    private static final String TARGET_FILENAME = "./src/test/resources/practice.io/task01.txt_";

    public static void main(String[] args) {
        FileUtil fileUtil = new FileUtil();

        fileUtil.copyInUpperCase(SOURCE_FILENAME, TARGET_FILENAME);

        printResultToStandardOutput(SOURCE_FILENAME, TARGET_FILENAME);
    }

    private static void printResultToStandardOutput(String firstFileName, String secondFileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(firstFileName))) {
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException ex) {
            LOG.info(ex.getMessage());
        }
        System.out.println("\n----\n");

        try (BufferedReader br = new BufferedReader(new FileReader(secondFileName))) {
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException ex) {
            LOG.info(ex.getMessage());
        }
    }
}
