package com.rakovets.course.java.core.practice.io.project_file_util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

public class DemoTask10 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(DemoTask10.class.getName());
        String pathToJavaFile = "C:\\Users\\андрей\\dev\\course-java-core\\src\\main\\java\\com\\rakovets\\course\\java\\core\\practice\\io\\project_file_util\\MyComparatorTask07.java";
        String pathToModifiedFile = "C:\\Users\\андрей\\dev\\course-java-core\\src\\test\\java\\com\\rakovets\\course\\java\\core\\practice\\io\\MyComparatorTask07.java";
        String modifierOld = "public";
        String modifierNew = "private";
        FileUtil fileUtil = new FileUtil();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathToModifiedFile, false))) {
            bw.write("");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        List<String> listStringsFromJavaFile = fileUtil.getStringListFromFile(pathToJavaFile);
        listStringsFromJavaFile.stream()
                .forEach(x -> {
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathToModifiedFile, true))) {
                        bw.write(x + "\n");
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                });
        fileUtil.convertAccessModifierInJavaFile(modifierOld, modifierNew, pathToModifiedFile);
        List<String> listStringsFromModifiedFile2 = fileUtil.getStringListFromFile(pathToModifiedFile);
        listStringsFromModifiedFile2.stream()
                .forEach(x -> logger.info(x));
    }
}
