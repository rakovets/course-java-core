package com.rakovets.course.java.core.practice.io;

import java.io.File;

public class FileRewriteDemo {
    public static void main(String[]args){
        FileUtil fileUtil=new FileUtil();
        fileUtil.rewriteSortedNumbersFromFileTo("files" + File.separator+"numbers",
                "files" + File.separator+"text");
    }
}
