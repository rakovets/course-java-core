package com.rakovets.course.java.core.practice.io;

import java.io.IOException;
import java.nio.file.Path;

public class FileUtilDemo {
    public static void main(String[] args) throws IOException {
        FileUtil fileUtil = new FileUtil();
        Path inputFilePath = Path.of("txt_resources", "read_text.txt");
        Path outputFilePath = Path.of("txt_resources", "outputUpperCase.txt");
        Path inputNumbersFilePath = Path.of("txt_resources", "read_number.txt");


//        fileUtil.fileContentToUppercase(inputFilePath, outputFilePath);
//
//        System.out.println(fileUtil.getListOfString(inputFilePath));
//        System.out.println(fileUtil.getWordsStartingWithVowel(inputFilePath));
//        System.out.println(fileUtil.getWordsFirstCharEqualLastCharNextWord(inputFilePath));

        System.out.println(fileUtil.getSortedNumbers(inputNumbersFilePath));

    }
}
