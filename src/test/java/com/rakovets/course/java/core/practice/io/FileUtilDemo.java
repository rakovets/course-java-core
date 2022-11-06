package com.rakovets.course.java.core.practice.io;

public class FileUtilDemo {
    public static String fileInput = "src/test/java/com/rakovets/course/java/core/practice/io/testInput.txt";
    public static String fileWithNumbers = "src/test/java/com/rakovets/course/java/core/practice/io/numbers.txt";
    public static String fileOutput = "src/test/java/com/rakovets/course/java/core/practice/io/testOutput.txt";
    public static String fileStudents = "src/test/java/com/rakovets/course/java/core/practice/io/testStudents.txt";
    public static String fileJavaCode = "src/test/java/com/rakovets/course/java/core/practice/io/fileJavaCode.txt";
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
