package com.rakovets.course.javabasics.practice.javaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileAnalyzeUtil {
    public static void main(String[] args) throws FileNotFoundException {
//        FileInputStream fileInputStream = new FileInputStream("c:\\readme.txt"); //Для считывания данных из файла предназначен класс FileInputStream
//        String res = bufferedreader.readline();
//        while ( res != null) {
//            System.out.println(res);
//            res = bufferedReader.readline();
//        }
        try (FileInputStream fin = new FileInputStream("c:\\\\readme.txt")) {
            System.out.printf("File size: %d bytes \n", fin.available());
            int i = -1;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        }
//        Files.createFile(Path.of("c:\\readme.txt"));
//        Path path = Path.of("c:\\readme.txt");
//        List<String> list = Files.readAllLines(path);
//        for(String str: list)
//            System.out.println(str);
    }

