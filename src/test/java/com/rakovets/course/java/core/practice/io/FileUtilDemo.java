package com.rakovets.course.java.core.practice.io;

import java.nio.file.Path;

public class FileUtilDemo {
    public static Path fileInput = Path.of("D:\\OKomlik\\course-java-core\\src\\test\\resources\\practice.io\\testInput.txt");
    public static Path fileWithNumbers = Path.of("D:\\OKomlik\\course-java-core\\src\\test\\resources\\practice.io\\numbers.txt");
    public static Path fileOutput = Path.of("D:\\OKomlik\\course-java-core\\src\\test\\resources\\practice.io\\testOutput.txt");
    public static Path fileStudents = Path.of("D:\\OKomlik\\course-java-core\\src\\test\\resources\\practice.io\\testStudents.txt");
    public static Path fileJavaCode = Path.of("D:\\OKomlik\\course-java-core\\src\\test\\resources\\practice.io\\fileJavaCode.txt");
    public static String modifier = "public";
    public static String changeModifier = "private";

    public static void main(String[] args) {
        FileUtil testFile = new FileUtil();
        testFile.copyToUpperCase(fileInput, fileOutput);
        System.out.println(testFile.getLinesFromFile(fileInput));
        System.out.println(testFile.getWordsStartsWithVowel(fileInput));
        System.out.println(testFile.getWordsEndWithSameLetterNextWordStartWith(fileInput));
        System.out.println(testFile.getNumberCombination(fileWithNumbers));
        System.out.println(testFile.getLetterFrequency(fileInput));
        System.out.println(testFile.getWordFrequency(fileInput));
        testFile.sortAndCopy(fileWithNumbers, fileOutput);
        System.out.println(testFile.getAverageMark(fileStudents));
        testFile.changeAccessModifier(fileJavaCode, fileOutput, modifier, changeModifier);
    }
}
