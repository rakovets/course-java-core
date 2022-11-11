package com.rakovets.course.java.core.practice.io;

import com.rakovets.course.java.core.practice.io.project_file_util.FileUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

public class Task10Test {
    FileUtil fileUtil = new FileUtil();
    Logger logger = Logger.getLogger(Task10Test.class.getName());

    @Test
    public void testConvertAccessModifierInJavaFile() {
        String pathToJavaFile = "C:\\Users\\андрей\\dev\\course-java-core\\src\\main\\java\\com\\rakovets\\course\\java\\core\\practice\\io\\project_file_util\\MyComparatorTask07.java";
        String pathToModifiedFile = "C:\\Users\\андрей\\dev\\course-java-core\\src\\test\\resources\\practice.io\\MyComparatorTask07.java";
        String pathToByHandModifiedFile = "C:\\Users\\андрей\\dev\\course-java-core\\src\\test\\resources\\practice.io\\MyComparatorTask07_byHand.java";
        String modifierOld = "public";
        String modifierNew = "private";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathToModifiedFile, false))) {
            bw.write("");
        } catch (IOException ex) {
            logger.info(ex.getMessage());
        }
        List<String> listCopyToModifiedFile = fileUtil.getStringListFromFile(pathToJavaFile);
        listCopyToModifiedFile.stream()
                .forEach(x -> {
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathToModifiedFile, true))) {
                        bw.write(x + "\n");
                    } catch (IOException ex) {
                        logger.info(ex.getMessage());
                    }
                });
        fileUtil.convertAccessModifierInJavaFile(modifierOld, modifierNew, pathToModifiedFile);
        List<String> listFromModifiedFile = fileUtil.getStringListFromFile(pathToModifiedFile);
        List<String> listFromByHandModifiedFile = fileUtil.getStringListFromFile(pathToByHandModifiedFile);
        String[] arrayActual = new String[listFromModifiedFile.size()];
        listFromModifiedFile.toArray(arrayActual);
        String actual = String.join("WWW", arrayActual);
        String[] arrayExpected = new String[listFromByHandModifiedFile.size()];
        listFromModifiedFile.toArray(arrayExpected);
        String expected = String.join("WWW", arrayExpected);

        Assertions.assertEquals(expected, actual);
    }
}
