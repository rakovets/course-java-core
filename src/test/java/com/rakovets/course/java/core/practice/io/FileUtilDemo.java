package com.rakovets.course.java.core.practice.io;

import java.io.IOException;

public class FileUtilDemo {
    public static void main(String[] args) throws IOException {
        FileUtil fileUtil = new FileUtil();
        fileUtil.fileContentToUppercase("E:\\dev\\course-java-core\\src\\main\\java\\com\\rakovets\\course\\java\\core\\practice\\io\\txt_files\\read.txt", "E:\\dev\\course-java-core\\src\\main\\java\\com\\rakovets\\course\\java\\core\\practice\\io\\txt_files\\outputUpperCase.txt");
    }
}
