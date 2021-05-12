package com.rakovets.course.java.core.practice.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileAnalyzeUtilDemo {
    public static void main(String[] args) {

        Path path2 = Paths.get("src","main","resources","practice","text","task2");
        Path path3 = Paths.get("src","main","resources","practice","text","task3");
        Path path4 = Paths.get("src","main","resources","practice","text","task4");
        Path path6 = Paths.get("src","main","resources","practice","text","task6");
        Path path7 = Paths.get("src","main","resources","practice","text","task7");
        Path path8 = Paths.get("src","main","resources","practice","text","task8");
        Path path9 = Paths.get("src","main","resources","practice","text","task9");
        Path path10 = Paths.get("src","main","resources","practice","text","task10");
        try {
        System.out.println(FileAnalyzeUtil.showStringsOfFile(path2));
        System.out.println(FileAnalyzeUtil.showWordsStartsWithVowel(path3));
        System.out.println(FileAnalyzeUtil.showWordsWhichStartsWithFirstCharOfLastWord(path4));
        System.out.println(FileAnalyzeUtil.showCharFrequency(path6));
        System.out.println(FileAnalyzeUtil.showWordsFrequency(path7));
        System.out.println(FileAnalyzeUtil.averageMarkOfStudents(path9));
        FileAnalyzeUtil.writeSortNumToFile(path8);
        FileAnalyzeUtil.changeModifier(path10.toString(),"private","public");


    }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
