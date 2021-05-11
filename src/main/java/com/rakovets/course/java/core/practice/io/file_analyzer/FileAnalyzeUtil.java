package com.rakovets.course.java.core.practice.io.file_analyzer;
import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileAnalyzeUtil {
    public static List<String> getListLines(Path filePath) {
        List<String> list = new ArrayList<>();
        String tempString;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(filePath)))) {
            while ((tempString = bufferedReader.readLine()) != null) {
                list.add(tempString);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }


}
