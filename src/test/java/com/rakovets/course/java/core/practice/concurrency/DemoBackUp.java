package com.rakovets.course.java.core.practice.concurrency;

import java.io.File;
import java.io.IOException;

public class DemoBackUp {
    public static void main(String[] args) throws IOException {
            String dirLocation = "D:\\JAVA\\dev\\first program\\course-java-core\\src\\test\\resources\\test";
            String dirBackUpLocation = "D:\\JAVA\\dev\\first program\\course-java-core\\src\\test\\resources\\backUpTest";
            File dir = new File(dirLocation);
            File backUpDir = new File(dirBackUpLocation);
            BackUpUtil.copy(dir, backUpDir);
    }
}
