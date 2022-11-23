package com.rakovets.course.java.core.practice.concurrency;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class DemoBackUp {
    public static void main(String[] args) throws IOException {
            Path dirLocation = Path.of("src","test","resources","test");
            Path dirBackUpLocation =  Path.of("src","test","resources", "backUpTest");
            File dir = new File(dirLocation.toUri());
            File backUpDir = new File(dirBackUpLocation.toUri());
            BackUpUtil.copy(dir, backUpDir);
    }
}
