package com.rakovets.course.java.core.practice.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;


public class FileUtilTest {
    FileUtil fileUtil=new FileUtil();

    @BeforeAll
    public void setUp() {

    }


    @Test
    public void testOverwriteFileContentUpperCase (){
        fileUtil.overwriteFileContentUpperCase("file1","file2");
    }

    @Test
    public void testGetListOfString ()  {
        List <String> expected = List.of("Java","Git","Java");

        List<String> actual = fileUtil.getListOfString("file1");

        Assertions.assertEquals(expected,actual);
    }

}
