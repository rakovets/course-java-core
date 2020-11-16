package com.rakovets.course.javabasics.practice.javaio.fileutil;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {

        //    FileReader reader = new FileReader("text.txt");
        //    int res = reader.read();
        //    while(res != -1 ){
        //        System.out.println((char)res);

        //    }

        String path = "C:\\home\\zmachinsky\\course-java-basics-fork\\src\\Hello.txt";

        System.out.print(FileAnalyzeUtil.getRowsFromFile(path).toString());


    }
}
