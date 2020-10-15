package com.rakovets.course.javabasics.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

   @Test
    void getUpperCaseTest(){
       StringUtils stringUtTest = new StringUtils();
        Assertions.assertEquals("QWERTY", stringUtTest.getUpperCase("qwerty"));
        Assertions.assertEquals("QWERT Y", stringUtTest.getUpperCase("qwert y"));
//        Assertions.assertEquals("QWERTY", stringUtTest.getUpperCase("qwerty"));
//        Assertions.assertEquals("QWERTY", stringUtTest.getUpperCase("qwerty"));
//        Assertions.assertEquals("QWERTY", stringUtTest.getUpperCase("qwerty"));


    }
}
