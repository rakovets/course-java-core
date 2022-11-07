package com.rakovets.course.java.core.practice.io.project_file_util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    public boolean fileTextToUpperCase(String fileNameFirst, String fileNameSecond) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileNameFirst));
             BufferedWriter bw = new BufferedWriter(new FileWriter(fileNameSecond))) {
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
                bw.write(s.toUpperCase());
                System.out.println(s.toUpperCase());
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }

    public List<String> getStringListFromFile(String pathToFile) {
        List<String> stringList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathToFile))) {
            String s;
            while ((s = br.readLine()) != null) {
                stringList.add(s);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return stringList;
    }
}
