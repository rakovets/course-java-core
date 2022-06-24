package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    @Test
    void testJoinTwoStrings() {
        //Given
        StringUtil stringUtil = new StringUtil();
        String expected = "Done";
        //When
        String actual = stringUtil.joinTwoStrings("Do","ne");
        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void  testFindIndex(){
        //Given
        StringUtil stringUtil = new StringUtil();
        int expected = 0;
        //When
        int actual = stringUtil.findIndex("distance","d");
        //Then
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testFindMissingCharIndex () {
        //Given
        StringUtil stringUtil = new StringUtil();
        int expected = -1;
        //When
        int actual = stringUtil.findIndex("distance", "l");
        //Then
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testFindMiddleIndex () {
        //Given
        StringUtil stringUtil = new StringUtil();
        int expected = 4;
        //When
        int actual = stringUtil.findIndex("distance","a");
        //Then
        Assertions.assertEquals(expected, actual);
    }
}
